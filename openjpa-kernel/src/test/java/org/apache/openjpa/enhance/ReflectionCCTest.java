package org.apache.openjpa.enhance;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.apache.openjpa.util.GeneralException;
import org.apache.openjpa.util.UserException;
import org.junit.Test;

public class ReflectionCCTest {

    // 1. Copre ramo: get<prop> (senza capitalizzazione)
    public static class BeanLowerGetter {
        public int getvalue() { return 1; }
    }

    // 2. Copre ramo: is<prop> (senza capitalizzazione) con ritorno boolean
    public static class BeanLowerBoolean {
        public boolean isvalue() { return true; }
    }

    // 3. Copre ramo: is<Prop> con ritorno tipo non booleano
    public static class BeanIsWrongReturn {
        private String value;
        public String isValue() { return "not boolean"; }
        public int getValue() { return 42; } // fallback valido
    }

    // 4. Copre ramo: is<prop> con ritorno Boolean.class
    public static class BeanLowerBooleanObject {
        private Boolean value;
        public Boolean isValue() { return Boolean.TRUE; }
    }

    @Test
    public void testGetterGetLowercaseProp() {
        Method m = Reflection.findGetter(BeanLowerGetter.class, "value", true);
        assertEquals("getvalue", m.getName());
    }

    @Test
    public void testGetterIsLowercaseBoolean() {
        Method m = Reflection.findGetter(BeanLowerBoolean.class, "value", true);
        assertEquals("isvalue", m.getName());
    }

    @Test
    public void testGetterIsWrongReturnFallbacksToGetValue() {
        Method m = Reflection.findGetter(BeanIsWrongReturn.class, "value", true);
        assertEquals("getValue", m.getName());
    }

    @Test
    public void testGetterIsLowercaseBooleanObject() {
        Method m = Reflection.findGetter(BeanLowerBooleanObject.class, "value", true);
        assertEquals("isValue", m.getName());
    }



    public static class SuperClass {
        private String value;
        private boolean second;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public boolean isSecond() {
            return second;
        }

        public void setSecond(boolean second) {
            this.second = second;
        }
    }

    public static class SimpleClass extends SuperClass {
        // No new setters; inherits everything
    }

    /**
     * Copre: if (m != null) → metodo già in cache
     */
    @Test
    public void testFindSetter_methodFromCache() throws Exception {
        Method m1 = Reflection.findSetter(SimpleClass.class, "value", String.class, true);
        assertNotNull(m1);
        Method m2 = Reflection.findSetter(SimpleClass.class, "value", String.class, true);
        assertSame(m1, m2); // cached instance
    }

    /**
     * Copre: ciclo su superclassi
     */
    @Test
    public void testFindSetter_inSuperclass() throws Exception {
        Method m = Reflection.findSetter(SimpleClass.class, "second", boolean.class, true);
        assertEquals("setSecond", m.getName());
    }

    /**
     * Copre: if (mustExist) → UserException
     */
    @Test(expected = UserException.class)
    public void testFindSetter_mustExistThrowsUserException() {
        Reflection.findSetter(SimpleClass.class, "nonexistent", String.class, true);
    }

    /**
     * Copre: else return null
     */
    @Test
    public void testFindSetter_mustNotExistReturnsNull() {
        Method m = Reflection.findSetter(SimpleClass.class, "nonexistent", String.class, false);
        assertNull(m);
    }

    public static class Dummy {
        private String message = "hi";
    }

    /**
     * Copre il ramo: `if (target == null)` → return null
     */
    @Test
    public void testGetField_nullTarget() throws Exception {
        Field field = Dummy.class.getDeclaredField("message");
        Object result = Reflection.get(null, field);
        assertNull(result);
    }

    /**
     * Copre il ramo: `if (field == null)` → return null
     */
    @Test
    public void testGetField_nullField() {
        Dummy dummy = new Dummy();
        Object result = Reflection.get(dummy, (Field) null);
        assertNull(result);
    }

    /**
     * Copre il ramo normale: makeAccessible e field.get(target)
     */
    @Test
    public void testGetField_success() throws Exception {
        Dummy dummy = new Dummy();
        Field field = Dummy.class.getDeclaredField("message");
        Object result = Reflection.get(dummy, field);
        assertEquals("hi", result);
    }


}

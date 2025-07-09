package org.apache.openjpa.enhance;

import org.apache.openjpa.util.UserException;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class MutationLLMTest {

    // 1. get<prop> non capitalizzato
    public static class GetterLower {
        public int getvalue() { return 123; }
    }

    @Test
    public void testFindGetter_getLowercase() {
        Method m = Reflection.findGetter(GetterLower.class, "value", true);
        assertNotNull(m);
        assertEquals("getvalue", m.getName());
    }

    // 2. is<prop> non capitalizzato, boolean
    public static class IsLowerBoolean {
        public boolean isactive() { return true; }
    }

    // 2. is<prop> non capitalizzato, boolean
    public static class IsLowerBooleanWrapper {
        public boolean isactive() { return true; }
    }
    @Test
    public void testFindGetter_isLowercaseBoolean() {
        Method m = Reflection.findGetter(IsLowerBoolean.class, "active", true);
        assertNotNull(m);
        assertEquals("isactive", m.getName());
    }
    @Test
    public void testFindGetter_isLowercaseBooleanWrapper() {
        Method m = Reflection.findGetter(IsLowerBooleanWrapper.class, "active", true);
        assertNotNull(m);
        assertEquals("isactive", m.getName());
    }
    // 3. get<Prop> capitalizzato
    public static class GetStandard {
        public int getScore() { return 10; }
    }

    @Test
    public void testFindGetter_getStandardCapitalized() {
        Method m = Reflection.findGetter(GetStandard.class, "score", true);
        assertNotNull(m);
        assertEquals("getScore", m.getName());
        try {
            Object val = m.invoke(new GetStandard());
            assertEquals(10, val);
        } catch (Exception e) {
            fail("Invocation failed: " + e.getMessage());
        }
    }

    // 4. is<Prop> → Boolean.class
    public static class IsBooleanObject {
        public Boolean isEnabled() { return Boolean.TRUE; }
    }

    @Test
    public void testFindGetter_isBooleanObject() {
        Method m = Reflection.findGetter(IsBooleanObject.class, "enabled", true);
        assertNotNull(m);
        assertEquals("isEnabled", m.getName());
    }

    // 5. test caching di setGetterMethod
    @Test
    public void testFindGetter_cacheUsage() {
        Method m1 = Reflection.findGetter(GetStandard.class, "score", true);
        Method m2 = Reflection.findGetter(GetStandard.class, "score", true);
        assertSame(m1, m2);
    }

    // 6. mustExist = false → return null
    public static class NoGetter { }

    @Test
    public void testFindGetter_notMustExistReturnsNull() {
        Method m = Reflection.findGetter(NoGetter.class, "nothing", false);
        assertNull(m);
    }

    // 7. mustExist = true → UserException
    @Test(expected = UserException.class)
    public void testFindGetter_mustExistThrows() {
        Reflection.findGetter(NoGetter.class, "nothing", true);
    }
}

package org.apache.openjpa.enhance;

import static org.junit.Assert.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

import org.apache.openjpa.util.UserException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ReflectionParameterizedTest {

    enum TestType { FIND_GETTER, FIND_SETTER, GET_VALUE, PRIV_FIELD_SETGET }

    private final TestType testType;
    private final String propName;
    private final boolean mustExist;
    private final Object expectedResult; // Method name (String), Boolean exception flag, or Integer

    public ReflectionParameterizedTest(TestType testType, String propName, boolean mustExist, Object expectedResult) {
        this.testType = testType;
        this.propName = propName;
        this.mustExist = mustExist;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters(name = "{index}: {0}('{1}',mustExist={2}) -> {3}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                // FIND_GETTER cases
                { TestType.FIND_GETTER, "value", true, "getValue" },
                { TestType.FIND_GETTER, "active", true, "isActive" },
                { TestType.FIND_GETTER, "missing", false, null },
                { TestType.FIND_GETTER, "missing", true, Boolean.TRUE }, // expect exception

                // FIND_SETTER cases
                { TestType.FIND_SETTER, "value", true, "setValue" },
                { TestType.FIND_SETTER, "missing", false, null },
                { TestType.FIND_SETTER, "missing", true, Boolean.TRUE },

                // GET_VALUE cases
                { TestType.GET_VALUE, "value", true, 123 },
                { TestType.GET_VALUE, "missing", false, null },
                { TestType.GET_VALUE, "missing", true, Boolean.TRUE },

                // PRIV_FIELD_SETGET
                { TestType.PRIV_FIELD_SETGET, "value", false, 999 }
        });
    }

    @Test
    public void runTest() throws Exception {
        switch (testType) {
            case FIND_GETTER:
                runFindGetter();
                break;
            case FIND_SETTER:
                runFindSetter();
                break;
            case GET_VALUE:
                runGetValue();
                break;
            case PRIV_FIELD_SETGET:
                runPrivFieldSetGet();
                break;
        }
    }

    private void runFindGetter() {
        try {
            Method m = Reflection.findGetter(TestBean.class, propName, mustExist);
            if (expectedResult == null) {
                assertNull(m);
            } else if (expectedResult instanceof String) {
                assertNotNull(m);
                assertEquals(expectedResult, m.getName());
            } else {
                fail("Expected UserException for " + propName);
            }
        } catch (UserException e) {
            assertTrue(expectedResult instanceof Boolean && (Boolean) expectedResult);
        }
    }

    private void runFindSetter() {
        try {
            Method m = Reflection.findSetter(TestBean.class, propName, mustExist);
            if (expectedResult == null) {
                assertNull(m);
            } else if (expectedResult instanceof String) {
                assertNotNull(m);
                assertEquals(expectedResult, m.getName());
            } else {
                fail("Expected UserException for " + propName);
            }
        } catch (UserException e) {
            assertTrue(expectedResult instanceof Boolean && (Boolean) expectedResult);
        }
    }

    private void runGetValue() {
        TestBean bean = new TestBean();
        bean.value = 123;
        try {
            Object v = Reflection.getValue(bean, propName, mustExist);
            if (expectedResult == null) {
                assertNull(v);
            } else if (expectedResult instanceof Integer) {
                assertEquals(expectedResult, v);
            } else {
                fail("Expected UserException for " + propName);
            }
        } catch (UserException e) {
            assertTrue(expectedResult instanceof Boolean && (Boolean) expectedResult);
        }
    }

    private void runPrivFieldSetGet() throws Exception {
        TestBean bean = new TestBean();
        Field f = TestBean.class.getDeclaredField(propName);
        Reflection.set(bean, f, 999);
        Object v = Reflection.get(bean, f);
        assertEquals(expectedResult, v);
    }

    public static class TestBean {
        private int value;
        private boolean active;

        public int getValue() { return value; }
        public void setValue(int v) { this.value = v; }
        public boolean isActive() { return active; }
        public void setActive(boolean a) { this.active = a; }
    }
}

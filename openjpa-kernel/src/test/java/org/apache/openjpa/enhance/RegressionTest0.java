package org.apache.openjpa.enhance;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.reflect.Field field1 = null;
        byte byte2 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) 0, field1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 1, method1, 'a');
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "hi!", method1, (byte) 1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.reflect.Field field1 = null;
        char char2 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) 1, field1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.reflect.Method method1 = null;
        char char2 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) 10.0f, method1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (-1L), field1, (byte) 10);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 100L, (java.lang.Object) 100.0f, field2);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        java.lang.Object obj2 = org.apache.openjpa.enhance.Reflection.get(obj0, field1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (short) (byte) 0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.lang.reflect.Field field1 = null;
        short short2 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) 0, field1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.lang.reflect.Field field1 = null;
        float float2 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) (byte) 1, field1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        double double2 = org.apache.openjpa.enhance.Reflection.getDouble(obj0, field1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (-1), field1, 10L);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, (long) ' ', field2);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (-1.0d), field1, (long) (short) -1);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 0, (byte) -1, field2);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 0, method1, (-1.0d));
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 0L, field1, (int) '\000');
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.lang.reflect.Method method1 = null;
        boolean boolean2 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) 100, method1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 1, field1, 'a');
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 100, method1, (long) (short) 10);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.lang.reflect.Method method1 = null;
        double double2 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) 0, method1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.Class class0 = null;
        java.lang.reflect.Method method3 = org.apache.openjpa.enhance.Reflection.findGetter(class0, "", false);
        org.junit.Assert.assertNull(method3);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 'a', (byte) 100, field2);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, method1, (double) (byte) 1);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) (short) 1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"hi!\" in type \"class java.lang.Short\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.lang.reflect.Field field1 = null;
        boolean boolean2 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) (byte) -1, field1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.lang.reflect.Field field1 = null;
        short short2 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) 100.0f, field1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.lang.reflect.Method method0 = null;
        java.lang.Class class1 = org.apache.openjpa.enhance.Reflection.getDeclaringClass(method0);
        org.junit.Assert.assertNull(class1);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) false, method1, (-1.0f));
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.lang.Object obj3 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) "", "", false);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.lang.reflect.Method method1 = null;
        double double2 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) (-1), method1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method3 = org.apache.openjpa.enhance.Reflection.findGetter(class0, "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing getter for property \"\" in type \"null\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 100, false, field2);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.reflect.Method method1 = null;
        double double2 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) (byte) 100, method1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.lang.reflect.Field field1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) 1L, field1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "hi!", field1, (int) (short) 0);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.lang.reflect.Method method1 = null;
        double double2 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) 0.0d, method1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) 10.0f, method1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) ' ', field1, (short) 10);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 10L, (java.lang.Object) 100.0d, field2);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.lang.reflect.Field field1 = null;
        byte byte2 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) true, field1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) '#', method1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 10.0f, false, field2);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 10.0d, method1, (java.lang.Object) 100);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 10L, (short) (byte) 100, field2);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "hi!", method1, (byte) -1);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.lang.reflect.Field field1 = null;
        short short2 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) 10L, field1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) true, (double) (short) 0, field2);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 100.0d, 0.0f, field2);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.lang.Class class0 = null;
        java.lang.reflect.Method method3 = org.apache.openjpa.enhance.Reflection.findSetter(class0, "", false);
        org.junit.Assert.assertNull(method3);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.lang.reflect.Method method1 = null;
        byte byte2 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) 100L, method1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, ' ');
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 100.0f, field1, (int) ' ');
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 10.0f, method1, ' ');
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 0, method1, false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 'a', 0.0f, field2);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method3 = org.apache.openjpa.enhance.Reflection.findGetter(class0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing getter for property \"hi!\" in type \"null\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (-1L), method1, (double) '\000');
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.lang.reflect.Field field1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) 0.0d, field1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.lang.reflect.Method method1 = null;
        float float2 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) (-1L), method1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 10L, (int) (short) 100, field2);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) '\000', true, field2);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.lang.reflect.Method method1 = null;
        byte byte2 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) 'a', method1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 10.0d, (double) '4', field2);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.Object obj7 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) field2, "", true);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) '#', field1, (float) 1);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 10, (long) 1, field2);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.lang.reflect.Field field1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) "hi!", field1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (-1L), method1, true);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 10, method1, (long) (short) 10);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.lang.reflect.Field field1 = null;
        char char2 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) ' ', field1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) '\000', method1, (long) '#');
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.lang.reflect.Method method1 = null;
        long long2 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) 'a', method1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (java.lang.Object) '\000');
        java.lang.reflect.Field field5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field1, 'a', field5);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (-1.0f), field1, true);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.reflect.Method method1 = null;
        float float2 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) (-1), method1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.lang.reflect.Field field1 = null;
        long long2 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) "", field1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.lang.reflect.Method method1 = null;
        char char2 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) 0L, method1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (-1), method1, (java.lang.Object) (short) 0);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) true, method1, (java.lang.Object) (-1));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "hi!", true, field2);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.lang.reflect.Method method1 = null;
        java.lang.Object obj2 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) (-1L), method1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.lang.reflect.Method method1 = null;
        boolean boolean2 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) 10L, method1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 1, method1, (int) (byte) 0);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.lang.reflect.Method method1 = null;
        boolean boolean2 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) "", method1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.lang.reflect.Field field1 = null;
        java.lang.Object obj2 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) (-1.0d), field1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (double) (short) 0);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, method1, (long) (byte) 1);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (-1.0d), method1, (short) (byte) -1);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 100, field1, 0);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) ' ', true, field2);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 10, (short) 10, field2);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.lang.reflect.Method method1 = null;
        short short2 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) '\000', method1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.lang.reflect.Method method1 = null;
        char char2 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) 0.0d, method1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) (-1L), "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"hi!\" in type \"class java.lang.Long\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.lang.reflect.Method method1 = null;
        byte byte2 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) 1L, method1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.lang.reflect.Field field1 = null;
        float float2 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) '#', field1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 100, field1, (-1));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 'a', method1, true);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 100.0f, field1, (java.lang.Object) 10.0f);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.lang.reflect.Field field1 = null;
        char char2 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) 'a', field1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.lang.reflect.Method method1 = null;
        double double2 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) 100.0d, method1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.lang.reflect.Method method1 = null;
        long long2 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) (byte) 1, method1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.lang.reflect.Field field1 = null;
        double double2 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) 1.0d, field1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) '#', 10.0f, field2);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 1, 100L, field2);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.lang.reflect.Field field1 = null;
        java.lang.Object obj2 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) (-1.0f), field1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "hi!", (long) (short) 10, field2);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "hi!", method1, (double) (byte) 1);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 0.0d, (long) (-1), field2);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.lang.reflect.Field field1 = null;
        char char2 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) 10.0d, field1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.lang.reflect.Field field1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) (short) 100, field1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 1L, (double) (byte) 1, field2);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.lang.reflect.Method method1 = null;
        long long2 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) '#', method1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 10.0f, field1, (byte) 100);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.lang.reflect.Field field1 = null;
        java.lang.Object obj2 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) 1L, field1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.lang.reflect.Field field1 = null;
        long long2 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) 100.0d, field1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 0, true, field2);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.lang.reflect.Field field1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) '\000', field1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.lang.reflect.Field field1 = null;
        long long2 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) 1L, field1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.lang.reflect.Field field1 = null;
        double double2 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) 0, field1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 0, 'a', field2);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.lang.reflect.Method method1 = null;
        java.lang.Object obj2 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) 10.0f, method1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 10.0d, field1, (-1L));
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 1.0f, field1, (byte) 0);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.lang.reflect.Method method1 = null;
        java.lang.Object obj2 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) (-1.0d), method1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 10, method11, (double) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) '\000', method1, (java.lang.Object) (-1));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.lang.reflect.Field field1 = null;
        boolean boolean2 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) 1.0d, field1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (java.lang.Object) '\000');
        java.lang.reflect.Field field4 = null;
        byte byte5 = org.apache.openjpa.enhance.Reflection.getByte(obj0, field4);
        java.lang.reflect.Method method6 = null;
        double double7 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) field4, method6);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (byte) 0, field2);
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field2, field4, 1.0f);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (-1), field1, (int) (short) 1);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 0, (short) (byte) 10, field2);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Field field11 = null;
        char char12 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) method8, field11);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.lang.reflect.Field field1 = null;
        boolean boolean2 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) 0.0d, field1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.lang.reflect.Field field1 = null;
        java.lang.Object obj2 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) (short) 1, field1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 1, 0L, field2);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.lang.reflect.Method method1 = null;
        float float2 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) 0.0d, method1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.lang.reflect.Field field1 = null;
        double double2 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) (-1.0d), field1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method11);
        java.lang.reflect.Field field13 = null;
        double double14 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) method12, field13);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 10, field1, (java.lang.Object) 100.0f);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 0.0f, field1, 10.0f);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.lang.reflect.Field field1 = null;
        short short2 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) '#', field1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.lang.reflect.Field field1 = null;
        byte byte2 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) 100.0f, field1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Method method14 = null;
        int int15 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass1, method14);
        java.lang.reflect.Field field17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) int15, (float) '\000', field17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field11, (long) 10);
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 10, true, field15);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (byte) 0, field2);
        java.lang.reflect.Method method4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field2, method4, 0L);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 1, field1, 100.0d);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        long long2 = org.apache.openjpa.enhance.Reflection.getLong(obj0, field1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) "hi!", "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"\" in type \"class java.lang.String\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.lang.reflect.Method method1 = null;
        char char2 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) (byte) 100, method1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 1L, (long) (byte) -1, field2);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field8 = null;
        long long9 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) method7, field8);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "", (long) ' ', field2);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field8 = null;
        float float9 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass1, field8);
        java.lang.reflect.Field field10 = null;
        char char11 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) field8, field10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\000' + "'", char11 == '\000');
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.lang.reflect.Field field1 = null;
        java.lang.Object obj2 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) 1.0d, field1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.lang.reflect.Field field1 = null;
        boolean boolean2 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) ' ', field1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 0, '4', field2);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (java.lang.Object) '\000');
        java.lang.reflect.Field field4 = null;
        byte byte5 = org.apache.openjpa.enhance.Reflection.getByte(obj0, field4);
        java.lang.reflect.Field field7 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field4, false, field7);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 1.0f, field1, (byte) 1);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.lang.reflect.Field field1 = null;
        float float2 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) 10.0d, field1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (-1.0d), true, field2);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 10, method1, (int) '#');
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 10, (float) (short) 0, field2);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.openjpa.enhance.Reflection reflection1 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass2 = reflection1.getClass();
        java.lang.reflect.Field field3 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass2, field3, false);
        java.lang.reflect.Method method8 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass2, "hi!", false);
        java.lang.reflect.Method method9 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass2, method9, (float) (short) 10);
        java.util.Set<java.lang.String> strSet12 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass2);
        java.lang.reflect.Method method13 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet12, method13, (long) (byte) 1);
        java.lang.reflect.Field field16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 1, (java.lang.Object) method13, field16);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        short short2 = org.apache.openjpa.enhance.Reflection.getShort(obj0, field1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (-1.0f), field1, (-1.0f));
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.lang.reflect.Method method1 = null;
        boolean boolean2 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) (byte) 1, method1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field8 = null;
        float float9 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass1, field8);
        java.lang.reflect.Method method10 = null;
        double double11 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) float9, method10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.lang.reflect.Field field1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) (byte) 0, field1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (-1.0d), field1, (float) 100);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.lang.reflect.Method method1 = null;
        long long2 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) 10.0d, method1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.lang.reflect.Field field1 = null;
        byte byte2 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) 0.0d, field1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 1, (long) '#', field2);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "", field1, (float) 0L);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.lang.reflect.Method method1 = null;
        double double2 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) 10, method1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        java.lang.Object obj2 = org.apache.openjpa.enhance.Reflection.get(obj0, method1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.lang.reflect.Method method1 = null;
        short short2 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) '4', method1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, field2, (double) 100L);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Method method14 = null;
        float float15 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) method11, method14);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field11, (long) 10);
        org.apache.openjpa.enhance.Reflection reflection15 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass16 = reflection15.getClass();
        java.lang.reflect.Field field17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass16, field17, false);
        java.lang.reflect.Method method22 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass16, "hi!", false);
        java.lang.reflect.Method method23 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass16, method23, (float) (short) 10);
        java.util.Set<java.lang.String> strSet26 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method28 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "", (java.lang.Class) wildcardClass16, true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing setter for property \"\" in type \"class org.apache.openjpa.enhance.Reflection\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(strSet26);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 10L, method1, 10.0f);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Method method2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, method2, true);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (byte) 0, field2);
        java.lang.reflect.Method method4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field2, method4, '4');
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field4, false);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Field field10 = null;
        float float11 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass3, field10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, field1, (java.lang.Object) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Field field15 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass3, "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"\" in type \"class org.apache.openjpa.enhance.Reflection\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Field field12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (float) 1L, field12);
        java.lang.reflect.Field field14 = null;
        boolean boolean15 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) field12, field14);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, '4');
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 1, (int) (short) 10, field2);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (-1.0d), method1, (byte) 10);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) false, field1, ' ');
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (byte) 0, field2);
        java.lang.reflect.Field field5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field2, 0L, field5);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, (byte) 0, field2);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.lang.reflect.Method method1 = null;
        long long2 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) 1.0d, method1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (-1), field1, (short) 0);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) true, false, field2);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.lang.reflect.Field field1 = null;
        char char2 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) 10.0f, field1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, (byte) 1, field2);
        java.lang.reflect.Field field4 = null;
        float float5 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) field2, field4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "", field8, true);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) -1, method1, false);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 100L, method1, (byte) 1);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field11, (long) 10);
        java.lang.reflect.Method method14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method14, (short) 0);
        java.lang.reflect.Method method17 = null;
        byte byte18 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) (short) 0, method17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Field field12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (float) 1L, field12);
        java.lang.reflect.Field field14 = null;
        boolean boolean15 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass1, field14);
        org.apache.openjpa.enhance.Reflection reflection17 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass18 = reflection17.getClass();
        java.lang.reflect.Field field19 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass18, field19, false);
        java.lang.reflect.Method method24 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass18, "", false);
        java.lang.reflect.Method method27 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass18, "hi!", false);
        java.lang.reflect.Method method28 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass18, method28, 0L);
        java.lang.reflect.Field field31 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass18, field31, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method35 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "", (java.lang.Class) wildcardClass18, true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing setter for property \"\" in type \"class org.apache.openjpa.enhance.Reflection\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(method27);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 0, method1, (java.lang.Object) (-1.0d));
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field4, false);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Method method12 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass3, "hi!", false);
        java.lang.reflect.Method method13 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, method13, 0L);
        java.lang.reflect.Field field16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field16, (int) (short) 1);
        java.lang.reflect.Method method19 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, method19, (short) (byte) -1);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 10.0d, field1, (java.lang.Object) method19);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        boolean boolean2 = org.apache.openjpa.enhance.Reflection.getBoolean(obj0, field1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 1, field1, (long) '\000');
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.lang.reflect.Field field1 = null;
        java.lang.Object obj2 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) 10.0f, field1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (java.lang.Object) '\000');
        java.lang.reflect.Field field5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field1, true, field5);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 1.0f, field1, (double) (short) 100);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        double double2 = org.apache.openjpa.enhance.Reflection.getDouble(obj0, method1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) reflection0, method1);
        java.lang.reflect.Field field3 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) int2, field3, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 1L, method1, (long) 100);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 0, false, field2);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field4, false);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Field field10 = null;
        float float11 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass3, field10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, field1, (java.lang.Object) wildcardClass3);
        java.lang.reflect.Method method13 = null;
        boolean boolean14 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass3, method13);
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection reflection16 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass17 = reflection16.getClass();
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, field18, false);
        java.lang.reflect.Method method23 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass17, "hi!", false);
        java.lang.reflect.Method method24 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, method24, (float) (short) 10);
        java.lang.reflect.Field field28 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, (float) 1L, field28);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) boolean14, field15, (java.lang.Object) wildcardClass17);
        java.lang.reflect.Field field32 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) boolean14, true, field32);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, (byte) 1, field2);
        java.lang.reflect.Field field4 = null;
        java.lang.Object obj5 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) reflection0, field4);
        java.lang.reflect.Method method6 = null;
        long long7 = org.apache.openjpa.enhance.Reflection.getLong(obj5, method6);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "", field1, (short) -1);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Method method14 = null;
        int int15 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass1, method14);
        java.lang.reflect.Field field16 = null;
        long long17 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) int15, field16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "hi!", field8, 0L);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) (short) 10, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"hi!\" in type \"class java.lang.Short\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (float) (short) 0);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (long) (byte) 100);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.lang.reflect.Field field1 = null;
        java.lang.Object obj2 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) '\000', field1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Field field12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (float) 1L, field12);
        java.lang.reflect.Field field14 = null;
        boolean boolean15 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass1, field14);
        java.lang.reflect.Method method16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field14, method16, (long) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field14, (int) (short) 1);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method17, (short) (byte) -1);
        java.lang.reflect.Field field20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method17, field20, true);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 1, (float) ' ', field2);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field4, false);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Field field10 = null;
        float float11 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass3, field10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, field1, (java.lang.Object) wildcardClass3);
        java.lang.reflect.Method method13 = null;
        boolean boolean14 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass3, method13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method17 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass3, "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing getter for property \"\" in type \"class org.apache.openjpa.enhance.Reflection\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field8 = null;
        float float9 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass1, field8);
        java.lang.reflect.Method method10 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) float9, method10, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) reflection0, method1);
        java.lang.reflect.Field field3 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) int2, field3, true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 1L, method1, (short) (byte) -1);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 100, (byte) 1, field2);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) -1, field1, (long) '#');
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 'a', method1, (long) (byte) 100);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 1.0d, method1, (short) (byte) -1);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field11 = null;
        short short12 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) method10, field11);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.lang.reflect.Field field1 = null;
        double double2 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) (byte) 1, field1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method11);
        java.lang.reflect.Field field13 = null;
        java.lang.Object obj14 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) method11, field13);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.lang.reflect.Method method1 = null;
        char char2 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) (short) 10, method1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field14, (int) (short) 1);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method17, (short) (byte) -1);
        java.lang.reflect.Method method22 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field23 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "hi!", field23, (int) '\000');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "hi!", field1, (byte) 10);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.lang.reflect.Field field1 = null;
        long long2 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) 'a', field1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) reflection0, method1);
        java.lang.reflect.Field field3 = null;
        int int4 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) int2, field3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field11, (long) 10);
        java.lang.reflect.Method method14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 10, method14, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Field field5 = null;
        char char6 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) false, field5);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        byte byte6 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet4, method5);
        java.lang.reflect.Field field7 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) byte6, field7, (int) (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) (short) 1, method1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 100.0f, method1, '4');
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Method method14 = null;
        java.lang.Object obj15 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) 0L, method14);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        float float2 = org.apache.openjpa.enhance.Reflection.getFloat(obj0, field1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj10 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) false, "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"\" in type \"class java.lang.Boolean\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field14, (int) (short) 1);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method17, (short) (byte) -1);
        java.lang.reflect.Field field20 = null;
        short short21 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) wildcardClass1, field20);
        java.lang.reflect.Method method22 = null;
        char char23 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) short21, method22);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field4, false);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Field field10 = null;
        float float11 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass3, field10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, field1, (java.lang.Object) wildcardClass3);
        java.lang.reflect.Field field13 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field1, field13, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.lang.reflect.Field field1 = null;
        boolean boolean2 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) 10.0f, field1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (java.lang.Object) '\000');
        java.lang.reflect.Field field4 = null;
        byte byte5 = org.apache.openjpa.enhance.Reflection.getByte(obj0, field4);
        java.lang.reflect.Field field6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) byte5, field6, '\000');
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field11, (long) 10);
        java.lang.reflect.Method method14 = null;
        char char15 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) 10, method14);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Method method14 = null;
        int int15 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass1, method14);
        java.lang.reflect.Method method16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method16, false);
        java.lang.reflect.Method method19 = null;
        short short20 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) false, method19);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method11);
        java.lang.reflect.Field field13 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method12, field13, 'a');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.lang.reflect.Field field1 = null;
        byte byte2 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) (byte) 1, field1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field4, false);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Field field10 = null;
        float float11 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass3, field10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, field1, (java.lang.Object) wildcardClass3);
        java.lang.reflect.Method method13 = null;
        boolean boolean14 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass3, method13);
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection reflection16 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass17 = reflection16.getClass();
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, field18, false);
        java.lang.reflect.Method method23 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass17, "hi!", false);
        java.lang.reflect.Method method24 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, method24, (float) (short) 10);
        java.lang.reflect.Field field28 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, (float) 1L, field28);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) boolean14, field15, (java.lang.Object) wildcardClass17);
        java.lang.reflect.Method method31 = null;
        java.lang.Object obj32 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) boolean14, method31);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Field field12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (float) 1L, field12);
        java.lang.reflect.Method method14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 1L, method14, (short) (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.lang.reflect.Field field1 = null;
        float float2 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) (-1.0d), field1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) reflection0, method1);
        java.lang.reflect.Field field3 = null;
        short short4 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) int2, field3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.lang.reflect.Method method1 = null;
        char char2 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) 1.0d, method1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field14, (int) (short) 1);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method17, (short) (byte) -1);
        java.lang.reflect.Method method20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method20, (long) (short) 0);
        java.lang.reflect.Field field23 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method20, field23, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field11, (long) 10);
        java.lang.reflect.Field field14 = null;
        boolean boolean15 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) 10, field14);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, 0);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.lang.reflect.Method method4 = null;
        boolean boolean5 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) field2, method4);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.lang.reflect.Field field1 = null;
        long long2 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) 0L, field1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        long long6 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) false, method5);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        org.apache.openjpa.enhance.Reflection reflection6 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass7 = reflection6.getClass();
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass7, field8, false);
        java.lang.reflect.Method method13 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass7, "", false);
        java.lang.reflect.Method method16 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass7, "hi!", false);
        java.lang.reflect.Field field19 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass7, "", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method21 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", (java.lang.Class) wildcardClass7, true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing setter for property \"hi!\" in type \"class org.apache.openjpa.enhance.Reflection\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(field19);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method15 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing getter for property \"hi!\" in type \"class org.apache.openjpa.enhance.Reflection\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Method method2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, method2, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 0, method1, true);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "hi!", method1, (double) 1L);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field14, (int) (short) 1);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method17, (short) (byte) -1);
        java.lang.reflect.Method method20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method20, (long) (short) 0);
        java.lang.reflect.Field field24 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 0, ' ', field24);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (-1L), field1, true);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet11, method12, (long) (byte) 1);
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 1, field15, '#');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field14, (int) (short) 1);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method17, (short) (byte) -1);
        java.lang.reflect.Field field20 = null;
        short short21 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) wildcardClass1, field20);
        java.lang.reflect.Method method22 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) short21, method22, 100);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field11, (long) 10);
        java.lang.reflect.Method method14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method14, (short) 0);
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method14, (byte) 10, field18);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field14, (int) (short) 1);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method17, (short) (byte) -1);
        java.lang.reflect.Method method22 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method25 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing getter for property \"\" in type \"class org.apache.openjpa.enhance.Reflection\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 0.0d, field1, (byte) -1);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 0, field1, (byte) 0);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field11, (long) 10);
        java.lang.reflect.Method method14 = null;
        byte byte15 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) wildcardClass1, method14);
        java.lang.reflect.Method method16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) byte15, method16, (long) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.util.Set<java.lang.String> strSet14 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method15 = null;
        char char16 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) wildcardClass1, method15);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) char16, method17, true);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) reflection0, method1);
        java.lang.reflect.Method method3 = null;
        java.lang.Object obj4 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) reflection0, method3);
        java.lang.reflect.Field field5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method3, field5, (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (float) '\000');
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Method method14 = null;
        int int15 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass1, method14);
        java.lang.reflect.Method method16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method16, false);
        java.lang.reflect.Field field20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) false, (short) 1, field20);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 100, (int) (short) 10, field2);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field4, false);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Field field10 = null;
        float float11 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass3, field10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, field1, (java.lang.Object) wildcardClass3);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, (short) 0, field14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) true, method1, (short) (byte) 0);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.lang.reflect.Field field1 = null;
        short short2 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) (short) 0, field1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, (int) (byte) -1, field6);
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) field6, field8);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field11, (long) 10);
        java.lang.reflect.Method method14 = null;
        byte byte15 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) wildcardClass1, method14);
        java.lang.reflect.Method method16 = null;
        java.lang.Object obj17 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) method14, method16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field5, (double) 100);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field4, false);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Field field10 = null;
        float float11 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass3, field10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, field1, (java.lang.Object) wildcardClass3);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field1, (long) (byte) 100, field14);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.lang.reflect.Method method1 = null;
        float float2 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) 0.0f, method1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, (byte) 1, field2);
        java.lang.reflect.Method method4 = null;
        long long5 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) (byte) 1, method4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 0, method1, (long) (short) 0);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method5);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "", method10, (int) (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (byte) 100);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field1 = null;
        boolean boolean2 = org.apache.openjpa.enhance.Reflection.getBoolean(obj0, field1);
        java.lang.reflect.Method method3 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field1, method3, (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.lang.reflect.Field field1 = null;
        float float2 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) 'a', field1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) (byte) 0, method1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (double) (byte) 10);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.lang.reflect.Field field1 = null;
        float float2 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) 100.0f, field1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        long long2 = org.apache.openjpa.enhance.Reflection.getLong(obj0, method1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Method method14 = null;
        int int15 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass1, method14);
        java.lang.reflect.Method method16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method16, false);
        java.lang.reflect.Method method19 = null;
        double double20 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, method19);
        java.lang.reflect.Field field21 = null;
        long long22 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) method19, field21);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.lang.reflect.Method method1 = null;
        java.lang.Object obj2 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) 0L, method1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method5);
        java.lang.reflect.Field field7 = null;
        byte byte8 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) method6, field7);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 10, field1, (short) 0);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.lang.reflect.Field field1 = null;
        float float2 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) (byte) -1, field1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (java.lang.Object) '\000');
        java.lang.reflect.Field field4 = null;
        byte byte5 = org.apache.openjpa.enhance.Reflection.getByte(obj0, field4);
        java.lang.reflect.Field field7 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) byte5, (short) (byte) -1, field7);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field14, (int) (short) 1);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method17, (short) (byte) -1);
        java.lang.reflect.Method method20 = null;
        boolean boolean21 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) (byte) -1, method20);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field14, (int) (short) 1);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method17, (short) (byte) -1);
        java.lang.reflect.Field field20 = null;
        short short21 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) wildcardClass1, field20);
        java.lang.Object obj24 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) wildcardClass1, "", false);
        java.lang.reflect.Field field25 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "", field25, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.lang.reflect.Method method1 = null;
        java.lang.Object obj2 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) (byte) 100, method1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 10, field1, (long) (-1));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) reflection0, method1);
        java.lang.reflect.Field field3 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method1, field3, (long) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) -1, field1, (byte) 0);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Method method14 = null;
        int int15 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass1, method14);
        java.lang.reflect.Method method16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) int15, method16, 0L);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        byte byte6 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet4, method5);
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) byte6, (long) 'a', field8);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        boolean boolean2 = org.apache.openjpa.enhance.Reflection.getBoolean(obj0, method1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (float) ' ');
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Field field12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (float) 1L, field12);
        java.lang.reflect.Field field14 = null;
        boolean boolean15 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass1, field14);
        java.lang.reflect.Field field16 = null;
        float float17 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) field14, field16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.lang.reflect.Field field1 = null;
        long long2 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) '#', field1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (long) (byte) 100, field2);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.lang.reflect.Method method1 = null;
        double double2 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) 1, method1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, true);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method10, field11, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (double) (byte) 100, field2);
        java.lang.reflect.Method method4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field2, method4, 'a');
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.util.Set<java.lang.String> strSet14 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        org.apache.openjpa.enhance.Reflection reflection15 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass16 = reflection15.getClass();
        java.lang.reflect.Field field17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass16, field17, false);
        java.lang.reflect.Method method22 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass16, "hi!", false);
        java.lang.reflect.Method method23 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass16, method23, (float) (short) 10);
        java.lang.reflect.Field field26 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet14, (java.lang.Object) method23, field26);
        java.lang.reflect.Field field28 = null;
        long long29 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) field26, field28);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        byte byte2 = org.apache.openjpa.enhance.Reflection.getByte(obj0, field1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.util.Set<java.lang.String> strSet14 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        org.apache.openjpa.enhance.Reflection reflection15 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass16 = reflection15.getClass();
        java.lang.reflect.Field field17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass16, field17, false);
        java.lang.reflect.Method method22 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass16, "hi!", false);
        java.lang.reflect.Method method23 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass16, method23, (float) (short) 10);
        java.lang.reflect.Field field26 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet14, (java.lang.Object) method23, field26);
        java.lang.reflect.Field field29 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method23, (int) (short) 0, field29);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.lang.reflect.Field field1 = null;
        double double2 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) true, field1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.lang.Object obj3 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) 1, "", false);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method5);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method10, ' ');
        java.lang.reflect.Field field13 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) ' ', field13, true);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.lang.reflect.Field field1 = null;
        char char2 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) 1L, field1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method11);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method13);
        java.lang.reflect.Field field15 = null;
        byte byte16 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) method14, field15);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (float) (byte) 0, field2);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.lang.Object obj0 = null;
        java.lang.Object obj3 = org.apache.openjpa.enhance.Reflection.getValue(obj0, "hi!", false);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field8 = null;
        float float9 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass1, field8);
        java.lang.reflect.Field field10 = null;
        java.lang.Object obj11 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) float9, field10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (long) (byte) 0);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method5);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field10 = null;
        short short11 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) wildcardClass1, field10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.util.Set<java.lang.String> strSet14 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field17 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field18 = null;
        double double19 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) "", field18);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(field17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) reflection0, method1);
        java.lang.reflect.Method method3 = null;
        java.lang.Object obj4 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) reflection0, method3);
        java.lang.reflect.Field field5 = null;
        float float6 = org.apache.openjpa.enhance.Reflection.getFloat(obj4, field5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.lang.reflect.Field field1 = null;
        boolean boolean2 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) 1, field1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 1, method1, (short) -1);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field13 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "", (long) 100, field15);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(field13);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Field field12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (float) 1L, field12);
        java.lang.reflect.Method method14 = null;
        java.lang.Object obj15 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) field12, method14);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Field field3 = org.apache.openjpa.enhance.Reflection.findField(class0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"hi!\" in type \"null\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.lang.reflect.Field field5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field2, true, field5);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Method method14 = null;
        int int15 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass1, method14);
        java.lang.reflect.Method method16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method16, false);
        java.lang.reflect.Method method19 = null;
        double double20 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, method19);
        java.lang.reflect.Method method21 = null;
        boolean boolean22 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) method19, method21);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.lang.reflect.Method method1 = null;
        java.lang.Object obj2 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) '4', method1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method5);
        java.lang.reflect.Method method7 = null;
        char char8 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) method6, method7);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method11);
        java.lang.reflect.Method method13 = null;
        byte byte14 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) wildcardClass1, method13);
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method13, field15, (float) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, (byte) 1, field2);
        java.lang.reflect.Field field4 = null;
        java.lang.Object obj5 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) reflection0, field4);
        java.lang.reflect.Method method6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field4, method6, '\000');
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        char char2 = org.apache.openjpa.enhance.Reflection.getChar(obj0, field1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field14, (int) (short) 1);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method17, (short) (byte) -1);
        java.lang.reflect.Method method20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method20, (long) (short) 0);
        java.util.Set<java.lang.String> strSet23 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method24);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNull(method25);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 100L, field1, true);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "hi!", method1, (byte) 0);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field14, (int) (short) 1);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method17, (short) (byte) -1);
        java.lang.reflect.Method method20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method20, (long) (short) 0);
        org.apache.openjpa.enhance.Reflection reflection24 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass25 = reflection24.getClass();
        java.lang.reflect.Field field26 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass25, field26, false);
        java.lang.reflect.Method method31 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass25, "", false);
        java.lang.reflect.Method method34 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass25, "hi!", false);
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass25, method35);
        java.lang.reflect.Method method38 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "", (java.lang.Class) wildcardClass25, false);
        java.lang.reflect.Field field40 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "", (float) 10L, field40);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNull(method38);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        byte byte6 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet4, method5);
        java.lang.reflect.Field field7 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) byte6, field7, (float) (-1));
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.lang.reflect.Method method1 = null;
        byte byte2 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) 10.0f, method1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field8 = null;
        float float9 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass1, field8);
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) float9, ' ', field11);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field14, (int) (short) 1);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method17, (short) (byte) -1);
        java.lang.reflect.Method method20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method17, method20, (short) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, 1.0f, field2);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 100L, method1, (int) (byte) -1);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field4, false);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Field field10 = null;
        float float11 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass3, field10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, field1, (java.lang.Object) wildcardClass3);
        java.lang.reflect.Method method13 = null;
        boolean boolean14 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass3, method13);
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection reflection16 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass17 = reflection16.getClass();
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, field18, false);
        java.lang.reflect.Method method23 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass17, "hi!", false);
        java.lang.reflect.Method method24 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, method24, (float) (short) 10);
        java.lang.reflect.Field field28 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, (float) 1L, field28);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) boolean14, field15, (java.lang.Object) wildcardClass17);
        java.lang.reflect.Field field33 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass17, "hi!", false);
        java.lang.reflect.Field field35 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field33, (double) 1L, field35);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(field33);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (int) ' ');
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 0, (double) 1.0f, field2);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.lang.reflect.Method method1 = null;
        double double2 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) '\000', method1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 10.0f, field1, false);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        byte byte6 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet4, method5);
        java.lang.reflect.Method method7 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) byte6, method7, 0L);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) reflection0, method1);
        java.lang.reflect.Field field3 = null;
        java.lang.Object obj4 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) method1, field3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (byte) 1, field2);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field4, false);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Field field10 = null;
        float float11 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass3, field10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, field1, (java.lang.Object) wildcardClass3);
        java.lang.reflect.Method method13 = null;
        boolean boolean14 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass3, method13);
        java.lang.reflect.Method method15 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) boolean14, method15, (long) '\000');
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field14, (int) (short) 1);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method17, (short) (byte) -1);
        java.lang.reflect.Method method20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method20, (long) (short) 0);
        java.lang.reflect.Method method23 = null;
        double double24 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) method20, method23);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 1, method1, (short) 10);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (short) (byte) 10);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.lang.reflect.Field field5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field2, (double) 1, field5);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 10, ' ', field2);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field13 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method14 = null;
        java.lang.Object obj15 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) wildcardClass1, method14);
        java.lang.reflect.Field field18 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method19 = null;
        java.lang.Object obj20 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) false, method19);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(field13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(field18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) -1, 10L, field2);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Field field3 = org.apache.openjpa.enhance.Reflection.findField(class0, "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"\" in type \"null\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.lang.reflect.Method method1 = null;
        float float2 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) (byte) 1, method1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field14, (int) (short) 1);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method17, (short) (byte) -1);
        java.lang.reflect.Method method20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method20, (long) (short) 0);
        org.apache.openjpa.enhance.Reflection reflection24 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass25 = reflection24.getClass();
        java.lang.reflect.Field field26 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass25, field26, false);
        java.lang.reflect.Method method31 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass25, "", false);
        java.lang.reflect.Method method34 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass25, "hi!", false);
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass25, method35);
        java.lang.reflect.Method method38 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "", (java.lang.Class) wildcardClass25, false);
        java.lang.reflect.Field field39 = null;
        char char40 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) "", field39);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + '\000' + "'", char40 == '\000');
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (byte) 0, field2);
        java.lang.reflect.Field field4 = null;
        float float5 = org.apache.openjpa.enhance.Reflection.getFloat(obj0, field4);
        java.lang.reflect.Method method6 = null;
        char char7 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) float5, method6);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 0.0f, method1, (long) (short) 10);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.lang.reflect.Method method1 = null;
        java.lang.Object obj2 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) 100.0f, method1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 10, field1, true);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.lang.reflect.Field field1 = null;
        long long2 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) ' ', field1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.lang.reflect.Method method1 = null;
        java.lang.Object obj2 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) (short) 1, method1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 10L, field1, ' ');
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method12);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method13, field14, (long) (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method5);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method10, ' ');
        java.lang.reflect.Field field13 = null;
        org.apache.openjpa.enhance.Reflection reflection14 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass15 = reflection14.getClass();
        java.lang.reflect.Field field16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass15, field16, false);
        java.lang.reflect.Method method21 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass15, "hi!", false);
        java.lang.reflect.Method method22 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass15, method22, (float) (short) 10);
        java.util.Set<java.lang.String> strSet25 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass15);
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass15, method26);
        java.lang.reflect.Method method28 = null;
        java.lang.reflect.Method method29 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass15, method28);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method10, field13, (java.lang.Object) method28);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNull(method29);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Method method14 = null;
        int int15 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass1, method14);
        java.lang.reflect.Method method16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method16, false);
        java.lang.reflect.Field field20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method16, (float) ' ', field20);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field13 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method14 = null;
        java.lang.Object obj15 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) wildcardClass1, method14);
        java.lang.reflect.Method method16 = null;
        char char17 = org.apache.openjpa.enhance.Reflection.getChar(obj15, method16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(field13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Method method14 = null;
        int int15 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass1, method14);
        java.lang.reflect.Method method16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method16, false);
        java.lang.reflect.Field field20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) false, (long) (byte) 100, field20);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field9 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "", false, field9);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.lang.Class class0 = null;
        java.lang.reflect.Method method3 = org.apache.openjpa.enhance.Reflection.findGetter(class0, "hi!", false);
        org.junit.Assert.assertNull(method3);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) '\000', method1, (byte) 0);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field13 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method14 = null;
        java.lang.Object obj15 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) wildcardClass1, method14);
        java.lang.reflect.Method method16 = null;
        org.apache.openjpa.enhance.Reflection.set(obj15, method16, (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(field13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.lang.reflect.Field field1 = null;
        java.lang.Object obj2 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) ' ', field1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (long) (short) -1, field2);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 1.0f, method1, (long) 100);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 10, method11, true);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field11, (long) 10);
        java.lang.reflect.Field field14 = null;
        double double15 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) 10, field14);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) reflection0, method1);
        java.lang.reflect.Method method3 = null;
        java.lang.Object obj4 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) reflection0, method3);
        java.lang.reflect.Field field5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method3, field5, true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 0L, (long) (byte) 100, field2);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field14, (int) (short) 1);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method17, (short) (byte) -1);
        java.lang.reflect.Field field20 = null;
        short short21 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) wildcardClass1, field20);
        java.lang.Object obj24 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) wildcardClass1, "", false);
        java.lang.reflect.Field field25 = null;
        char char26 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) false, field25);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field3 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, true, field3);
        java.lang.reflect.Field field6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field3, (short) (byte) 0, field6);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (byte) 100);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method12);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method13, field14, (int) '4');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.lang.reflect.Field field1 = null;
        long long2 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) 100, field1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field4 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method5 = null;
        boolean boolean6 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) false, method5);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(field4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (double) (byte) 100, field2);
        java.lang.reflect.Method method4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field2, method4, (float) 10L);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) true, field1, (double) 10L);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.lang.reflect.Method method1 = null;
        long long2 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) 1.0f, method1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) false, method5, (float) 100L);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) reflection0, method1);
        java.lang.Class<?> wildcardClass3 = reflection0.getClass();
        java.lang.reflect.Method method4 = null;
        short short5 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) reflection0, method4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method12);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method12, field14, 'a');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field4, false);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Field field10 = null;
        float float11 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass3, field10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, field1, (java.lang.Object) wildcardClass3);
        java.lang.reflect.Method method13 = null;
        boolean boolean14 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass3, method13);
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection reflection16 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass17 = reflection16.getClass();
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, field18, false);
        java.lang.reflect.Method method23 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass17, "hi!", false);
        java.lang.reflect.Method method24 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, method24, (float) (short) 10);
        java.lang.reflect.Field field28 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, (float) 1L, field28);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) boolean14, field15, (java.lang.Object) wildcardClass17);
        java.lang.reflect.Field field33 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass17, "hi!", false);
        java.lang.reflect.Field field34 = null;
        short short35 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) "hi!", field34);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(field33);
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 0 + "'", short35 == (short) 0);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.lang.reflect.Method method1 = null;
        char char2 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) (short) -1, method1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (double) 1L);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 0.0f, field1, (long) (byte) 100);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (long) (short) 100, field2);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field4, false);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Field field10 = null;
        float float11 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass3, field10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, field1, (java.lang.Object) wildcardClass3);
        java.lang.reflect.Method method13 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, method13, (float) 0L);
        java.lang.reflect.Field field16 = null;
        java.lang.Object obj17 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) method13, field16);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.lang.reflect.Method method1 = null;
        java.lang.Object obj2 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) "", method1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 10, method1, 0L);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, 100L);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.lang.Class class0 = null;
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod(class0, method1);
        org.junit.Assert.assertNull(method2);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.lang.Object obj0 = null;
        java.lang.Object obj3 = org.apache.openjpa.enhance.Reflection.getValue(obj0, "", true);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, 'a', field2);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (double) (byte) 100, field2);
        java.lang.reflect.Field field4 = null;
        java.lang.Object obj5 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field4, obj5);
        java.lang.reflect.Method method7 = null;
        byte byte8 = org.apache.openjpa.enhance.Reflection.getByte(obj5, method7);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, (byte) 1, field2);
        java.lang.reflect.Field field4 = null;
        java.lang.Object obj5 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) reflection0, field4);
        java.lang.reflect.Method method6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, method6, '\000');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) '\000', "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"\" in type \"class java.lang.Character\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field13 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method14 = null;
        java.lang.Object obj15 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) wildcardClass1, method14);
        java.lang.reflect.Field field18 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field19 = null;
        boolean boolean20 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) false, field19);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(field13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(field18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (short) (byte) 1);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (byte) -1);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (-1.0d));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.Object obj3 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) reflection0, method2);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 10, (-1.0d), field2);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Method method16 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "", false);
        java.util.Set<java.lang.String> strSet17 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method18 = null;
        float float19 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) strSet17, method18);
        java.lang.reflect.Field field20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method18, field20, true);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, 0L);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method11);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method13);
        java.lang.reflect.Field field16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, ' ', field16);
        java.lang.reflect.Field field18 = null;
        int int19 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) ' ', field18);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (java.lang.Object) '\000');
        java.lang.reflect.Method method4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field1, method4, (double) '#');
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 0L, method1, '\000');
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method12);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method13, field14, false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "hi!", 0L, field2);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method10, ' ', field12);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (float) 10, field2);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method5);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field10 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field10, (float) 100L);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field10, true, field14);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) '#', false, field2);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field11, (long) 10);
        java.lang.reflect.Method method14 = null;
        byte byte15 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) wildcardClass1, method14);
        java.lang.reflect.Field field16 = null;
        java.lang.Object obj17 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) method14, field16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 100, field1, (byte) 10);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (-1.0d), method1, 10);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field4, false);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Field field10 = null;
        float float11 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass3, field10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, field1, (java.lang.Object) wildcardClass3);
        java.lang.reflect.Field field13 = null;
        float float14 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass3, field13);
        java.lang.reflect.Method method15 = null;
        int int16 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) field13, method15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field13 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method14 = null;
        java.lang.Object obj15 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) wildcardClass1, method14);
        java.lang.reflect.Method method16 = null;
        short short17 = org.apache.openjpa.enhance.Reflection.getShort(obj15, method16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(field13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field8 = null;
        double double9 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) "", field8);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet11, method12, (long) (byte) 1);
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method12, field15, (int) 'a');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, (byte) 1, field2);
        java.lang.reflect.Method method4 = null;
        double double5 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) (byte) 1, method4);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field4, false);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Field field10 = null;
        float float11 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass3, field10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, field1, (java.lang.Object) wildcardClass3);
        java.lang.reflect.Method method13 = null;
        boolean boolean14 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass3, method13);
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection reflection16 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass17 = reflection16.getClass();
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, field18, false);
        java.lang.reflect.Method method23 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass17, "hi!", false);
        java.lang.reflect.Method method24 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, method24, (float) (short) 10);
        java.lang.reflect.Field field28 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, (float) 1L, field28);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) boolean14, field15, (java.lang.Object) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method33 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass17, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing getter for property \"hi!\" in type \"class org.apache.openjpa.enhance.Reflection\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 1.0d, method1, (int) (byte) 100);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 1, method1, (float) (short) -1);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.lang.reflect.Field field1 = null;
        java.lang.Object obj2 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) 0, field1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        byte byte6 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet4, method5);
        java.lang.reflect.Method method7 = null;
        char char8 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) strSet4, method7);
        java.lang.reflect.Field field9 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) char8, field9, (double) (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field4, false);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Field field10 = null;
        float float11 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass3, field10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, field1, (java.lang.Object) wildcardClass3);
        java.lang.reflect.Field field13 = null;
        float float14 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass3, field13);
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field13, field15, 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, false, field2);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        byte byte6 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet4, method5);
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method5, (float) (short) 10, field8);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.lang.reflect.Method method4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) double3, method4, (short) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.util.Set<java.lang.String> strSet14 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field17 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field18 = null;
        char char19 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) "", field18);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(field17);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.Object obj14 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field15 = null;
        short short16 = org.apache.openjpa.enhance.Reflection.getShort(obj14, field15);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, '#');
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method5, method8, false);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field14, (int) (short) 1);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method17, (short) (byte) -1);
        java.lang.reflect.Method method20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method20, (long) (short) 0);
        org.apache.openjpa.enhance.Reflection reflection24 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass25 = reflection24.getClass();
        java.lang.reflect.Field field26 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass25, field26, false);
        java.lang.reflect.Method method31 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass25, "", false);
        java.lang.reflect.Method method34 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass25, "hi!", false);
        java.lang.reflect.Method method35 = null;
        java.lang.reflect.Method method36 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass25, method35);
        java.lang.reflect.Method method38 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "", (java.lang.Class) wildcardClass25, false);
        java.lang.reflect.Field field39 = null;
        int int40 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass25, field39);
        java.lang.reflect.Field field41 = null;
        int int42 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) field39, field41);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method5);
        java.lang.reflect.Method method7 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method6, method7, 10L);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field4, false);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Field field10 = null;
        float float11 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass3, field10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, field1, (java.lang.Object) wildcardClass3);
        java.lang.reflect.Method method13 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, method13, (float) 0L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Field field18 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass3, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"hi!\" in type \"class org.apache.openjpa.enhance.Reflection\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field12 = null;
        org.apache.openjpa.enhance.Reflection reflection13 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass14 = reflection13.getClass();
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field12, (java.lang.Object) reflection13);
        java.lang.reflect.Method method16 = null;
        byte byte17 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) reflection13, method16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        char char6 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) wildcardClass1, method5);
        java.lang.reflect.Method method7 = null;
        long long8 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) method5, method7);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field4, false);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Field field10 = null;
        float float11 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass3, field10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, field1, (java.lang.Object) wildcardClass3);
        java.lang.reflect.Method method13 = null;
        boolean boolean14 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass3, method13);
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection reflection16 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass17 = reflection16.getClass();
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, field18, false);
        java.lang.reflect.Method method23 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass17, "", false);
        java.lang.reflect.Method method26 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass17, "hi!", false);
        java.lang.reflect.Method method27 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, method27, 0L);
        java.lang.reflect.Field field31 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, (short) (byte) 100, field31);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method13, field15, (java.lang.Object) wildcardClass17);
        java.lang.reflect.Method method34 = null;
        short short35 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) method13, method34);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertTrue("'" + short35 + "' != '" + (short) 0 + "'", short35 == (short) 0);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        byte byte2 = org.apache.openjpa.enhance.Reflection.getByte(obj0, method1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Method method16 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "", false);
        java.util.Set<java.lang.String> strSet17 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method18 = null;
        byte byte19 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) wildcardClass1, method18);
        java.lang.reflect.Field field21 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) byte19, ' ', field21);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (byte) 0, field2);
        java.lang.reflect.Field field4 = null;
        float float5 = org.apache.openjpa.enhance.Reflection.getFloat(obj0, field4);
        java.lang.reflect.Field field6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) float5, field6, ' ');
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.util.Set<java.lang.String> strSet14 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field15, (int) (short) 10);
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 10, field18, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field4, false);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Field field10 = null;
        float float11 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass3, field10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, field1, (java.lang.Object) wildcardClass3);
        java.lang.reflect.Field field13 = null;
        float float14 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass3, field13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Field field17 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass3, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"hi!\" in type \"class org.apache.openjpa.enhance.Reflection\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method11);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method13);
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method19 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing getter for property \"\" in type \"class org.apache.openjpa.enhance.Reflection\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method5);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field10 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field10, (float) 100L);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field10, (short) 100, field14);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method12);
        java.lang.reflect.Method method14 = null;
        java.lang.reflect.Method method15 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method14);
        java.lang.reflect.Method method16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method14, method16, (int) (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field13 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, true, field13);
        java.lang.reflect.Field field16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field13, true, field16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        byte byte6 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet4, method5);
        java.lang.reflect.Field field7 = null;
        byte byte8 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) method5, field7);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field1 = null;
        boolean boolean2 = org.apache.openjpa.enhance.Reflection.getBoolean(obj0, field1);
        java.lang.reflect.Field field3 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field3, (int) (short) 1);
        java.lang.reflect.Method method6 = null;
        byte byte7 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) (short) 1, method6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (short) -1);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, 1L);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (byte) 100, field2);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Method method16 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "", false);
        java.util.Set<java.lang.String> strSet17 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method18 = null;
        byte byte19 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) wildcardClass1, method18);
        java.lang.reflect.Field field20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method18, field20, (int) (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (double) 10L, field2);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (double) (byte) 100, field2);
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field2, field4, (long) (-1));
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field4, false);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Field field10 = null;
        float float11 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass3, field10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, field1, (java.lang.Object) wildcardClass3);
        java.lang.reflect.Method method13 = null;
        boolean boolean14 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass3, method13);
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection reflection16 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass17 = reflection16.getClass();
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, field18, false);
        java.lang.reflect.Method method23 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass17, "hi!", false);
        java.lang.reflect.Method method24 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, method24, (float) (short) 10);
        java.lang.reflect.Field field28 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, (float) 1L, field28);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) boolean14, field15, (java.lang.Object) wildcardClass17);
        java.lang.reflect.Method method31 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field15, method31, true);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.lang.reflect.Method method1 = null;
        boolean boolean2 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) '4', method1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 10.0f, method1, (short) -1);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 'a', field1, 100);
    }
}


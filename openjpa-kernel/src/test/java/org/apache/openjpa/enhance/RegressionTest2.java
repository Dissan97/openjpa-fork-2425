package org.apache.openjpa.enhance;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) byte15, method16, '\000');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, ' ', field18);
        java.lang.reflect.Field field20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field20, (long) ' ');
        java.lang.reflect.Field field24 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) ' ', (short) 0, field24);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 0, field1, (double) (byte) 0);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method16, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method12, (float) 100);
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 100, field15, 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, field1, (float) '#');
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field13 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet11, 100, field13);
        java.lang.reflect.Method method15 = null;
        long long16 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) strSet11, method15);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.lang.reflect.Field field1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) 1.0f, field1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        java.util.Set<java.lang.String> strSet16 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Field field19 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"hi!\" in type \"class org.apache.openjpa.enhance.Reflection\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (-1), field2);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method12, (int) (byte) 100, field15);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        byte byte2 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) reflection0, method1);
        java.lang.Class<?> wildcardClass3 = reflection0.getClass();
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field15, (long) '\000');
        java.util.Set<java.lang.String> strSet18 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.Class<?> wildcardClass19 = strSet18.getClass();
        java.lang.reflect.Method method20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass19, method20, (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (double) 100L);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (byte) 0, field2);
        java.lang.reflect.Field field4 = null;
        float float5 = org.apache.openjpa.enhance.Reflection.getFloat(obj0, field4);
        java.lang.Class<?> wildcardClass6 = obj0.getClass();
        java.lang.reflect.Method method7 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method7, 10);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        java.lang.reflect.Method method19 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field20, false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet14, field15, (short) (byte) 10);
        java.lang.reflect.Method method18 = null;
        short short19 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) strSet14, method18);
        java.lang.reflect.Field field21 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method18, (java.lang.Object) '4', field21);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Method method16 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) false, (double) 1L, field18);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, 10.0d);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Method method16 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method17, (double) 10);
        java.lang.reflect.Field field22 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field23 = null;
        char char24 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) field22, field23);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(field22);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (-1.0d), field2);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) 10.0d, method1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        long long21 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) wildcardClass1, field20);
        java.lang.reflect.Field field22 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) long21, field22, (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        byte byte6 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet4, method5);
        java.lang.reflect.Method method7 = null;
        char char8 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) strSet4, method7);
        java.lang.reflect.Method method9 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, method9, '4');
        java.lang.reflect.Method method12 = null;
        byte byte13 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet4, method12);
        java.lang.reflect.Method method14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) byte13, method14, (double) 10L);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        boolean boolean6 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass1, method5);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = null;
        float float11 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass1, method10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        java.util.Set<java.lang.String> strSet34 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass17);
        java.lang.reflect.Field field36 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, (byte) 0, field36);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(field33);
        org.junit.Assert.assertNotNull(strSet34);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field15, (long) '\000');
        java.lang.reflect.Method method18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method18, '4');
        java.lang.reflect.Method method21 = null;
        int int22 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) method18, method21);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        char char6 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) wildcardClass1, method5);
        java.lang.reflect.Field field7 = null;
        char char8 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) method5, field7);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field5 = null;
        float float6 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) strSet4, field5);
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, (int) 'a', field8);
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field8, (long) '#', field11);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method18, (int) '#');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 10, method1, ' ');
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) false, method1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field18, ' ');
        java.lang.reflect.Field field22 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (double) (byte) 1, field22);
        java.lang.reflect.Field field25 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 1, (double) 'a', field25);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        java.util.Set<java.lang.String> strSet34 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass17);
        java.util.Set<java.lang.String> strSet35 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass17);
        java.lang.reflect.Method method36 = null;
        java.lang.Object obj37 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) strSet35, method36);
        java.lang.reflect.Method method38 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet35, method38, false);
        java.lang.reflect.Field field41 = null;
        int int42 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) false, field41);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(field33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, 1);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method5);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method10, ' ');
        java.lang.reflect.Method method13 = null;
        float float14 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass1, method13);
        java.lang.reflect.Field field15 = null;
        long long16 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) float14, field15);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        byte byte6 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet4, method5);
        java.lang.reflect.Method method7 = null;
        char char8 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) strSet4, method7);
        java.lang.reflect.Method method9 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, method9, '4');
        java.lang.reflect.Field field12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, field12, (long) (short) 10);
        java.lang.reflect.Method method15 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, method15, 'a');
        java.lang.reflect.Field field19 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 'a', (byte) 0, field19);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field18, ' ');
        java.lang.reflect.Field field22 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field18, (byte) 100, field22);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(field17);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (float) (short) 1);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.lang.Object obj0 = null;
        org.apache.openjpa.enhance.Reflection reflection1 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass2 = reflection1.getClass();
        java.lang.reflect.Field field3 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass2, field3, false);
        java.lang.reflect.Method method8 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass2, "hi!", false);
        java.lang.reflect.Method method9 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass2, method9, (float) (short) 10);
        java.lang.reflect.Field field12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass2, field12, (long) 10);
        java.lang.reflect.Field field17 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass2, "hi!", false);
        java.lang.reflect.Method method18 = null;
        double double19 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass2, method18);
        java.lang.reflect.Field field20 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (java.lang.Object) double19, field20);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(field17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.Class<?> wildcardClass12 = strSet11.getClass();
        java.lang.reflect.Method method13 = null;
        int int14 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) strSet11, method13);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method15, method17, (int) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, '#');
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection reflection9 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass10 = reflection9.getClass();
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass10, field11, false);
        java.lang.reflect.Method method16 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass10, "", false);
        java.lang.reflect.Method method19 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass10, "hi!", false);
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass10, method20);
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass10, method22);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field8, (java.lang.Object) method22);
        java.lang.reflect.Method method27 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field29 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) false, (-1.0f), field29);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(method27);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
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
        short short16 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) wildcardClass3, field15);
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, true, field18);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        int int16 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass1, field15);
        java.lang.reflect.Field field17 = null;
        byte byte18 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) wildcardClass1, field17);
        java.lang.reflect.Field field20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, false, field20);
        java.lang.reflect.Field field22 = null;
        char char23 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) wildcardClass1, field22);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
        org.junit.Assert.assertTrue("'" + char23 + "' != '" + '\000' + "'", char23 == '\000');
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, ' ', field18);
        java.lang.reflect.Field field20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field20, (long) ' ');
        java.lang.reflect.Field field23 = null;
        char char24 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) field20, field23);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        short short16 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) wildcardClass3, method15);
        java.lang.reflect.Method method17 = null;
        double double18 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) method15, method17);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method41 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing getter for property \"hi!\" in type \"class org.apache.openjpa.enhance.Reflection\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
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
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (float) (short) 10, field20);
        java.lang.reflect.Field field22 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field22, '\000');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (byte) 0, field2);
        java.lang.reflect.Field field4 = null;
        char char5 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) (byte) 0, field4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (short) 1);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        java.lang.reflect.Method method15 = null;
        char char16 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) strSet11, method15);
        java.lang.reflect.Field field17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet11, field17, (double) 10L);
        java.lang.reflect.Field field20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 10L, field20, 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (float) 0);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
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
        short short16 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) wildcardClass3, field15);
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass3, method17);
        java.lang.reflect.Field field19 = null;
        boolean boolean20 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) method18, field19);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
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
        long long40 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) wildcardClass1, field39);
        java.lang.reflect.Field field41 = null;
        short short42 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) wildcardClass1, field41);
        java.lang.reflect.Field field44 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (float) 10L, field44);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + short42 + "' != '" + (short) 0 + "'", short42 == (short) 0);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        byte byte2 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) reflection0, method1);
        java.lang.reflect.Field field3 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, field3, (byte) -1);
        java.lang.reflect.Method method6 = null;
        char char7 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) reflection0, method6);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '\000' + "'", char7 == '\000');
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, (float) (short) 10);
        java.util.Set<java.lang.String> strSet8 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method11 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "", false);
        java.util.Set<java.lang.String> strSet12 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field13 = null;
        short short14 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) strSet12, field13);
        java.lang.reflect.Field field16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field13, (long) (-1), field16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet11, field12, ' ');
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet11, field15, (byte) 10);
        java.lang.reflect.Method method18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 10, method18, (float) (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        java.lang.reflect.Field field15 = null;
        int int16 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass1, field15);
        java.lang.reflect.Method method17 = null;
        long long18 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) wildcardClass1, method17);
        java.lang.reflect.Field field19 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field19, '\000');
        java.lang.reflect.Field field23 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) '\000', false, field23);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        java.lang.reflect.Method method20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method20, (byte) 1);
        java.lang.reflect.Method method23 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 1, method23, (double) (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.Class<?> wildcardClass12 = strSet11.getClass();
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass12, '4', field14);
        java.lang.reflect.Field field17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field14, true, field17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
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
        java.lang.reflect.Field field17 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass3, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Field field20 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass3, "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"\" in type \"class org.apache.openjpa.enhance.Reflection\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(field17);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field11, (long) 10);
        java.lang.reflect.Field field16 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method17 = null;
        double double18 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, method17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj21 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) double18, "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"\" in type \"class java.lang.Double\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(field16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, (short) 100, field6);
        java.lang.reflect.Method method8 = null;
        long long9 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) strSet4, method8);
        java.lang.reflect.Method method10 = null;
        long long11 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) strSet4, method10);
        java.lang.reflect.Method method12 = null;
        char char13 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) strSet4, method12);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, method13, (double) (byte) 1);
        java.lang.reflect.Method method16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method13, method16, (double) 100);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        java.lang.Object obj22 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) strSet17, "hi!", false);
        java.lang.reflect.Field field23 = null;
        int int24 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) "hi!", field23);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, (int) (byte) -1, field6);
        java.lang.Class<?> wildcardClass8 = strSet4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (int) (byte) -1, field2);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
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
        java.util.Set<java.lang.String> strSet34 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass17);
        java.lang.reflect.Method method35 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet34, method35, 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(field33);
        org.junit.Assert.assertNotNull(strSet34);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, (byte) 1, field2);
        java.lang.reflect.Method method4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, method4, (int) (short) 0);
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 0, 0, field8);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
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
        org.apache.openjpa.enhance.Reflection reflection16 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass17 = reflection16.getClass();
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, field18, false);
        java.lang.reflect.Method method21 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, method21, '#');
        java.lang.reflect.Field field24 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, field24, (long) (short) 10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet14, method15, (java.lang.Object) (short) 10);
        java.lang.reflect.Field field28 = null;
        double double29 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) (short) 10, field28);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet11, method12, (float) (byte) 1);
        java.lang.reflect.Field field15 = null;
        long long16 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) method12, field15);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
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
        short short16 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) wildcardClass3, field15);
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass3, method17);
        java.lang.reflect.Field field19 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field19, (long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method24 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass3, "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing getter for property \"\" in type \"class org.apache.openjpa.enhance.Reflection\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
        org.junit.Assert.assertNull(method18);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        java.util.Set<java.lang.String> strSet34 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass17);
        java.util.Set<java.lang.String> strSet35 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass17);
        java.lang.reflect.Method method36 = null;
        java.lang.Object obj37 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) strSet35, method36);
        java.lang.reflect.Field field38 = null;
        java.lang.Object obj39 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) method36, field38);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(field33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj39);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (float) 100);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        java.util.Set<java.lang.String> strSet16 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.util.Set<java.lang.String> strSet17 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet17, field18, (double) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        char char6 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) wildcardClass1, method5);
        java.lang.reflect.Field field7 = null;
        long long8 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) wildcardClass1, field7);
        java.lang.reflect.Field field9 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) long8, field9, (-1));
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field18, ' ');
        java.lang.reflect.Method method21 = null;
        java.lang.Object obj22 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) wildcardClass1, method21);
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field23, obj24);
        java.lang.reflect.Method method26 = null;
        double double27 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, method26);
        java.lang.reflect.Field field28 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) double27, field28, (long) 'a');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
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
        java.lang.reflect.Field field31 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, field31, 100.0d);
        java.lang.reflect.Field field34 = null;
        double double35 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) field31, field34);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method19, (double) 1L);
        java.lang.reflect.Method method22 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method19, method22, true);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        java.lang.reflect.Field field31 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, field31, 100.0d);
        java.lang.reflect.Method method34 = null;
        java.lang.reflect.Method method35 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass17, method34);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(method35);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field12, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, (double) 0, field14);
        java.lang.reflect.Field field16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field14, field16, 0L);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (java.lang.Object) '\000');
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field4, (short) 0);
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (byte) 0, field8);
        java.lang.reflect.Field field10 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 0, field10, (byte) -1);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (byte) 0, field2);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass4, method5, (byte) -1);
        java.util.Set<java.lang.String> strSet8 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        java.lang.reflect.Field field15 = null;
        int int16 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass1, field15);
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (long) (short) 100, field18);
        java.lang.reflect.Method method20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, method20, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        short short16 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) strSet11, field15);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj6 = org.apache.openjpa.enhance.Reflection.getValue(obj0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"hi!\" in type \"class java.lang.Object\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (short) (byte) 100, field15);
        java.lang.reflect.Method method17 = null;
        byte byte18 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) wildcardClass1, method17);
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Method method20 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method19);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        java.util.Set<java.lang.String> strSet16 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.util.Set<java.lang.String> strSet17 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field18 = null;
        short short19 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) strSet17, field18);
        java.lang.Class<?> wildcardClass20 = strSet17.getClass();
        java.lang.reflect.Method method21 = null;
        long long22 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) strSet17, method21);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.lang.Object obj0 = null;
        org.apache.openjpa.enhance.Reflection reflection1 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass2 = reflection1.getClass();
        java.lang.reflect.Field field3 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass2, field3, false);
        java.lang.reflect.Method method8 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass2, "", false);
        java.lang.reflect.Method method11 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass2, "hi!", false);
        java.lang.reflect.Method method12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass2, method12, 0L);
        java.lang.reflect.Method method17 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass2, "", false);
        java.util.Set<java.lang.String> strSet18 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass2);
        java.lang.reflect.Field field19 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass2, field19, ' ');
        java.lang.reflect.Field field22 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (java.lang.Object) field19, field22);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, (short) 100, field6);
        java.lang.Object obj10 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) field6, "", false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, method31, true);
        java.lang.reflect.Method method34 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method31, method34, (double) (-1L));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method23, (double) (short) 0);
        java.lang.reflect.Field field27 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method23, true, field27);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
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
        java.util.Set<java.lang.String> strSet34 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass17);
        java.lang.reflect.Field field35 = null;
        long long36 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) strSet34, field35);
        java.lang.reflect.Method method37 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet34, method37, false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(field33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        java.lang.reflect.Method method15 = null;
        char char16 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) strSet11, method15);
        java.lang.Class<?> wildcardClass17 = strSet11.getClass();
        java.lang.reflect.Field field18 = null;
        float float19 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass17, field18);
        java.lang.reflect.Method method22 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass17, "", false);
        java.lang.reflect.Method method23 = null;
        long long24 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) wildcardClass17, method23);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
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
        java.lang.reflect.Method method41 = null;
        int int42 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) field39, method41);
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
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet11, field12, ' ');
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) ' ', field15, (long) (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
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
        java.lang.Object obj18 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) wildcardClass1, method17);
        java.lang.reflect.Field field19 = null;
        byte byte20 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) wildcardClass1, field19);
        java.util.Set<java.lang.String> strSet21 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
        org.junit.Assert.assertNotNull(strSet21);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field5 = null;
        byte byte6 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet4, field5);
        java.lang.reflect.Field field7 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, field7, ' ');
        java.lang.reflect.Field field10 = null;
        short short11 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) ' ', field10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (short) 10, field2);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, 10);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (short) (byte) 0);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        java.util.Set<java.lang.String> strSet19 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(field13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(field18);
        org.junit.Assert.assertNotNull(strSet19);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        boolean boolean16 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) strSet14, field15);
        java.lang.Class<?> wildcardClass17 = strSet14.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, method15, '\000');
        java.lang.reflect.Method method18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) '\000', method18, ' ');
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, '#', field2);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (double) 100L, field16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field12 = null;
        byte byte13 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) wildcardClass1, field12);
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) byte13, (float) (byte) 10, field15);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (byte) 0, field2);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        java.lang.reflect.Field field6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass4, (long) 100, field6);
        java.lang.reflect.Field field8 = null;
        float float9 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) field6, field8);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (float) (short) 10, field18);
        java.lang.reflect.Field field21 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (long) 'a', field21);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, (float) (short) 10);
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 10, field8, (int) 'a');
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, '\000');
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (double) 10.0f);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) '#', field1, (int) (byte) 1);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        java.lang.Class class0 = null;
        java.lang.reflect.Field field3 = org.apache.openjpa.enhance.Reflection.findField(class0, "", false);
        org.junit.Assert.assertNull(field3);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (float) (short) 10, field18);
        java.lang.reflect.Field field20 = null;
        boolean boolean21 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass1, field20);
        java.lang.reflect.Method method22 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method22, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.Class<?> wildcardClass12 = strSet11.getClass();
        java.lang.reflect.Method method13 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass12, method13, (short) 100);
        java.lang.reflect.Field field18 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass12, "hi!", false);
        java.lang.reflect.Field field19 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass12, field19, (-1));
        java.lang.reflect.Method method24 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass12, "", false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(field18);
        org.junit.Assert.assertNull(method24);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
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
        java.lang.reflect.Method method15 = null;
        char char16 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) strSet11, method15);
        java.lang.Class<?> wildcardClass17 = strSet11.getClass();
        java.lang.reflect.Field field18 = null;
        float float19 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass17, field18);
        java.lang.reflect.Method method20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) float19, method20, (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field12, (long) (short) 10);
        java.lang.reflect.Field field15 = null;
        java.lang.Object obj16 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) field12, field15);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
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
        java.lang.reflect.Field field16 = null;
        byte byte17 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) wildcardClass1, field16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj20 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) wildcardClass1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"hi!\" in type \"class java.lang.Class\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (java.lang.Object) '\000');
        java.lang.reflect.Field field4 = null;
        byte byte5 = org.apache.openjpa.enhance.Reflection.getByte(obj0, field4);
        java.lang.reflect.Field field7 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field4, (long) '4', field7);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, method1, (byte) 1);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method12, (float) 100);
        java.lang.reflect.Method method15 = null;
        boolean boolean16 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass1, method15);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method15, method17, (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (int) '#');
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        java.lang.Class class0 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field4, false);
        java.lang.reflect.Method method7 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, method7, (float) (short) 10);
        java.util.Set<java.lang.String> strSet10 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass3);
        java.lang.reflect.Method method12 = org.apache.openjpa.enhance.Reflection.findSetter(class0, "", (java.lang.Class) wildcardClass3, false);
        java.lang.reflect.Method method13 = null;
        java.lang.reflect.Method method14 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass3, method13);
        java.lang.reflect.Method method15 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method13, method15, '4');
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
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
        java.util.Set<java.lang.String> strSet34 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass17);
        java.util.Set<java.lang.String> strSet35 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass17);
        java.lang.reflect.Method method36 = null;
        short short37 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) wildcardClass17, method36);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(field33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) 0 + "'", short37 == (short) 0);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, (int) (byte) -1, field6);
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, field8, (double) (-1));
        java.lang.reflect.Field field12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field8, (float) (byte) 1, field12);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, 10);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field12 = null;
        byte byte13 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) wildcardClass1, field12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method16 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing getter for property \"hi!\" in type \"class org.apache.openjpa.enhance.Reflection\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        java.lang.reflect.Field field1 = null;
        byte byte2 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) 10L, field1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (double) 0.0f);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) ' ', false, field2);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        java.lang.reflect.Field field1 = null;
        byte byte2 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) 1, field1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        java.lang.reflect.Method method19 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field20 = null;
        short short21 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) method19, field20);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method11, (double) ' ', field15);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field15, true);
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field18, 0.0d);
        java.lang.reflect.Method method21 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, method21, true);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (short) (byte) 0, field6);
        java.lang.reflect.Field field9 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, '\000', field9);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) '\000', method11, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Field field12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (short) -1, field12);
        java.lang.reflect.Method method14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) -1, method14, (double) (-1));
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.Class<?> wildcardClass12 = strSet11.getClass();
        java.lang.reflect.Method method13 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass12, method13, (short) 100);
        java.lang.reflect.Method method16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method13, method16, (int) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        byte byte6 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet4, method5);
        java.lang.reflect.Method method7 = null;
        char char8 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) strSet4, method7);
        java.lang.reflect.Method method9 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, method9, '4');
        java.lang.reflect.Method method12 = null;
        java.lang.Object obj13 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) '4', method12);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method12, (float) 100);
        java.lang.reflect.Method method15 = null;
        boolean boolean16 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass1, method15);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection reflection18 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass19 = reflection18.getClass();
        java.lang.reflect.Field field20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass19, field20, false);
        java.lang.reflect.Method method25 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass19, "", false);
        java.lang.reflect.Method method28 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass19, "hi!", false);
        java.lang.reflect.Method method29 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass19, method29, 0L);
        java.util.Set<java.lang.String> strSet32 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass19);
        java.lang.reflect.Field field33 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet32, field33, (short) (byte) 10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method15, method17, (java.lang.Object) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNotNull(strSet32);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, (int) (byte) -1, field6);
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, field8, (double) (byte) 100);
        java.lang.reflect.Field field12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, 0.0d, field12);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 0.0d, field14, (float) '4');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
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
        java.lang.reflect.Method method22 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field24 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) false, (float) (short) 1, field24);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
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
        java.lang.reflect.Method method15 = null;
        char char16 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) strSet11, method15);
        java.lang.Class<?> wildcardClass17 = strSet11.getClass();
        java.lang.reflect.Field field18 = null;
        float float19 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass17, field18);
        java.lang.reflect.Field field20 = null;
        short short21 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) float19, field20);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, '#');
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) wildcardClass1, field5);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = null;
        float float11 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) method9, method10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
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
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field18, (double) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        byte byte6 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet4, method5);
        java.lang.reflect.Method method7 = null;
        char char8 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) strSet4, method7);
        java.lang.reflect.Method method9 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, method9, '4');
        java.lang.reflect.Field field12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, field12, (long) (short) 10);
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, field15, true);
        java.lang.reflect.Field field18 = null;
        java.lang.Object obj19 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) field15, field18);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        org.apache.openjpa.enhance.Reflection reflection16 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass17 = reflection16.getClass();
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, field18, false);
        java.lang.reflect.Method method21 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, method21, '#');
        java.lang.reflect.Field field24 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, field24, (long) (short) 10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet14, method15, (java.lang.Object) (short) 10);
        java.lang.reflect.Field field28 = null;
        char char29 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) (short) 10, field28);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (java.lang.Object) '\000');
        java.lang.reflect.Field field4 = null;
        byte byte5 = org.apache.openjpa.enhance.Reflection.getByte(obj0, field4);
        java.lang.reflect.Field field6 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field6, (short) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field3 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, true, field3);
        java.lang.reflect.Field field5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) true, field5, (long) ' ');
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field13 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet11, (long) '\000', field13);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Field field12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (double) (-1.0f), field12);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
        java.lang.reflect.Field field15 = null;
        int int16 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass1, field15);
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, false, field18);
        java.lang.reflect.Method method20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method20, (float) 1);
        java.lang.reflect.Field field24 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 1, 100, field24);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, method1, 1L);
        java.lang.reflect.Field field5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, '#', field5);
        java.lang.reflect.Field field7 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, field7, 0.0d);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.Object obj13 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) false, "hi!", false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        java.lang.reflect.Method method22 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) false, field23);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        java.lang.reflect.Field field26 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "", 'a', field26);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field12 = null;
        short short13 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) strSet11, field12);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        boolean boolean6 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass1, method5);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field39, (byte) 0);
        java.lang.reflect.Method method42 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method42, (int) (short) 100);
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
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
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
        java.lang.reflect.Field field16 = null;
        float float17 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass1, field16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        float float12 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) false, method11);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        long long40 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) wildcardClass1, field39);
        java.lang.reflect.Field field42 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) long40, false, field42);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        java.lang.reflect.Field field17 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field18 = null;
        float float19 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) false, field18);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(field17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Method method14 = null;
        char char15 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) wildcardClass1, method14);
        java.lang.reflect.Method method16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method16, (long) 0);
        java.lang.reflect.Field field20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 0, (short) (byte) 1, field20);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (short) 0);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) reflection0, method1);
        java.lang.reflect.Method method3 = null;
        java.lang.Object obj4 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) reflection0, method3);
        java.lang.reflect.Field field6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, (int) (short) 10, field6);
        java.lang.reflect.Field field9 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field6, (double) 100L, field9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field15, (long) '\000');
        java.lang.reflect.Method method18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method18, '4');
        java.lang.reflect.Field field21 = null;
        double double22 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) method18, field21);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, '#');
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field8, (long) (short) 10);
        java.lang.reflect.Method method11 = null;
        int int12 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) (short) 10, method11);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field11, (long) 10);
        java.lang.reflect.Field field16 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) false, field17, ' ');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(field16);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
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
        int int25 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) strSet23, method24);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, 100L);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "hi!", field23, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method19, (double) 1L);
        java.lang.reflect.Method method22 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method22, (int) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field13 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method14 = null;
        java.lang.Object obj15 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) wildcardClass1, method14);
        java.util.Set<java.lang.String> strSet16 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field17 = null;
        double double18 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) strSet16, field17);
        java.lang.reflect.Field field20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field17, (double) 0L, field20);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(field13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 10, method1, false);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (java.lang.Object) '\000');
        java.lang.reflect.Field field5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) '\000', (int) (short) 1, field5);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "hi!", field1, (long) (short) 0);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.Class<?> wildcardClass12 = strSet11.getClass();
        org.apache.openjpa.enhance.Reflection reflection14 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass15 = reflection14.getClass();
        java.lang.reflect.Field field16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass15, field16, false);
        java.lang.reflect.Method method21 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass15, "hi!", false);
        java.lang.reflect.Method method22 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass15, method22, (float) (short) 10);
        java.util.Set<java.lang.String> strSet25 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass15);
        java.lang.reflect.Field field27 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass15, true, field27);
        java.lang.reflect.Field field29 = null;
        int int30 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass15, field29);
        java.lang.reflect.Method method32 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass12, "", (java.lang.Class) wildcardClass15, false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Field field35 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass12, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"hi!\" in type \"class java.util.Collections$EmptySet\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(method32);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (double) (-1L), field2);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        boolean boolean25 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass1, method24);
        java.lang.reflect.Field field26 = null;
        short short27 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) boolean25, field26);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (int) '\000');
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method18, (int) ' ', field21);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, method1, 1L);
        java.lang.reflect.Field field5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, '#', field5);
        java.lang.reflect.Method method7 = null;
        short short8 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) reflection0, method7);
        java.lang.reflect.Method method9 = null;
        java.lang.Object obj10 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) reflection0, method9);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set(obj10, method11, (byte) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, method31, true);
        java.lang.reflect.Method method34 = null;
        int int35 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass17, method34);
        java.lang.reflect.Method method36 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, method36, false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Method method1 = null;
        byte byte2 = org.apache.openjpa.enhance.Reflection.getByte(obj0, method1);
        java.lang.reflect.Field field3 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field3, 10L);
        java.lang.Class<?> wildcardClass6 = obj0.getClass();
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (float) (short) 1);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field15, true);
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field18, 0.0d);
        java.util.Set<java.lang.String> strSet21 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass3);
        java.lang.reflect.Field field22 = null;
        int int23 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass3, field22);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method12 = null;
        double double13 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) strSet11, method12);
        java.lang.Class<?> wildcardClass14 = strSet11.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (short) 0);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method5);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method10, ' ');
        java.lang.reflect.Method method13 = null;
        float float14 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass1, method13);
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field15, (byte) 100);
        java.lang.reflect.Field field18 = null;
        byte byte19 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) field15, field18);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field8 = null;
        float float9 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass1, field8);
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, true, field11);
        java.lang.Object obj15 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) field11, "hi!", false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field13 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method14 = null;
        java.lang.Object obj15 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) wildcardClass1, method14);
        java.util.Set<java.lang.String> strSet16 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field17 = null;
        double double18 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) strSet16, field17);
        java.lang.reflect.Field field19 = null;
        double double20 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) double18, field19);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(field13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Method method11 = null;
        char char12 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) wildcardClass1, method11);
        java.lang.reflect.Method method13 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method11, method13, (int) (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + '\000' + "'", char12 == '\000');
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        long long21 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) wildcardClass1, field20);
        java.lang.reflect.Field field22 = null;
        boolean boolean23 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) field20, field22);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        java.lang.reflect.Field field26 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, true, field26);
        java.lang.reflect.Method method28 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) true, method28, ' ');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
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
        java.lang.reflect.Method method15 = null;
        char char16 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) strSet11, method15);
        java.lang.Class<?> wildcardClass17 = strSet11.getClass();
        java.lang.reflect.Field field18 = null;
        float float19 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass17, field18);
        java.lang.reflect.Method method20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field18, method20, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, (byte) 1, field2);
        java.lang.reflect.Field field4 = null;
        java.lang.Object obj5 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) reflection0, field4);
        java.lang.reflect.Method method6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, method6, '\000');
        java.lang.reflect.Field field9 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, field9, (double) 100);
        java.lang.reflect.Method method12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, method12, (long) (short) 0);
        java.lang.reflect.Field field16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, (short) (byte) -1, field16);
        java.lang.reflect.Field field18 = null;
        byte byte19 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) field16, field18);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 10, method1, (byte) 100);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        byte byte6 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet4, method5);
        java.lang.reflect.Method method7 = null;
        char char8 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) strSet4, method7);
        java.lang.reflect.Method method9 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, method9, '4');
        java.lang.reflect.Field field12 = null;
        long long13 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) strSet4, field12);
        java.lang.reflect.Method method14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) long13, method14, (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field15, (int) (short) 1);
        java.lang.reflect.Method method18 = null;
        float float19 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass1, method18);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 100.0d, field1, (short) 10);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
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
        java.lang.reflect.Field field15 = null;
        int int16 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass1, field15);
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, false, field18);
        java.lang.reflect.Field field20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field20, (long) (byte) 0);
        java.util.Set<java.lang.String> strSet23 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field24 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field24, (long) 'a');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, (int) (byte) -1, field6);
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, field8, (double) (-1));
        java.lang.reflect.Field field12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (-1), (byte) -1, field12);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method24, (byte) 0);
        java.lang.reflect.Method method27 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method27, false);
        java.lang.reflect.Field field31 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (float) (-1), field31);
        java.lang.reflect.Method method33 = null;
        boolean boolean34 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) field31, method33);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
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
        java.util.Set<java.lang.String> strSet16 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.util.Set<java.lang.String> strSet17 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field18 = null;
        short short19 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) strSet17, field18);
        java.lang.reflect.Field field21 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field18, (short) 100, field21);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (byte) 0, field2);
        java.lang.reflect.Field field4 = null;
        float float5 = org.apache.openjpa.enhance.Reflection.getFloat(obj0, field4);
        java.lang.Class<?> wildcardClass6 = obj0.getClass();
        java.lang.reflect.Field field7 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field7, 10.0d);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field14, 'a');
        java.lang.reflect.Method method17 = null;
        char char18 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) 'a', method17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, (short) 100, field6);
        java.lang.reflect.Method method8 = null;
        long long9 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) strSet4, method8);
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, (long) (short) 1, field11);
        java.lang.Class<?> wildcardClass13 = strSet4.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method16 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass13, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing getter for property \"hi!\" in type \"class java.util.Collections$EmptySet\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        char char26 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) "", field25);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '\000' + "'", char26 == '\000');
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, (float) (short) 10);
        java.util.Set<java.lang.String> strSet8 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method9 = null;
        float float10 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass1, method9);
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field11, (short) 1);
        java.lang.reflect.Method method14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 1, method14, (short) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field15, (long) '\000');
        java.util.Set<java.lang.String> strSet18 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field19 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field19, true);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(strSet18);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field1 = null;
        boolean boolean2 = org.apache.openjpa.enhance.Reflection.getBoolean(obj0, field1);
        java.lang.Class<?> wildcardClass3 = obj0.getClass();
        java.lang.reflect.Field field6 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "", (-1), field8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(field6);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
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
        java.lang.reflect.Field field31 = null;
        org.apache.openjpa.enhance.Reflection reflection32 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass33 = reflection32.getClass();
        java.lang.reflect.Field field34 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass33, field34, false);
        java.lang.reflect.Method method37 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass33, method37, (float) (short) 10);
        java.util.Set<java.lang.String> strSet40 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass33);
        java.lang.reflect.Field field42 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass33, ' ', field42);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field15, field31, (java.lang.Object) ' ');
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(strSet40);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        java.lang.reflect.Method method15 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method15, 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
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
        java.lang.reflect.Field field17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field17, (byte) 100);
        java.lang.reflect.Field field21 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 100, true, field21);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
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
        java.lang.reflect.Field field16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field16, (int) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (long) 100);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method12, (float) 100);
        java.lang.Object obj17 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) method12, "hi!", false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        java.lang.reflect.Method method17 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass3, method18);
        java.lang.reflect.Method method20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, method20, (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
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
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field18, ' ');
        java.lang.reflect.Method method21 = null;
        java.lang.Object obj22 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) wildcardClass1, method21);
        java.lang.reflect.Field field23 = null;
        java.lang.Object obj24 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field23, obj24);
        java.lang.reflect.Method method26 = null;
        double double27 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, method26);
        java.lang.reflect.Method method28 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) double27, method28, (long) '#');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field15, true);
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field18, 0.0d);
        java.util.Set<java.lang.String> strSet21 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass3);
        java.lang.reflect.Method method22 = null;
        boolean boolean23 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) strSet21, method22);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
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
        java.util.Set<java.lang.String> strSet34 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass17);
        java.util.Set<java.lang.String> strSet35 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass17);
        java.lang.reflect.Method method36 = null;
        java.lang.Object obj37 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) strSet35, method36);
        java.lang.reflect.Field field38 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet35, field38, (int) ' ');
        java.lang.reflect.Field field42 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet35, (short) (byte) 100, field42);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(field33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
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
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, true, field18);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Field field14 = null;
        double double15 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field14);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
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
        java.lang.reflect.Field field17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field12, (long) (short) 1, field17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method15);
        java.lang.reflect.Method method17 = null;
        java.lang.reflect.Method method18 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method17);
        java.lang.reflect.Field field19 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field19, (int) '\000');
        java.lang.reflect.Field field23 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (float) (byte) -1, field23);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(method18);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
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
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field18, ' ');
        java.lang.reflect.Method method21 = null;
        java.lang.Object obj22 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) wildcardClass1, method21);
        java.lang.reflect.Method method23 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method23, '4');
        java.lang.reflect.Field field26 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method23, field26, (double) (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method24, (byte) 0);
        java.lang.reflect.Method method27 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method27, false);
        java.lang.reflect.Field field31 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (float) (-1), field31);
        java.util.Set<java.lang.String> strSet33 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field35 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet33, 0L, field35);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet33);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        double double6 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, method5);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method5);
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (float) 100L, field8);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        java.util.Set<java.lang.String> strSet16 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.util.Set<java.lang.String> strSet17 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method18, (double) 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field14, false);
        java.lang.reflect.Method method17 = null;
        int int18 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass1, method17);
        java.lang.reflect.Field field19 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field19, false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        java.lang.reflect.Method method20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) byte19, method20, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 100, 0L, field2);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field14, (double) (short) 10);
        java.lang.reflect.Method method17 = null;
        boolean boolean18 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass1, method17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (float) 1L);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Method method16 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method17, (double) 10);
        java.lang.reflect.Field field22 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field24 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (double) 0, field24);
        java.lang.reflect.Method method26 = null;
        int int27 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass1, method26);
        java.lang.reflect.Method method28 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) int27, method28, (int) (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(field22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, (byte) 1, field2);
        java.lang.reflect.Method method4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, method4, (int) (short) 0);
        java.lang.reflect.Method method7 = null;
        byte byte8 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) reflection0, method7);
        java.lang.reflect.Method method9 = null;
        long long10 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) reflection0, method9);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 1, field1, (float) ' ');
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        byte byte6 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet4, method5);
        java.lang.reflect.Method method7 = null;
        char char8 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) strSet4, method7);
        java.lang.reflect.Method method9 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, method9, '4');
        java.lang.reflect.Field field12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, field12, (long) (short) 10);
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field12, field15, (float) (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
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
        java.lang.reflect.Method method34 = null;
        byte byte35 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) wildcardClass17, method34);
        java.lang.reflect.Method method36 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, method36, (float) (byte) 0);
        java.lang.reflect.Field field40 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 0, '\000', field40);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(field33);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 0 + "'", byte35 == (byte) 0);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
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
        java.lang.reflect.Method method34 = null;
        byte byte35 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) wildcardClass17, method34);
        java.lang.reflect.Field field36 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, field36, (double) '#');
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(field33);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 0 + "'", byte35 == (byte) 0);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
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
        java.lang.reflect.Field field34 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, field34, (int) (short) 10);
        java.lang.reflect.Method method37 = null;
        int int38 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) (short) 10, method37);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        java.lang.reflect.Field field15 = null;
        int int16 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass1, field15);
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, false, field18);
        java.lang.reflect.Method method22 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "hi!", false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field15, (long) '\000');
        java.util.Set<java.lang.String> strSet18 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field19 = null;
        byte byte20 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet18, field19);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
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
        float float16 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) strSet14, field15);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
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
        java.lang.reflect.Method method34 = null;
        byte byte35 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) wildcardClass17, method34);
        java.lang.reflect.Method method36 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, method36, (float) (byte) 0);
        java.lang.reflect.Field field39 = null;
        int int40 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) (byte) 0, field39);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(field33);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 0 + "'", byte35 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
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
        java.util.Set<java.lang.String> strSet16 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.util.Set<java.lang.String> strSet17 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method20 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method21 = null;
        java.lang.reflect.Method method22 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method21);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field18, ' ');
        java.lang.reflect.Field field21 = null;
        byte byte22 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) field18, field21);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(field17);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 0 + "'", byte22 == (byte) 0);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Field field12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (short) -1, field12);
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (byte) -1, field15);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
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
        int int16 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) method13, field15);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, (float) (short) 10);
        java.util.Set<java.lang.String> strSet8 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method11 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "", false);
        java.util.Set<java.lang.String> strSet12 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field13 = null;
        short short14 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) strSet12, field13);
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) short14, field15, (double) 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, (int) (byte) -1, field6);
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, field8, (double) (-1));
        java.lang.reflect.Method method11 = null;
        boolean boolean12 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) field8, method11);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "", (short) (byte) -1, field2);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Field field5 = null;
        boolean boolean6 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass1, field5);
        java.lang.reflect.Method method7 = null;
        java.lang.Object obj8 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) wildcardClass1, method7);
        java.lang.reflect.Field field10 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (long) (short) 10, field10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        java.lang.reflect.Field field17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field17, (byte) 100);
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method20);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        java.util.Set<java.lang.String> strSet16 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet16, method17, (double) 100.0f);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
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
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, ' ', field18);
        java.lang.reflect.Field field20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field20, (long) ' ');
        java.lang.reflect.Field field23 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field23, false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        java.lang.reflect.Field field1 = null;
        char char2 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) (byte) 100, field1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 0L, field16, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (double) 100.0f);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (byte) 1);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field15, true);
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass3, method18);
        java.lang.reflect.Method method20 = null;
        char char21 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) wildcardClass3, method20);
        java.lang.reflect.Field field23 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method20, (float) 0L, field23);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet11, field12, ' ');
        java.lang.reflect.Field field16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field12, (byte) 100, field16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet11, method12, (float) (byte) 1);
        java.lang.reflect.Field field16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method12, (int) (byte) 0, field16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, (float) (short) 10);
        java.util.Set<java.lang.String> strSet8 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field9 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet8, field9, 10.0f);
        java.lang.reflect.Field field12 = null;
        double double13 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) strSet8, field12);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, (float) (short) 10);
        java.util.Set<java.lang.String> strSet8 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field9 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet8, field9, 10.0f);
        java.lang.reflect.Field field13 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field9, false, field13);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Method method14 = null;
        char char15 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) wildcardClass1, method14);
        java.lang.reflect.Method method16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method16, (long) 0);
        java.lang.reflect.Method method19 = null;
        int int20 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) 0, method19);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Method method16 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method17, (double) 10);
        java.lang.reflect.Field field22 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field24 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (double) 0, field24);
        java.lang.reflect.Method method26 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method26, (double) 100L);
        java.lang.reflect.Field field29 = null;
        char char30 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) wildcardClass1, field29);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(field22);
        org.junit.Assert.assertTrue("'" + char30 + "' != '" + '\000' + "'", char30 == '\000');
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field4 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, true);
        java.lang.reflect.Field field9 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, false, field9);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(field4);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (long) (short) 100);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
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
        java.lang.reflect.Field field25 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet23, (double) 1L, field25);
        java.lang.reflect.Field field27 = null;
        short short28 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) field25, field27);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 0 + "'", short28 == (short) 0);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, 1, field2);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
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
        java.lang.reflect.Field field15 = null;
        int int16 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass1, field15);
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, false, field18);
        java.lang.reflect.Field field20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field20, (long) (byte) 0);
        java.util.Set<java.lang.String> strSet23 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field25 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (long) (byte) 1, field25);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field4 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, true);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) true, method8, true);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(field4);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
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
        java.lang.Object obj18 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) wildcardClass1, method17);
        java.lang.reflect.Method method19 = null;
        java.lang.reflect.Method method20 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method19);
        java.lang.reflect.Field field22 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method19, (double) 1.0f, field22);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (float) (short) 10, field20);
        java.lang.reflect.Method method22 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method22, (byte) -1);
        java.lang.reflect.Field field25 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field25, (short) 0);
        java.lang.reflect.Method method28 = null;
        double double29 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, method28);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, method15, '\000');
        java.lang.reflect.Method method20 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass3, "", false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
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
        java.lang.reflect.Method method34 = null;
        byte byte35 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) wildcardClass17, method34);
        java.lang.reflect.Field field36 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method34, field36, '4');
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(field33);
        org.junit.Assert.assertTrue("'" + byte35 + "' != '" + (byte) 0 + "'", byte35 == (byte) 0);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
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
        int int16 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass1, field15);
        java.lang.reflect.Field field17 = null;
        byte byte18 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) wildcardClass1, field17);
        java.lang.reflect.Field field19 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field17, field19, 1L);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 1L, method1, (double) (-1));
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field1 = null;
        boolean boolean2 = org.apache.openjpa.enhance.Reflection.getBoolean(obj0, field1);
        java.lang.reflect.Field field3 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field3, (float) (-1L));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set(obj2, (byte) 0, field4);
        java.lang.Class<?> wildcardClass6 = obj2.getClass();
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, obj2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
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
        java.lang.reflect.Method method20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method20, (byte) 1);
        java.lang.reflect.Method method25 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field27 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "hi!", (byte) 10, field27);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertNull(method25);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 'a');
        java.lang.reflect.Method method14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 'a', method14, (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, ' ', field18);
        java.lang.reflect.Method method20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) ' ', method20, 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, (byte) 1, field2);
        java.lang.reflect.Field field4 = null;
        java.lang.Object obj5 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) reflection0, field4);
        java.lang.reflect.Method method6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, method6, '\000');
        java.lang.reflect.Field field9 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, field9, (double) 100);
        java.lang.reflect.Field field13 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, 100, field13);
        java.lang.reflect.Field field15 = null;
        char char16 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) reflection0, field15);
        java.lang.reflect.Method method17 = null;
        double double18 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) reflection0, method17);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field11, field14, (double) 10.0f);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field12, field14, (long) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
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
        long long40 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) wildcardClass1, field39);
        java.lang.reflect.Field field42 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) long40, true, field42);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
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
        java.lang.reflect.Field field19 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet17, false, field19);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 100, field1, false);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
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
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method15);
        java.lang.reflect.Method method19 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "hi!", false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
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
        java.util.Set<java.lang.String> strSet34 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass17);
        java.util.Set<java.lang.String> strSet35 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass17);
        java.lang.reflect.Field field36 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, field36, (long) (short) 10);
        java.lang.reflect.Method method39 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, method39, 'a');
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(field33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNotNull(strSet35);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, 100);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
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
        java.lang.reflect.Field field18 = null;
        short short19 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) strSet17, field18);
        java.lang.reflect.Field field20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet17, field20, 10.0d);
        java.lang.reflect.Field field24 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet17, 'a', field24);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, (float) (short) 10);
        java.util.Set<java.lang.String> strSet8 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method11 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "", false);
        java.util.Set<java.lang.String> strSet12 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field13 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field13, (int) (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, '#');
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection reflection9 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass10 = reflection9.getClass();
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass10, field11, false);
        java.lang.reflect.Method method16 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass10, "", false);
        java.lang.reflect.Method method19 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass10, "hi!", false);
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass10, method20);
        java.lang.reflect.Method method22 = null;
        java.lang.reflect.Method method23 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass10, method22);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field8, (java.lang.Object) method22);
        java.lang.reflect.Field field25 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field25, (byte) 1);
        java.lang.reflect.Field field29 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field25, 10.0d, field29);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.Class<?> wildcardClass12 = strSet11.getClass();
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass12, '4', field14);
        java.lang.reflect.Method method16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field14, method16, (short) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
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
        org.apache.openjpa.enhance.Reflection reflection16 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass17 = reflection16.getClass();
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, field18, false);
        java.lang.reflect.Method method21 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, method21, '#');
        java.lang.reflect.Field field24 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, field24, (long) (short) 10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet14, method15, (java.lang.Object) (short) 10);
        java.lang.reflect.Field field28 = null;
        char char29 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) strSet14, field28);
        java.lang.reflect.Field field30 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field28, field30, (float) '#');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        java.lang.reflect.Method method1 = null;
        java.lang.Object obj2 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) (short) -1, method1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field16, (short) 0);
        java.lang.reflect.Method method19 = null;
        int int20 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass1, method19);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, method13, (double) (byte) 1);
        java.lang.reflect.Field field16 = null;
        float float17 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass3, field16);
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) float17, field18, true);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field15, (int) (short) 1);
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method18);
        java.lang.reflect.Field field20 = null;
        byte byte21 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) method19, field20);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 0 + "'", byte21 == (byte) 0);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        java.lang.reflect.Method method23 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) false, method23, 'a');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field11, (long) 10);
        java.lang.reflect.Field field16 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method17 = null;
        int int18 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) "hi!", method17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(field16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection13, method16, (double) 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
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
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field18, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method23 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing getter for property \"\" in type \"class org.apache.openjpa.enhance.Reflection\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
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
        float float20 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass1, method19);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) true, (long) (byte) 100, field16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
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
        java.lang.reflect.Method method22 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method23 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) false, method23, 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.Class<?> wildcardClass12 = strSet11.getClass();
        java.lang.reflect.Method method13 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass12, method13, (short) 100);
        java.lang.reflect.Field field18 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass12, "hi!", false);
        java.lang.reflect.Field field19 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass12, field19, (-1));
        java.lang.reflect.Field field23 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field19, (short) -1, field23);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(field18);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field14, 0.0d);
        java.lang.reflect.Field field17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field17, false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "hi!", field8, (double) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method12 = null;
        java.lang.Object obj13 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) strSet11, method12);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field13 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method14 = null;
        java.lang.Object obj15 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) wildcardClass1, method14);
        java.util.Set<java.lang.String> strSet16 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method17 = null;
        boolean boolean18 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass1, method17);
        java.lang.reflect.Method method19 = null;
        double double20 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) boolean18, method19);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(field13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
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
        org.apache.openjpa.enhance.Reflection reflection16 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass17 = reflection16.getClass();
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, field18, false);
        java.lang.reflect.Method method21 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, method21, '#');
        java.lang.reflect.Field field24 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass17, field24, (long) (short) 10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet14, method15, (java.lang.Object) (short) 10);
        java.lang.reflect.Field field28 = null;
        char char29 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) strSet14, field28);
        java.lang.reflect.Field field31 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) char29, (float) 0L, field31);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + char29 + "' != '" + '\000' + "'", char29 == '\000');
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 10, (float) 'a', field2);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Method method16 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method17, (double) 10);
        java.lang.reflect.Method method20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method20, (float) '\000');
        java.lang.reflect.Field field25 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field26 = null;
        double double27 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) false, field26);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(field25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) reflection0, method1);
        java.lang.Class<?> wildcardClass3 = reflection0.getClass();
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass3);
        java.lang.reflect.Field field5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field5, '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field13 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method14 = null;
        java.lang.Object obj15 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) wildcardClass1, method14);
        java.util.Set<java.lang.String> strSet16 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field17, (byte) 1);
        java.lang.reflect.Method method22 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "", false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(field13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Method method16 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method17, (double) 10);
        java.lang.reflect.Field field22 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field24 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (double) 0, field24);
        java.lang.reflect.Method method26 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method26, (double) 100L);
        java.lang.reflect.Method method29 = null;
        float float30 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) method26, method29);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(field22);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method23, (double) (short) 0);
        java.lang.reflect.Field field27 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 0, (long) (byte) 10, field27);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (long) 10, field2);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (java.lang.Object) '\000');
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field4, (short) 0);
        java.lang.reflect.Method method7 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method7, '\000');
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method12, '\000');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, (int) (byte) -1, field6);
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, field8, true);
        java.lang.Class<?> wildcardClass11 = strSet4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method5);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method10, ' ');
        java.lang.reflect.Method method13 = null;
        float float14 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass1, method13);
        java.lang.reflect.Field field15 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field15, (byte) 100);
        java.util.Set<java.lang.String> strSet18 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method19 = null;
        java.lang.Object obj20 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) strSet18, method19);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
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
        java.lang.reflect.Field field19 = null;
        long long20 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) false, field19);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        org.apache.openjpa.enhance.Reflection reflection15 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass16 = reflection15.getClass();
        java.lang.reflect.Field field17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass16, field17, false);
        java.lang.reflect.Method method22 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass16, "", false);
        java.lang.reflect.Method method25 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass16, "hi!", false);
        java.lang.reflect.Method method26 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass16, method26, 0L);
        java.lang.reflect.Method method31 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass16, "", false);
        java.util.Set<java.lang.String> strSet32 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass16);
        java.lang.reflect.Field field33 = null;
        short short34 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) strSet32, field33);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field14, (java.lang.Object) field33);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 0 + "'", short34 == (short) 0);
    }
}


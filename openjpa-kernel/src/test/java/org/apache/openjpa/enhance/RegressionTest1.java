package org.apache.openjpa.enhance;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
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
        java.lang.reflect.Field field16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) boolean14, (int) ' ', field16);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        java.lang.reflect.Field field1 = null;
        char char2 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) (-1), field1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (double) '4');
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field4 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, true);
        java.lang.reflect.Method method8 = null;
        boolean boolean9 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) method5, method8);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(field4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
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
        java.lang.Object obj17 = null;
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method15, obj17, field18);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Method method1 = null;
        byte byte2 = org.apache.openjpa.enhance.Reflection.getByte(obj0, method1);
        java.lang.reflect.Method method3 = null;
        char char4 = org.apache.openjpa.enhance.Reflection.getChar(obj0, method3);
        java.lang.reflect.Method method5 = null;
        char char6 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) method3, method5);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "", 100.0f, field2);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method10, method13, (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, (float) (short) 10);
        java.util.Set<java.lang.String> strSet8 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj11 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) wildcardClass1, "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"\" in type \"class java.lang.Class\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (int) ' ', field19);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field20, method22, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        short short2 = org.apache.openjpa.enhance.Reflection.getShort(obj0, method1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (int) (byte) 100, field2);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (double) '\000');
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 100.0f, method1, 100);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field4, false);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Field field10 = null;
        float float11 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass3, field10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, field1, (java.lang.Object) wildcardClass3);
        java.lang.reflect.Method method15 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Field field16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) false, field16, ' ');
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 10, method1, (int) (byte) 1);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
        java.lang.reflect.Field field17 = null;
        long long18 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) field15, field17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field13 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field14 = null;
        java.lang.Object obj15 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) "", field14);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(field13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
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
        java.lang.reflect.Method method39 = null;
        int int40 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) "", method39);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) reflection0, method1);
        java.lang.reflect.Method method3 = null;
        java.lang.Object obj4 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) reflection0, method3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = obj4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
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
        org.apache.openjpa.enhance.Reflection reflection35 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass36 = reflection35.getClass();
        java.lang.reflect.Field field37 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass36, field37, false);
        java.lang.reflect.Method method40 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass36, method40, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method44 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass17, "", (java.lang.Class) wildcardClass36, true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing setter for property \"\" in type \"class org.apache.openjpa.enhance.Reflection\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 10, method1, (long) (byte) 0);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
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
        java.lang.reflect.Method method20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method18, method20, (long) (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        java.lang.reflect.Method method33 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method32, method33, '4');
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
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, '#');
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field8, (long) (short) 10);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 10, method11, false);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
        boolean boolean18 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) method15, method17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        boolean boolean18 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) strSet16, field17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(field13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        double double5 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass3, field4);
        java.util.Set<java.lang.String> strSet6 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass3);
        java.lang.reflect.Field field7 = null;
        byte byte8 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet6, field7);
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (java.lang.Object) strSet6);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field17, field18, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(field17);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, 'a');
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        float float2 = org.apache.openjpa.enhance.Reflection.getFloat(obj0, method1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
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
        byte byte21 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) byte19, method20);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 0 + "'", byte21 == (byte) 0);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field8 = null;
        java.lang.Object obj9 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) method7, field8);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) wildcardClass1, field5);
        java.lang.reflect.Method method7 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field5, method7, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, (byte) 1, field2);
        java.lang.reflect.Field field4 = null;
        java.lang.Object obj5 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) reflection0, field4);
        java.lang.reflect.Method method6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, method6, '\000');
        java.lang.reflect.Field field9 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, field9, (double) 100);
        java.lang.reflect.Field field12 = null;
        double double13 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) 100, field12);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (java.lang.Object) '\000');
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field1, field4, '#');
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (double) (byte) 100, field2);
        java.lang.reflect.Field field4 = null;
        char char5 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) field2, field4);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, '#');
        java.lang.reflect.Field field8 = null;
        long long9 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) '#', field8);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (byte) -1);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, true, field2);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
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
        java.lang.reflect.Field field19 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 10, ' ', field19);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        java.lang.reflect.Method method1 = null;
        short short2 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) "hi!", method1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
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
        java.lang.reflect.Field field33 = null;
        int int34 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) false, field33);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(method32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        java.lang.reflect.Field field1 = null;
        float float2 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) (-1.0f), field1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method5);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method10, ' ');
        java.lang.Object obj15 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) method10, "", true);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        java.lang.reflect.Method method1 = null;
        float float2 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) 1, method1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, 10L);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, (float) (short) 10);
        java.util.Set<java.lang.String> strSet8 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field9 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet8, field9, 100);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        char char24 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) "hi!", field23);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
        java.lang.reflect.Field field16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, (double) 1L, field16);
        java.lang.reflect.Field field19 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 1L, 0.0d, field19);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) boolean14, field15, '\000');
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        java.lang.reflect.Field field21 = null;
        byte byte22 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) ' ', field21);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 0 + "'", byte22 == (byte) 0);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        java.lang.Class class0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method3 = org.apache.openjpa.enhance.Reflection.findSetter(class0, "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing getter for property \"\" in type \"null\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (float) (byte) -1);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt(obj0, field1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (short) (byte) 1);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        java.lang.reflect.Method method1 = null;
        byte byte2 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) 100, method1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method19 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing getter for property \"hi!\" in type \"class org.apache.openjpa.enhance.Reflection\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field1 = null;
        boolean boolean2 = org.apache.openjpa.enhance.Reflection.getBoolean(obj0, field1);
        java.lang.reflect.Field field3 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field3, (int) (short) 1);
        java.lang.reflect.Method method6 = null;
        boolean boolean7 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) (short) 1, method6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, '\000');
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) int40, field41, (float) 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
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
        byte byte20 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) false, field19);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
        float float20 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) method18, field19);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        java.lang.reflect.Method method19 = null;
        short short20 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) method18, method19);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        java.lang.Object obj2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, obj2);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method5);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) false, method10, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
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
        float float17 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) method14, field16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, 'a');
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
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
        short short36 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) wildcardClass17, method35);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(field33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertTrue("'" + short36 + "' != '" + (short) 0 + "'", short36 == (short) 0);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
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
        java.lang.reflect.Field field16 = null;
        byte byte17 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) method14, field16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 100.0f, field1, (int) '\000');
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field14, false, field18);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.lang.reflect.Method method1 = null;
        char char2 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) 100, method1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (long) '4');
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (java.lang.Object) (byte) -1);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        java.lang.reflect.Field field1 = null;
        char char2 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) 1.0f, field1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field16, (float) 0L);
        java.lang.reflect.Field field19 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field16, field19, 'a');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 0, method1, (float) (short) 10);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field12, field16, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        java.lang.reflect.Method method19 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field17, method19, (short) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(field13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(strSet16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method8 = null;
        double double9 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) "", method8);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) -1, method1, (float) '#');
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        java.lang.reflect.Method method1 = null;
        boolean boolean2 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) 'a', method1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        char char21 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) float19, field20);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + char21 + "' != '" + '\000' + "'", char21 == '\000');
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        java.lang.Class class0 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field4, false);
        java.lang.reflect.Method method7 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, method7, (float) (short) 10);
        java.util.Set<java.lang.String> strSet10 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass3);
        java.lang.reflect.Method method12 = org.apache.openjpa.enhance.Reflection.findSetter(class0, "", (java.lang.Class) wildcardClass3, false);
        java.lang.reflect.Field field13 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) false, field13, false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (int) '4');
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field5 = null;
        byte byte6 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet4, field5);
        java.lang.reflect.Method method7 = null;
        java.lang.Object obj8 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) byte6, method7);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (int) '\000');
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field3 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, true, field3);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) true, method5, (float) (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        java.lang.Object obj3 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) (short) 10, "hi!", false);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
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
        java.lang.reflect.Field field16 = null;
        int int17 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) method14, field16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
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
        java.lang.reflect.Field field13 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) '4', (short) (byte) 100, field13);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
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
        java.lang.reflect.Field field17 = null;
        float float18 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) field15, field17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field8 = null;
        float float9 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass1, field8);
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field8, (float) (short) 1, field11);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (java.lang.Object) '\000');
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field4, (short) 0);
        java.lang.reflect.Method method7 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field4, method7, (short) (byte) 1);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (byte) 0, field2);
        java.lang.reflect.Method method4 = null;
        byte byte5 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) (byte) 0, method4);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        byte byte2 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) reflection0, method1);
        java.lang.reflect.Field field3 = null;
        int int4 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) byte2, field3);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (-1), '\000', field2);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "", field1, (long) (short) -1);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
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
        java.lang.reflect.Method method18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field16, method18, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) reflection0, method1);
        java.lang.Class<?> wildcardClass3 = reflection0.getClass();
        java.lang.reflect.Field field5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, (double) 100.0f, field5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method19 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing getter for property \"\" in type \"class org.apache.openjpa.enhance.Reflection\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(field16);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field1 = null;
        boolean boolean2 = org.apache.openjpa.enhance.Reflection.getBoolean(obj0, field1);
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) boolean2, false, field4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection13, method16, 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        boolean boolean6 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass1, method5);
        java.lang.reflect.Method method7 = null;
        double double8 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) boolean6, method7);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
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
        java.lang.reflect.Method method19 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        java.lang.reflect.Method method1 = null;
        boolean boolean2 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) (-1.0d), method1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
        short short26 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) "", field25);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 0 + "'", short26 == (short) 0);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, '#');
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, (byte) 1, field2);
        java.lang.reflect.Field field4 = null;
        java.lang.Object obj5 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) reflection0, field4);
        java.lang.reflect.Method method6 = null;
        double double7 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) field4, method6);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
        java.lang.reflect.Field field17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, (java.lang.Object) "", field17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        java.lang.Object obj16 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) false, field15);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) char16, field17, (double) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        java.lang.reflect.Field field1 = null;
        short short2 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) '4', field1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        java.lang.reflect.Field field20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) false, false, field20);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(field13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(field18);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field16, method17, (int) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(field16);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method5);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field10 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field10, (float) 100L);
        java.lang.reflect.Method method13 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field10, method13, (double) 0L);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
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
        float float27 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) boolean25, field26);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method5);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method10, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj15 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) ' ', "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"\" in type \"class java.lang.Character\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, method1, 1L);
        java.lang.reflect.Field field5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method1, 10, field5);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
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
        java.lang.reflect.Field field16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, (double) 1L, field16);
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass3, method18);
        java.lang.reflect.Field field20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method18, field20, (double) (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method19, field21, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field33, field34, (long) (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(field33);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, '#');
        java.lang.reflect.Field field9 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) '#', true, field9);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (-1.0d), method1, (byte) 100);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        double double16 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) (byte) 1, field15);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method29 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing getter for property \"hi!\" in type \"class org.apache.openjpa.enhance.Reflection\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) (short) 0, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"hi!\" in type \"class java.lang.Short\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method2);
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method3, field4, 10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method3);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        java.lang.reflect.Field field1 = null;
        char char2 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) 100L, field1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        java.lang.reflect.Field field1 = null;
        float float2 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) '4', field1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
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
        char char14 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) ' ', method13);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + char14 + "' != '" + '\000' + "'", char14 == '\000');
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, 0, field2);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (byte) 10, field2);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        char char2 = org.apache.openjpa.enhance.Reflection.getChar(obj0, method1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (short) (byte) 10, field2);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
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
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) char16, (double) 1.0f, field18);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
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
        java.lang.reflect.Field field16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method14, field16, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) -1, field1, (-1));
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, (float) (short) 10);
        java.util.Set<java.lang.String> strSet8 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method11 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field13 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "", 0.0f, field13);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) reflection0, method1);
        java.lang.reflect.Method method3 = null;
        float float4 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) method1, method3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field3 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, true, field3);
        java.lang.reflect.Method method5 = null;
        long long6 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) wildcardClass1, method5);
        java.lang.reflect.Method method7 = null;
        boolean boolean8 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) long6, method7);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 10.0d, method1, (byte) 0);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method13, field34, false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(method26);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        java.lang.reflect.Method method39 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method38, method39, (short) (byte) 100);
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
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (byte) 10);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method5);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field10 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field10, (float) 100L);
        java.lang.reflect.Field field13 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field10, field13, (long) 10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        byte byte2 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) reflection0, method1);
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method1, 0L, field4);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 1, false, field2);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Field field18 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"\" in type \"class org.apache.openjpa.enhance.Reflection\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) int15, field16, false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Method method2 = null;
        java.lang.reflect.Method method3 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method2);
        java.lang.reflect.Method method4 = null;
        char char5 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) method3, method4);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
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
        double double18 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) "hi!", field17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(field16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (short) (byte) 10);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        java.lang.reflect.Method method1 = null;
        byte byte2 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) (-1), method1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (int) ' ');
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (double) ' ');
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
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
        java.lang.Object obj42 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) wildcardClass25, field41);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, (float) (short) 10);
        java.lang.reflect.Field field9 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 10, (short) (byte) 0, field9);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        java.lang.reflect.Method method28 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet14, method28, (long) (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
        java.lang.reflect.Field field26 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) false, field26, 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertNull(method25);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
        long long21 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) field18, field20);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "", method8, (int) (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (float) (byte) 1);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (long) 0);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
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
        java.lang.reflect.Field field26 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method25, field26, (float) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertNull(method25);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (float) ' ');
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        java.lang.Class class0 = null;
        java.lang.reflect.Method method3 = org.apache.openjpa.enhance.Reflection.findSetter(class0, "hi!", false);
        org.junit.Assert.assertNull(method3);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (double) (byte) 100, field2);
        java.lang.reflect.Field field4 = null;
        float float5 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) (byte) 100, field4);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
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
        java.lang.reflect.Method method18 = null;
        int int19 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) field15, method18);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, (float) (short) 10);
        java.lang.reflect.Field field8 = null;
        boolean boolean9 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) method5, field8);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
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
        java.lang.reflect.Method method28 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field26, method28, 1L);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
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
        java.lang.reflect.Method method18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method18, (short) (byte) 100);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
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
        boolean boolean18 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) false, method17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (short) 100);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (int) (short) 10);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
        float float29 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass1, method28);
        java.lang.reflect.Method method30 = null;
        java.lang.reflect.Method method31 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method30);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertNull(method31);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, true);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) ' ', method13, (short) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (double) '\000', field2);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        java.lang.reflect.Method method1 = null;
        short short2 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) (-1), method1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (byte) 10);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (short) 10);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (double) 100.0f);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field5 = null;
        byte byte6 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet4, field5);
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) byte6, (byte) 1, field8);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 0.0f, field1, ' ');
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method18, method20, 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 10, field1, 0L);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "", (int) (short) -1, field2);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 100, (byte) 10, field2);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method5);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method10, ' ');
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) ' ', '4', field14);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "hi!", field1, (java.lang.Object) (-1));
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (java.lang.Object) (byte) 0, field2);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field19, (short) (byte) -1, field23);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(field18);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) reflection0, method1);
        java.lang.reflect.Method method3 = null;
        java.lang.Object obj4 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) reflection0, method3);
        java.lang.reflect.Field field5 = null;
        double double6 = org.apache.openjpa.enhance.Reflection.getDouble(obj4, field5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method11);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method12, (float) '4', field14);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
        java.lang.reflect.Field field20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method17, (float) 0, field20);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
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
        java.lang.reflect.Field field33 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "", field33, true);
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
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) 100, method1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, (float) (short) 10);
        java.util.Set<java.lang.String> strSet8 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field10 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, ' ', field10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method14 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing getter for property \"\" in type \"class org.apache.openjpa.enhance.Reflection\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strSet8);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, 1.0f);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (float) 'a');
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
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
        int int15 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass1, field14);
        java.lang.reflect.Method method16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) int15, method16, true);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        long long18 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) field14, method17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field4 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, true);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Field field10 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"\" in type \"class org.apache.openjpa.enhance.Reflection\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(field4);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
        java.lang.reflect.Method method25 = null;
        org.apache.openjpa.enhance.Reflection.set(obj24, method25, (int) 'a');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (float) (short) 10, field15);
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field15, method17, (float) '#');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (float) 0);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (double) (short) 10, field2);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt(obj0, method1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (double) (byte) 100, field2);
        java.lang.reflect.Field field4 = null;
        java.lang.Object obj5 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field4, obj5);
        java.lang.reflect.Field field7 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field7, (int) ' ');
        java.lang.reflect.Field field10 = null;
        float float11 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) ' ', field10);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
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
        java.lang.reflect.Field field18 = null;
        char char19 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) "hi!", field18);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(field17);
        org.junit.Assert.assertTrue("'" + char19 + "' != '" + '\000' + "'", char19 == '\000');
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
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
        java.lang.reflect.Field field16 = null;
        short short17 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) method13, field16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (-1.0d), method1, '\000');
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, (float) (short) 10);
        java.util.Set<java.lang.String> strSet8 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field10 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, ' ', field10);
        java.lang.reflect.Field field12 = null;
        float float13 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass1, field12);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field8 = null;
        float float9 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass1, field8);
        java.lang.reflect.Method method10 = null;
        long long11 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) field8, method10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        java.lang.reflect.Method method1 = null;
        byte byte2 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) 1.0f, method1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field5 = null;
        float float6 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) strSet4, field5);
        java.lang.reflect.Field field7 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) float6, field7, (int) (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method20, 1);
        java.lang.reflect.Method method23 = null;
        double double24 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) 1, method23);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (int) (byte) 100);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        double double19 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) strSet14, method18);
        java.lang.reflect.Field field20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) double19, field20, (double) 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (int) '4');
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        java.lang.Object obj0 = null;
        java.lang.Object obj3 = org.apache.openjpa.enhance.Reflection.getValue(obj0, "hi!", true);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        java.lang.reflect.Method method18 = null;
        byte byte19 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) (byte) -1, method18);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
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
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, false, field18);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(field13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 100L, method1, (short) -1);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
        java.lang.Object obj17 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) wildcardClass1, field16);
        java.lang.reflect.Field field18 = null;
        short short19 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) field16, field18);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
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
        short short19 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) wildcardClass1, field18);
        java.lang.reflect.Method method20 = null;
        java.lang.Object obj21 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) field18, method20);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
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
        char char13 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) method9, field12);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '\000' + "'", char13 == '\000');
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field13 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method14 = null;
        java.lang.Object obj15 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) wildcardClass1, method14);
        java.lang.reflect.Field field16 = null;
        java.lang.Object obj17 = null;
        org.apache.openjpa.enhance.Reflection.set(obj15, field16, obj17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(field13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, false);
        java.lang.reflect.Field field4 = null;
        java.lang.Object obj5 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) method1, field4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) boolean25, field26, (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) reflection0, method1);
        java.lang.reflect.Method method3 = null;
        java.lang.Object obj4 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) reflection0, method3);
        java.lang.reflect.Field field6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, (int) (short) 10, field6);
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 10, field8, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
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
        int int21 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass1, method20);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Field field6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) false, (byte) 1, field6);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        char char6 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) wildcardClass1, method5);
        java.lang.reflect.Method method7 = null;
        float float8 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass1, method7);
        java.lang.reflect.Field field9 = null;
        char char10 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) method7, field9);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        java.lang.reflect.Field field24 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass12, "hi!", false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(field18);
        org.junit.Assert.assertNull(field24);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field13, (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method18 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing getter for property \"hi!\" in type \"class org.apache.openjpa.enhance.Reflection\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 0.0f, (double) '\000', field2);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
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
        double double23 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) field20, method22);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        short short15 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) field11, method14);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field4, false);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Field field10 = null;
        float float11 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass3, field10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, field1, (java.lang.Object) wildcardClass3);
        java.lang.reflect.Method method15 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Method method16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method15, method16, (float) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        java.lang.reflect.Method method17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field14, method17, 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (byte) 0);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
        double double19 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) (short) 10, field18);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (-1L), (int) (short) 1, field2);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
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
        long long26 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) wildcardClass1, field25);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 0, method42, (long) ' ');
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
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
        double double19 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) strSet14, method18);
        java.lang.reflect.Field field21 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) double19, (short) 10, field21);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
        long long18 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) wildcardClass1, field17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field20, true, field24);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
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
        java.lang.reflect.Method method18 = null;
        double double19 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass3, method18);
        java.lang.reflect.Method method20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method18, method20, '\000');
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(field17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        java.lang.reflect.Field field19 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field15, (double) '#', field19);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (double) (byte) 100, field2);
        java.lang.reflect.Field field4 = null;
        java.lang.Object obj5 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field4, obj5);
        java.lang.reflect.Field field7 = null;
        java.lang.Object obj8 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) field4, field7);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        java.lang.reflect.Field field1 = null;
        boolean boolean2 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) false, field1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method7, field9, 'a');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        java.lang.reflect.Method method16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 0, method16, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (int) (byte) 0);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 1.0f, method1, (short) -1);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
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
        java.lang.Object obj16 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) wildcardClass1, method15);
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method15, 0L, field18);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, '#');
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field8, (long) (short) 10);
        java.lang.reflect.Method method11 = null;
        java.lang.Object obj12 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) (short) 10, method11);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (short) (byte) -1);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) -1, (float) (-1L), field2);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (byte) -1, field2);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        java.lang.reflect.Method method1 = null;
        long long2 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) (-1L), method1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field13 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method14 = null;
        boolean boolean15 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) field13, method14);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(field13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        java.lang.reflect.Method method33 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method32, method33, (float) 10L);
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
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
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
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method18);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 0, field1, (long) (short) 0);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        byte byte6 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet4, method5);
        java.lang.reflect.Field field7 = null;
        float float8 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) strSet4, field7);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method8, field11, (long) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        java.lang.Object obj0 = null;
        java.lang.Object obj3 = org.apache.openjpa.enhance.Reflection.getValue(obj0, "", false);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method5);
        java.lang.reflect.Field field7 = null;
        char char8 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) method5, field7);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field5 = null;
        byte byte6 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet4, field5);
        java.lang.reflect.Field field7 = null;
        long long8 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) field5, field7);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method5);
        java.lang.reflect.Field field7 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method5, field7, (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field17, field18, true);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(field17);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method19 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing getter for property \"hi!\" in type \"class org.apache.openjpa.enhance.Reflection\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        java.lang.reflect.Field field16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, (double) 1L, field16);
        java.lang.reflect.Method method18 = null;
        java.lang.reflect.Method method19 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass3, method18);
        java.lang.reflect.Field field21 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method18, (short) (byte) 100, field21);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        java.lang.reflect.Field field19 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field20 = null;
        boolean boolean21 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) "hi!", field20);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertNull(field19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 10, (-1), field2);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method8 = null;
        byte byte9 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) "", method8);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        double double21 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field20);
        java.lang.reflect.Field field23 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) double21, '#', field23);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) reflection0, method1);
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method1, ' ', field4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) false, '#', field35);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(field33);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field5 = null;
        byte byte6 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet4, field5);
        java.lang.reflect.Method method7 = null;
        double double8 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) strSet4, method7);
        java.lang.reflect.Field field9 = null;
        float float10 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) double8, field9);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        char char6 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) wildcardClass1, method5);
        java.lang.reflect.Method method7 = null;
        float float8 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass1, method7);
        java.lang.reflect.Field field10 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method7, true, field10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        float float15 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) method13, method14);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
        java.lang.reflect.Field field17 = null;
        char char18 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) method16, field17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj3 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) 100L, "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"\" in type \"class java.lang.Long\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (byte) 1, field25);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        float float29 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass1, method28);
        java.lang.reflect.Field field31 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) float29, (int) (byte) 10, field31);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.lang.reflect.Method method1 = null;
        short short2 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) 100.0d, method1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
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
        java.lang.reflect.Field field22 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field19, (short) (byte) 100, field22);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        java.lang.Object obj3 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) (-1.0d), "hi!", false);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field8 = null;
        float float9 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass1, field8);
        java.lang.reflect.Method method10 = null;
        float float11 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) float9, method10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        java.lang.reflect.Field field23 = null;
        long long24 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) (byte) 1, field23);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (short) 1, field2);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "hi!", field11, 10L);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
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
        int int15 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass1, field14);
        java.lang.reflect.Field field16 = null;
        boolean boolean17 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) int15, field16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
        double double19 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) field15, method18);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        java.lang.reflect.Field field1 = null;
        float float2 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) (byte) 100, field1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field4 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "", method5, (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(field4);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
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
        double double16 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) method13, method15);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (short) (byte) -1);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, (float) (short) 10);
        java.util.Set<java.lang.String> strSet8 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method11 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method14 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing getter for property \"hi!\" in type \"class org.apache.openjpa.enhance.Reflection\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 0.0d, (float) (short) 0, field2);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field5 = null;
        byte byte6 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet4, field5);
        java.lang.reflect.Method method7 = null;
        double double8 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) strSet4, method7);
        java.lang.reflect.Field field9 = null;
        double double10 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) double8, field9);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (int) (short) 100, field2);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
        java.lang.reflect.Field field28 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet23, 'a', field28);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        boolean boolean6 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass1, method5);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = null;
        byte byte11 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) false, method10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field11 = null;
        java.lang.Object obj12 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) false, field11);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method15, (long) (short) 100, field18);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        java.lang.Class class0 = null;
        java.util.Set<java.lang.String> strSet1 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames(class0);
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field23, method26, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
        char char43 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) (byte) 0, method42);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertTrue("'" + char43 + "' != '" + '\000' + "'", char43 == '\000');
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, (short) 100, field6);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, method8, 0L);
        java.lang.reflect.Field field12 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method8, (float) (short) 100, field12);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Field field10 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"\" in type \"class org.apache.openjpa.enhance.Reflection\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method11);
        java.lang.reflect.Field field13 = null;
        float float14 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) method12, field13);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (long) (byte) -1);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (java.lang.Object) '\000');
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field4, (short) 0);
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (byte) 0, field8);
        java.lang.reflect.Field field10 = null;
        byte byte11 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) (byte) 0, field10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
            java.lang.Object obj25 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) false, "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"\" in type \"class java.lang.Boolean\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
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
        float float17 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) method14, method16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(field13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, '4', field2);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
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
        java.lang.reflect.Field field19 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "", ' ', field19);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNull(field17);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        boolean boolean17 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass1, field16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
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
        int int38 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) field35, method37);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(field33);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (byte) 0);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
        java.lang.reflect.Field field17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 0L, true, field17);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet35, field36, (short) 100);
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
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        char char6 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) wildcardClass1, method5);
        java.lang.reflect.Method method7 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method5, method7, (float) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) reflection0, method1);
        java.lang.reflect.Method method3 = null;
        java.lang.Object obj4 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) reflection0, method3);
        java.lang.reflect.Method method5 = null;
        short short6 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) reflection0, method5);
        java.lang.reflect.Method method7 = null;
        float float8 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) short6, method7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        boolean boolean6 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass1, method5);
        java.lang.reflect.Field field7 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field7, (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
        java.lang.reflect.Field field24 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "hi!", (double) (short) 10, field24);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 0, (double) '#', field2);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, method1, 1L);
        java.lang.reflect.Field field4 = null;
        short short5 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) reflection0, field4);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 0 + "'", short5 == (short) 0);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
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
        double double21 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, method20);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
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
        short short24 = org.apache.openjpa.enhance.Reflection.getShort(obj22, field23);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 0 + "'", short24 == (short) 0);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
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
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method25);
        java.lang.reflect.Method method27 = null;
        long long28 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) method25, method27);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (long) (short) 1);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Field field22 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass19, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"hi!\" in type \"class java.util.Collections$EmptySet\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method5);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field10 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field10, (float) 100L);
        java.lang.reflect.Method method15 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method15, field16, (float) 'a');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (byte) 0, field2);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
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
        java.lang.reflect.Field field20 = null;
        byte byte21 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) (short) 100, field20);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 0 + "'", byte21 == (byte) 0);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        java.lang.Object obj41 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) method38, "", false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertNull(obj41);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet16, method17, (long) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(field13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        java.lang.Class class0 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        double double5 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass3, field4);
        java.util.Set<java.lang.String> strSet6 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method8 = org.apache.openjpa.enhance.Reflection.findSetter(class0, "", (java.lang.Class) wildcardClass3, true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing setter for property \"\" in type \"null\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(strSet6);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
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
        java.lang.reflect.Method method15 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) ' ', method15, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Field field5 = null;
        boolean boolean6 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass1, field5);
        java.lang.reflect.Field field7 = null;
        char char8 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) wildcardClass1, field7);
        java.lang.reflect.Method method9 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field7, method9, '4');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
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
        java.lang.reflect.Field field14 = null;
        int int15 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) method12, field14);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        long long18 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) (short) 0, method17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (int) (byte) -1);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
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
        java.lang.reflect.Field field36 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method34, field36, (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        short short16 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) (byte) 1, method15);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, (float) (short) 10);
        java.lang.reflect.Field field9 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (-1L), field9);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
        double double40 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass25, field39);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        java.lang.reflect.Method method18 = null;
        double double19 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass3, method18);
        java.lang.reflect.Field field20 = null;
        byte byte21 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) double19, field20);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(field17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 0 + "'", byte21 == (byte) 0);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method16, method17, (int) '\000');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        boolean boolean24 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) method20, method23);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        byte byte6 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet4, method5);
        java.lang.reflect.Field field7 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method5, field7, (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, method1, 1L);
        java.lang.reflect.Field field5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, '#', field5);
        java.lang.reflect.Field field7 = null;
        short short8 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) '#', field7);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        java.lang.reflect.Method method6 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method5);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field10 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field10, (float) 100L);
        java.lang.reflect.Method method13 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field10, method13, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        byte byte39 = org.apache.openjpa.enhance.Reflection.getByte(obj37, field38);
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
        org.junit.Assert.assertTrue("'" + byte39 + "' != '" + (byte) 0 + "'", byte39 == (byte) 0);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
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
        java.lang.reflect.Method method18 = null;
        double double19 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass3, method18);
        java.lang.reflect.Method method20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) double19, method20, (short) (byte) 10);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(field17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        java.lang.reflect.Field field1 = null;
        byte byte2 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) 1L, field1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (float) (short) 10, field15);
        java.lang.reflect.Method method17 = null;
        char char18 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) (short) 10, method17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + char18 + "' != '" + '\000' + "'", char18 == '\000');
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, '\000', field2);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        java.lang.reflect.Field field18 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field15, field18, (int) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        java.lang.reflect.Method method27 = null;
        java.lang.Object obj28 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field25, method27, obj28);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method17, (int) ' ');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(field13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(strSet16);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        java.lang.Object obj28 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) field24, "hi!", true);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(field22);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        char char6 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) wildcardClass1, method5);
        java.lang.reflect.Method method7 = null;
        short short8 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) wildcardClass1, method7);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        java.lang.reflect.Field field1 = null;
        char char2 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) 10, field1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method25 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing getter for property \"\" in type \"class org.apache.openjpa.enhance.Reflection\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, '#');
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field8, (double) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        java.lang.reflect.Field field20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (double) (short) 0, field20);
        java.lang.reflect.Field field22 = null;
        java.lang.Object obj23 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) (short) 0, field22);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        java.lang.reflect.Method method23 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method20, method23, '4');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.lang.reflect.Field field1 = null;
        java.lang.Object obj2 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) 100.0d, field1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (-1.0d));
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        java.lang.reflect.Field field17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method13, (long) (short) 10, field17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, (byte) 1, field2);
        java.lang.reflect.Field field4 = null;
        java.lang.Object obj5 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) reflection0, field4);
        java.lang.Object obj8 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) reflection0, "", false);
        java.lang.reflect.Method method9 = null;
        org.apache.openjpa.enhance.Reflection.set(obj8, method9, (short) (byte) 100);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (int) '4', field2);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        java.lang.reflect.Field field14 = null;
        byte byte15 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) field12, field14);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        boolean boolean6 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass1, method5);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = null;
        java.lang.Object obj11 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) wildcardClass1, method10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field5 = null;
        short short6 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) strSet4, field5);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (float) 0L);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        boolean boolean6 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) strSet4, method5);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 1, ' ', field2);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method4 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing getter for property \"hi!\" in type \"class org.apache.openjpa.enhance.Reflection\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method13, method15, '#');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field25, (int) '\000');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 100, method1, (long) (byte) 10);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) -1, (int) (byte) 1, field2);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) '4', (byte) 0, field2);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) byte19, (float) (short) 1, field21);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 1, (double) 10L, field2);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
        boolean boolean13 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) field9, method12);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        char char17 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) method14, field16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field13, (short) 10);
        java.lang.reflect.Field field16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field13, field16, (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(strSet12);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, 10.0f, field2);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        short short27 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) wildcardClass1, field26);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
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
        java.lang.reflect.Field field24 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) false, 10L, field24);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        java.lang.reflect.Field field33 = null;
        byte byte34 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) false, field33);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(method32);
        org.junit.Assert.assertTrue("'" + byte34 + "' != '" + (byte) 0 + "'", byte34 == (byte) 0);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Field field5 = null;
        boolean boolean6 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass1, field5);
        java.lang.reflect.Method method7 = null;
        java.lang.Object obj8 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) wildcardClass1, method7);
        java.lang.reflect.Method method9 = null;
        char char10 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) wildcardClass1, method9);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\000' + "'", char10 == '\000');
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method21, field23, (short) (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (long) 1, field2);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        java.lang.reflect.Method method17 = null;
        boolean boolean18 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) field15, method17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, (byte) 1, field2);
        java.lang.reflect.Method method4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, method4, (int) (short) 0);
        java.lang.reflect.Method method7 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 0, method7, (byte) 0);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        java.lang.reflect.Method method1 = null;
        byte byte2 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) 0, method1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) '\000', method1, (int) '4');
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        boolean boolean6 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass1, method5);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Field field10 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "", field10, (short) (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (long) ' ', field2);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
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
        java.lang.reflect.Field field43 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 0, 1, field43);
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
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        byte byte17 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) method14, method16);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) ' ', "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"hi!\" in type \"class java.lang.Character\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj17 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) wildcardClass1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"hi!\" in type \"class java.lang.Class\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
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
        int int18 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) field16, field17);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(field16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
        java.lang.reflect.Field field24 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (float) (byte) 1, field24);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Field field11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) "hi!", field11, (short) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Method method4 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Field field5 = null;
        boolean boolean6 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass1, field5);
        java.lang.reflect.Field field7 = null;
        char char8 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) wildcardClass1, field7);
        java.lang.reflect.Method method9 = null;
        int int10 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) field7, method9);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field1 = null;
        boolean boolean2 = org.apache.openjpa.enhance.Reflection.getBoolean(obj0, field1);
        java.lang.reflect.Field field3 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field3, (int) (short) 1);
        java.lang.reflect.Field field7 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (double) 100.0f, field7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) '4', method1, false);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, '4');
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (short) -1, field2);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
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
        java.lang.reflect.Field field26 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method22, true, field26);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
        java.lang.reflect.Field field16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) char15, field16, (float) (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + char15 + "' != '" + '\000' + "'", char15 == '\000');
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        java.lang.reflect.Method method19 = null;
        short short20 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) strSet18, method19);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
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
        java.lang.reflect.Method method20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) false, method20, (int) '\000');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field16, (float) 0L);
        java.lang.reflect.Field field19 = null;
        short short20 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) 0L, field19);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
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
        java.lang.reflect.Method method23 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) false, method23, (double) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(field22);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
        java.lang.Object obj20 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) field15, "", false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method20 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass17, "", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing getter for property \"\" in type \"class java.util.Collections$EmptySet\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method11, 0L);
        java.lang.reflect.Method method14 = null;
        boolean boolean15 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) 0L, method14);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        java.lang.reflect.Field field1 = null;
        long long2 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) (-1.0f), field1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (java.lang.Object) '\000');
        java.lang.reflect.Field field4 = null;
        byte byte5 = org.apache.openjpa.enhance.Reflection.getByte(obj0, field4);
        java.lang.reflect.Field field6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field4, field6, (int) 'a');
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        java.lang.reflect.Method method10 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method11 = null;
        java.lang.reflect.Method method12 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method11);
        java.lang.reflect.Field field13 = null;
        float float14 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass1, field13);
        java.lang.reflect.Method method15 = null;
        int int16 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) field13, method15);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (byte) 100, field1, (int) (byte) -1);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        java.lang.reflect.Method method28 = null;
        java.lang.Object obj29 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) strSet14, method28);
        java.lang.reflect.Field field31 = null;
        org.apache.openjpa.enhance.Reflection.set(obj29, 0.0d, field31);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 0L, true, field2);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
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
        short short17 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) wildcardClass1, field16);
        java.lang.reflect.Field field18 = null;
        long long19 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) short17, field18);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        int int15 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) wildcardClass1, field14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Field field18 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"hi!\" in type \"class org.apache.openjpa.enhance.Reflection\".");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
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
        java.lang.reflect.Field field34 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method32, (byte) 1, field34);
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
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
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
        java.lang.reflect.Method method18 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass3, method17);
        java.lang.reflect.Method method19 = null;
        java.lang.Object obj20 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) method17, method19);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(obj20);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
        long long16 = org.apache.openjpa.enhance.Reflection.getLong((java.lang.Object) float14, field15);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (double) (byte) -1);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (double) '#');
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        java.lang.Object obj28 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) method25, "", false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        java.lang.reflect.Method method1 = null;
        short short2 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) (byte) 1, method1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (int) (byte) 1);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) ' ', field1, (short) (byte) 1);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, (int) (byte) -1, field6);
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field6, field8, 'a');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
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
        double double29 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) int27, method28);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(field22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, 100.0d);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) reflection0, method1);
        java.lang.reflect.Method method3 = null;
        java.lang.Object obj4 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) reflection0, method3);
        java.lang.reflect.Field field6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, (int) (short) 10, field6);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field6, method8, (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
        float float21 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) false, field20);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field4, false);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass3, "hi!", false);
        java.lang.reflect.Method method10 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, method10, (float) (short) 10);
        java.util.Set<java.lang.String> strSet13 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass3);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection reflection15 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass16 = reflection15.getClass();
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field14, (java.lang.Object) reflection15);
        java.lang.reflect.Field field18 = null;
        short short19 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) wildcardClass3, field18);
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (java.lang.Object) field18);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        int int11 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) field7, field10);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection reflection2 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass3 = reflection2.getClass();
        java.lang.reflect.Field field4 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass3, field4, false);
        java.lang.reflect.Method method9 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Field field10 = null;
        float float11 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) wildcardClass3, field10);
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 100, field1, (java.lang.Object) wildcardClass3);
        java.lang.reflect.Method method15 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass3, "", false);
        java.lang.reflect.Method method16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method15, method16, (float) (-1L));
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Field field5 = null;
        java.lang.Object obj6 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) wildcardClass1, field5);
        java.lang.reflect.Field field7 = null;
        byte byte8 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) field5, field7);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 10.0f, field1, (float) 1);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method5, '#');
        java.lang.reflect.Field field8 = null;
        short short9 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) '#', field8);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Method method1 = null;
        int int2 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) reflection0, method1);
        java.lang.reflect.Method method3 = null;
        java.lang.Object obj4 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) reflection0, method3);
        java.lang.reflect.Field field6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, (int) (short) 10, field6);
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) (short) 10, field8, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
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
        java.lang.Object obj19 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) wildcardClass3, field18);
        java.lang.reflect.Field field20 = null;
        short short21 = org.apache.openjpa.enhance.Reflection.getShort(obj19, field20);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        java.lang.reflect.Method method19 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "hi!", false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (double) 10.0f, field2);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
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
        float float21 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) float19, field20);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        java.lang.reflect.Field field20 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method17, (short) 10, field20);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(field16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Method method5 = null;
        boolean boolean6 = org.apache.openjpa.enhance.Reflection.getBoolean((java.lang.Object) wildcardClass1, method5);
        java.lang.reflect.Field field7 = null;
        short short8 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) boolean6, field7);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
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
        java.lang.reflect.Method method16 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field14, method16, (short) (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) double20, method21, '#');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
        java.lang.reflect.Field field21 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) method20, field21, (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        java.lang.reflect.Field field21 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, (short) (byte) 100, field21);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, false);
        java.lang.reflect.Field field4 = null;
        byte byte5 = org.apache.openjpa.enhance.Reflection.getByte(obj0, field4);
        java.lang.reflect.Method method6 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method6, (float) ' ');
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
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
        char char17 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) (byte) 1, field16);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + char17 + "' != '" + '\000' + "'", char17 == '\000');
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        java.lang.reflect.Field field1 = null;
        short short2 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) 1.0d, field1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
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
        java.lang.reflect.Field field19 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field16, field19, (float) (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
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
        java.lang.reflect.Method method25 = null;
        java.lang.reflect.Method method26 = org.apache.openjpa.enhance.Reflection.getDeclaringMethod((java.lang.Class) wildcardClass1, method25);
        java.lang.reflect.Field field27 = null;
        int int28 = org.apache.openjpa.enhance.Reflection.getInt((java.lang.Object) method25, field27);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field5 = null;
        byte byte6 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet4, field5);
        java.lang.reflect.Field field8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet4, (double) 0, field8);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (byte) 0, field2);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        java.lang.reflect.Method method5 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass4, method5, (byte) -1);
        java.lang.reflect.Method method8 = null;
        char char9 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) (byte) -1, method8);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '\000' + "'", char9 == '\000');
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) 100.0f, method1, (short) -1);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, (byte) 1, field2);
        java.lang.reflect.Field field4 = null;
        java.lang.Object obj5 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) reflection0, field4);
        java.lang.reflect.Method method6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, method6, '\000');
        java.lang.reflect.Field field9 = null;
        java.lang.Object obj10 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) method6, field9);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        long long20 = org.apache.openjpa.enhance.Reflection.getLong(obj18, method19);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + char16 + "' != '" + '\000' + "'", char16 == '\000');
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
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
        java.lang.reflect.Method method30 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(method30);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
        java.lang.reflect.Field field17 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) field14, field17, (float) '4');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
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
        org.apache.openjpa.enhance.Reflection reflection24 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass25 = reflection24.getClass();
        java.lang.reflect.Field field26 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass25, field26, false);
        java.lang.reflect.Method method31 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass25, "hi!", false);
        java.lang.reflect.Method method34 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass25, "hi!", false);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method36 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", (java.lang.Class) wildcardClass25, true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing setter for property \"hi!\" in type \"class org.apache.openjpa.enhance.Reflection\". ");
        } catch (org.apache.openjpa.util.UserException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(method34);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
        java.lang.reflect.Method method27 = org.apache.openjpa.enhance.Reflection.findGetter((java.lang.Class) wildcardClass1, "", false);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(method27);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        double double3 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) wildcardClass1, field2);
        java.util.Set<java.lang.String> strSet4 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field5 = null;
        byte byte6 = org.apache.openjpa.enhance.Reflection.getByte((java.lang.Object) strSet4, field5);
        java.lang.reflect.Method method7 = null;
        double double8 = org.apache.openjpa.enhance.Reflection.getDouble((java.lang.Object) strSet4, method7);
        java.lang.Object obj11 = org.apache.openjpa.enhance.Reflection.getValue((java.lang.Object) method7, "hi!", true);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        java.lang.Object obj0 = null;
        java.lang.reflect.Method method1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method1, (long) (short) 100);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (double) (byte) 100, field2);
        java.lang.reflect.Method method4 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, method4, false);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (byte) 0, field2);
        java.lang.Class<?> wildcardClass4 = obj0.getClass();
        java.lang.reflect.Field field6 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, (byte) 100, field6);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.Class<?> wildcardClass1 = reflection0.getClass();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, field2, false);
        java.lang.reflect.Method method7 = org.apache.openjpa.enhance.Reflection.findSetter((java.lang.Class) wildcardClass1, "hi!", false);
        java.lang.reflect.Method method8 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) wildcardClass1, method8, (float) (short) 10);
        java.util.Set<java.lang.String> strSet11 = org.apache.openjpa.enhance.Reflection.getPublicFieldNames((java.lang.Class) wildcardClass1);
        java.lang.reflect.Field field12 = null;
        float float13 = org.apache.openjpa.enhance.Reflection.getFloat((java.lang.Object) strSet11, field12);
        java.lang.reflect.Field field14 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) float13, field14, (int) (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) long40, (-1.0f), field42);
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
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        java.lang.reflect.Method method1 = null;
        char char2 = org.apache.openjpa.enhance.Reflection.getChar((java.lang.Object) (byte) 1, method1);
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '\000' + "'", char2 == '\000');
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) strSet23, method24, (float) 100);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(strSet23);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        java.lang.reflect.Field field1 = null;
        short short2 = org.apache.openjpa.enhance.Reflection.getShort((java.lang.Object) 10.0d, field1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        org.apache.openjpa.enhance.Reflection reflection0 = new org.apache.openjpa.enhance.Reflection();
        java.lang.reflect.Field field2 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, (byte) 1, field2);
        java.lang.reflect.Field field4 = null;
        java.lang.Object obj5 = org.apache.openjpa.enhance.Reflection.get((java.lang.Object) reflection0, field4);
        java.lang.reflect.Method method6 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) reflection0, method6, (int) (byte) 100);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
            java.lang.reflect.Field field23 = org.apache.openjpa.enhance.Reflection.findField((java.lang.Class) wildcardClass1, "hi!", true);
            org.junit.Assert.fail("Expected exception of type org.apache.openjpa.util.UserException; message: Missing field for property \"hi!\" in type \"class org.apache.openjpa.enhance.Reflection\".");
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
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        java.lang.Object obj0 = null;
        java.lang.reflect.Field field1 = null;
        org.apache.openjpa.enhance.Reflection.set(obj0, field1, (long) 'a');
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        java.lang.reflect.Method method22 = null;
        org.apache.openjpa.enhance.Reflection.set((java.lang.Object) '\000', method22, (int) (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(method18);
    }
}


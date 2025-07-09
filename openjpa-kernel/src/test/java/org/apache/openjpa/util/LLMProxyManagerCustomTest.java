package org.apache.openjpa.util;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LLMProxyManagerCustomTest {

    private ProxyManagerImpl proxyManager;

    @Before
    public void setUp() {
        proxyManager = new ProxyManagerImpl();
    }

    /**
     * Classe proxyabile con costruttore no-arg, getter e setter.
     */
    public static class MyCustomProxyObject {
        private String value;

        public MyCustomProxyObject() {}

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    /**
     * Classe non proxyabile (senza costruttore no-arg).
     */
    public static class NonProxyableObject {
        private final String data;

        public NonProxyableObject(String data) {
            this.data = data;
        }

        public String getData() {
            return data;
        }
    }

    @Test
    public void testNewCustomProxyWithAutoOffFalse() {
        MyCustomProxyObject original = new MyCustomProxyObject();
        original.setValue("autoOffFalse");

        Proxy proxy = proxyManager.newCustomProxy(original, false);
        assertNotNull("Proxy should not be null", proxy);
        assertTrue(proxy instanceof Proxy);
        assertTrue(proxy instanceof MyCustomProxyObject);

        MyCustomProxyObject proxyObject = (MyCustomProxyObject) proxy;
        proxyObject.setValue("updated");
        assertEquals("updated", proxyObject.getValue());
    }

    @Test
    public void testNewCustomProxyWithAutoOffTrue() {
        MyCustomProxyObject original = new MyCustomProxyObject();
        original.setValue("autoOffTrue");

        Proxy proxy = proxyManager.newCustomProxy(original, true);
        assertNotNull(proxy);
        assertTrue(proxy instanceof Proxy);
        assertTrue(proxy instanceof MyCustomProxyObject);

        MyCustomProxyObject proxyObject = (MyCustomProxyObject) proxy;
        assertEquals("autoOffTrue", proxyObject.getValue());
    }

    @Test
    public void testCopyCustomFromValidProxy() {
        MyCustomProxyObject original = new MyCustomProxyObject();
        original.setValue("copiedValue");

        Proxy proxy = proxyManager.newCustomProxy(original, false);
        Object copy = proxyManager.copyCustom(proxy);

        assertNotNull("Copy should not be null", copy);
        assertTrue(copy instanceof MyCustomProxyObject);
        assertFalse("Copy should not be a Proxy", copy instanceof Proxy);

        MyCustomProxyObject copiedObject = (MyCustomProxyObject) copy;
        assertEquals("copiedValue", copiedObject.getValue());
        assertNotSame(proxy, copiedObject);
    }

    @Test
    public void testNewCustomProxyWithNonProxyableObjectReturnsNull() {
        NonProxyableObject nonProxyable = new NonProxyableObject("data");
        Proxy proxy = proxyManager.newCustomProxy(nonProxyable, false);
        assertNull("Non-proxyable object should return null proxy", proxy);
    }

    @Test
    public void testNewCustomProxyWithNullInputReturnsNull() {
        Proxy proxy = proxyManager.newCustomProxy(null, true);
        assertNull("Null input should return null proxy", proxy);
    }

    @Test
    public void testCopyCustomWithNullInputReturnsNull() {
        Object copy = proxyManager.copyCustom(null);
        assertNull("Copying null should return null", copy);
    }
}
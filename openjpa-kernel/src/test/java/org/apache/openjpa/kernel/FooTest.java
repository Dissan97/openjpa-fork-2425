package org.apache.openjpa.kernel;

import org.apache.openjpa.util.ProxyManagerImpl;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class FooTest {

    @Test
    public void testFoo() {
        Map<String, String> props = new HashMap<>();
        props.put("foo", "bar");
        props.put("bar", "baz");
        ProxyManagerImpl pm = new ProxyManagerImpl();
        pm.copyCustom(props);
        assertTrue(true);
    }
}

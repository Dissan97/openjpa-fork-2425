package org.apache.openjpa.enhance;

import org.apache.openjpa.lib.util.Reflectable;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ReflectionGetBeanPropertyTest {

    // Getter + Setter validi
    public static class FullBean {
        private String name;

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public int getAge() { return 0; }
        public FullBean setAge(int age) { return this; }
    }

    // Getter senza setter
    public static class GetterOnly {
        public String getOnly() { return "no setter"; }
    }

    // Getter annotato con @Reflectable → deve essere ignorato
    public static class AnnotatedGetter {
        @Reflectable
        private String hidden;
        public String getHidden() { return hidden; }
    }

    // Setter con tipo sbagliato
    public static class InvalidSetter {
        public String getCode() { return "abc"; }

        // argomento non combacia col tipo del getter
        public void setCode(int code) {}
    }

    // Classe vuota
    public static class Empty {}

    @Test
    public void testNullClassReturnsEmptySet() {
        Set<String> props = Reflection.getBeanStylePropertyNames(null);
        assertTrue(props.isEmpty());
    }

    @Test
    public void testEmptyClassReturnsEmptySet() {
        Set<String> props = Reflection.getBeanStylePropertyNames(Empty.class);
        assertTrue(props.isEmpty());
    }

    @Test
    public void testGetterWithoutSetterIgnored() {
        Set<String> props = Reflection.getBeanStylePropertyNames(GetterOnly.class);
        assertFalse(props.contains("Only"));
    }

    @Test
    public void testAnnotatedGetterIgnored() {
        Set<String> props = Reflection.getBeanStylePropertyNames(AnnotatedGetter.class);
        assertFalse(props.contains("hidden"));
    }

    @Test
    public void testInvalidSetterTypeIgnored() {
        Set<String> props = Reflection.getBeanStylePropertyNames(InvalidSetter.class);
        assertFalse(props.contains("Code"));
    }

    @Test
    public void testValidBeanPropertiesAreDetected() {
        Set<String> props = Reflection.getBeanStylePropertyNames(FullBean.class);
        assertTrue(props.contains("Name"));
        assertTrue(props.contains("Age"));
    }

    public static class BeanCache {
        public String getProp() { return ""; }
        public void setProp(String p) { }
    }

    @Test
    public void testGetBeanStylePropertyNames_cache() {
        // Primo accesso popola la cache
        Set<String> first = Reflection.getBeanStylePropertyNames(BeanCache.class);
        // Secondo accesso deve restituire la stessa istanza
        Set<String> second = Reflection.getBeanStylePropertyNames(BeanCache.class);
        assertSame(first, second);
    }

    public static class BeanAnnotated {
        @Reflectable(false)
        public String getHidden() { return ""; }
        public void setHidden(String h) { }
        public String getVisible() { return ""; }
        public void setVisible(String v) { }
    }

    @Test
    public void testGetBeanStylePropertyNames_skipAnnotated() {
        Set<String> props = Reflection.getBeanStylePropertyNames(BeanAnnotated.class);
        assertFalse(props.contains("Hidden"));
        assertTrue(props.contains("Visible"));
    }

    public static class BeanFluent {
        public String getName() { return ""; }
        public BeanFluent setName(String n) { return this; }
    }

    @Test
    public void testGetBeanStylePropertyNames_includeFluentSetter() {
        Set<String> props = Reflection.getBeanStylePropertyNames(BeanFluent.class);
        assertTrue(props.contains("Name"));
    }

    public static class SomeOtherClass { }
    public static class BeanWrongSetter {
        public int getVal() { return 1; }
        public SomeOtherClass setVal(int v) { return new SomeOtherClass(); }
    }

    @Test
    public void testGetBeanStylePropertyNames_skipWrongSetterReturn() {
        Set<String> props = Reflection.getBeanStylePropertyNames(BeanWrongSetter.class);
        assertFalse(props.contains("Val"));
    }

}

package org.apache.openjpa.test;

import org.apache.openjpa.util.ProxyManagerImpl;

import java.util.*;

public class ProxyUtils {
    public static List<Object> createACollection() {
        List<Object> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        return list;
    }

    public static SortedSet<Integer> createASortedCollection() {
        SortedSet<Integer> sorted  = new TreeSet<>();
        sorted.add(3);
        sorted.add(2);
        sorted.add(1);
        return sorted;
    }

    public static Map<String, Integer> createAMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("first", 1);
        map.put("second", 2);
        map.put("third", 3);
        return map;
    }
    public static SortedMap<String, Integer> createASortedMap() {
        SortedMap<String, Integer> sorted  = new TreeMap<>();
        sorted.put("third", 3);
        sorted.put("second", 2);
        sorted.put("first", 1);
        return sorted;
    }
    public static Object getAProxy() {
        ProxyManagerImpl pm = new ProxyManagerImpl();
        Object valid = new AValidProxy();
        return pm.newCustomProxy(valid, false);
    }
}

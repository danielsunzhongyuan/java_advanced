package com.zsun.java.ej.chapter6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by zsun.
 * DateTime: 2019/10/24 20:09
 *
 * @author zsun
 */
public class KeySetPractice {
    public static void main(String[] args) {
        Map<String, String> m = new HashMap<>();
        m.put("a", "1");
        m.put("b", "2");
        m.put("c", "3");
        Set<String> keys = m.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
        m.put("d", "4");
        System.out.println("####");
        for (String key : keys) {
            System.out.println(key);
        }
        System.out.println("####");
        System.out.println(keys.size());
    }
}

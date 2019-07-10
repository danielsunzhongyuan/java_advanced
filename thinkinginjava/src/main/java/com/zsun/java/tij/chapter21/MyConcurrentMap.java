package com.zsun.java.tij.chapter21;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ForkJoinPool;

/**
 * Created by zsun.
 * DateTime: 2019/07/10 21:05
 *
 * @author zsun
 */
public class MyConcurrentMap {
    public static void main(String[] args) {
        // 这里是ConcurrentMap里的一些接口，很通用
        concurrentMapInterfaces();

        // 这里是ConcurrentHashMap除了上面的接口外的一些接口
        concurrentHashMapInterfaces();
    }

    private static void concurrentMapInterfaces() {
        ConcurrentMap<String, String> map = new ConcurrentHashMap<>(100);

        map.put("foo", "bar");
        map.put("han", "solo");
        map.put("r2", "d2");
        map.put("c3", "p0");

        map.forEach((key, value) -> System.out.printf("%s = %s%n", key, value));

        String value = map.putIfAbsent("c3", "p1");
        // should be p0
        System.out.println(value);

        value = map.getOrDefault("hi", "there");
        // should be default value: there
        System.out.println(value);

        map.replaceAll((k, v) -> "r2".equals(k) ? "d3" : v);
        // origin value is d2, but now is changed to d3
        System.out.println(map.get("r2"));

        map.compute("foo", (k, v) -> v + v);
        // ONLY change value of "foo" to "barbar"
        System.out.println(map.get("foo"));

        map.merge("foo", "boo", (oldVal, newVal) -> newVal + " was " + oldVal);
        // boo was barbar
        System.out.println(map.get("foo"));
    }

    private static void concurrentHashMapInterfaces() {
        // default value is 3, can be changed as below
        // -Djava.util.concurrent.ForkJoinPool.common.parallelism=5
        System.out.println(ForkJoinPool.getCommonPoolParallelism());

        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("foo", "bar");
        map.put("han", "solo");
        map.put("r2", "d2");
        map.put("c3", "p0");

        map.forEach(10, (key, value) ->
            System.out.printf("key: %s; value: %s; thread: %s\n",
                key, value, Thread.currentThread().getName()));

        System.out.println("##");
        String result = map.search(1, (key, value) -> {
            System.out.println(Thread.currentThread().getName());
            if ("foo".equals(key)) {
                return value;
            }
            return null;
        });
        System.out.println("Result: " + result);

        System.out.println("###");
        result = map.searchValues(1, value -> {
            System.out.println(Thread.currentThread().getName());
            if (value.length() > 3) {
                return value;
            }
            return null;
        });

        System.out.println("Result: " + result);

        System.out.println("####");
        result = map.reduce(1,
            (key, value) -> {
                System.out.println("Transform: " + Thread.currentThread().getName());
                return key + "=" + value;
            },
            (s1, s2) -> {
                System.out.println("Reduce: " + Thread.currentThread().getName());
                return s1 + ", " + s2;
            });

        System.out.println("Result: " + result);
    }
}

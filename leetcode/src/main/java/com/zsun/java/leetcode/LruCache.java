package com.zsun.java.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author : zsun
 * @date : 2020/08/29 16:59
 */
public class LruCache {
    private LinkedList<Integer> data;
    private Map<Integer, Integer> map;
    private int capacity = 0;

    public LruCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>(capacity);
        data = new LinkedList<>();
    }

    public int get(Integer key) {
        if (map.containsKey(key)) {
            data.remove(key);
            data.addFirst(key);
            return map.get(key);
        } else {
            return -1;
        }
    }

    public void put(Integer key, Integer value) {
        if (map.containsKey(key)) {
            map.put(key, value);
            data.remove(key);
            data.addFirst(key);
        } else {
            if (data.size() >= capacity) {
                map.remove(data.removeLast());
            }
            data.addFirst(key);
            map.put(key, value);
        }
    }

    public static void main(String[] args) {
        LruCache lruCache = new LruCache(2);
        lruCache.put(1,1);
        lruCache.put(2,2);
        lruCache.get(1);
        lruCache.put(3,3);
        lruCache.get(2);
        lruCache.put(4,4);
        lruCache.get(1);
        lruCache.get(3);
        lruCache.get(4);
    }
}

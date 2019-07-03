package com.zsun.java.leetcode;

import java.util.HashMap;

/**
 * Created by zsun.
 * DateTime: 2019/07/03 22:52
 *
 * @author zsun
 */
public class TwoSum {
    public int[] find(int[] array, int target) {
        int[] result = new int[2];
        if (array == null || array.length < 2) {
            return result;
        }

        int length = array.length;
        HashMap<Integer, Integer> hashMap = new HashMap<>(length);
        for (int i = 0; i < length; i++) {
            if (hashMap.containsKey(array[i])) {
                result[0] = hashMap.get(array[i]);
                result[1] = i;
                return result;
            } else {
                hashMap.put(target - array[i], i);
            }
        }
        return result;
    }
}

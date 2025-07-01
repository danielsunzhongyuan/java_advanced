package com.zsun.java.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class DeleteAndEarn {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 3, 3, 3, 4};
        System.out.println(solution(nums));
        nums = new int[]{3, 4, 2};
        System.out.println(solution(nums));
    }
    public static int solution(int[] nums) {
        int length = nums.length;
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + i);
        }
        System.out.println(map);
        Set<Integer> keys = map.keySet();
        List<Integer> sortedKeys = keys.stream().sorted().collect(Collectors.toList());
        List<Integer> valuesWithInterval = new LinkedList<>();
        valuesWithInterval.add(map.get(sortedKeys.get(0)));
        for (int i = 1; i < sortedKeys.size(); i++) {
            int key = sortedKeys.get(i);
            int preKey = sortedKeys.get(i - 1);
            if (key != preKey + 1) {
                valuesWithInterval.add(0);
            }
            valuesWithInterval.add(map.get(key));
        }
        System.out.println(valuesWithInterval);
        return rob(valuesWithInterval.stream().mapToInt(Integer::intValue).toArray());
    }

    public static int rob(int[] nums) {
        int f1 = 0;
        int f2 = 0;
        int tmp = 0;
        for (int num : nums) {
            tmp = Math.max(f2, f1 + num);
            f1 = f2;
            f2 = tmp;
        }
        return f2;
    }
}

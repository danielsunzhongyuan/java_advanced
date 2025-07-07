package com.zsun.java.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllKDistantIndices {
    public static void main(String[] args) {
        FindAllKDistantIndices findAllKDistantIndices = new FindAllKDistantIndices();
        System.out.println(findAllKDistantIndices.findKDistantIndices(new int[]{3,4,9,1,3,9,5}, 9, 1));
        System.out.println(findAllKDistantIndices.findKDistantIndices(new int[]{2,2,2,2,2}, 2, 2));
    }
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> results = new ArrayList<>();
        List<Integer> indicesOfKey = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                indicesOfKey.add(i);
            }
        }
        System.out.println(indicesOfKey);
        if (indicesOfKey.isEmpty()) {
            return results;
        }
        for (int i = indicesOfKey.get(0) - k; i <= indicesOfKey.get(0) + k; i++) {
            if (i >= 0 && i < nums.length) {
                results.add(i);
            }
        }
        System.out.println(results);
        for (int i = 1; i < indicesOfKey.size(); i++) {
            int index = indicesOfKey.get(i);
            int preIndex = indicesOfKey.get(i - 1);
            for (int j = Math.max(preIndex + k + 1, index - k); j < Math.min(index + k + 1, nums.length); j++) {
                results.add(j);
            }
            System.out.println(results);
        }
        return results;
    }
}

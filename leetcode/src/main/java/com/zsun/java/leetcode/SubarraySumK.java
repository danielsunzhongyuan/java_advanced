package com.zsun.java.leetcode;

public class SubarraySumK {
    public static void main(String[] args) {
        System.out.println(new SubarraySumK().subarraySum(new int[]{1, 1, 1}, 2));
        System.out.println(new SubarraySumK().subarraySum(new int[]{1, 2, 3}, 3));
    }

    public int subarraySum(int[] nums, int k) {
        int result = 0;
        int[] leftSum = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                leftSum[i] = nums[i];
            } else {
                leftSum[i] = leftSum[i - 1] + nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (i == 0) {
                    if (leftSum[j] == k) {
                        result++;
                    }
                } else {
                    if (leftSum[j] - leftSum[i - 1] == k) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}

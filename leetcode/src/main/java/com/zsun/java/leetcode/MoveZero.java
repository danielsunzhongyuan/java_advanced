package com.zsun.java.leetcode;

import java.util.ArrayList;

public class MoveZero {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        new MoveZero().moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
    public void moveZeroes(int[] nums) {
        int i = 0;
        int length = nums.length;
        int j = 0;
        while (i < length && nums[i] != 0) {
            i++;
        }
        j = i + 1;
        while (j < length) {
            while (j < length && nums[j] == 0) {
                j++;
            }
            if (j < length) {
                nums[i] = nums[j];
                nums[j] = 0;
            }
            i++;
        }
        while (j < length) {
            nums[j++] = 0;
        }
    }
}

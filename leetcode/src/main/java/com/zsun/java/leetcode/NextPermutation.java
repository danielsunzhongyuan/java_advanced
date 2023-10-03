package com.zsun.java.leetcode;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        NextPermutation nextPermutation = new NextPermutation();
        nextPermutation.nextPermutation(nums);
        NumsUtil.printNums(nums);

        nums = new int[]{2, 3, 1};
        nextPermutation.nextPermutation(nums);
        NumsUtil.printNums(nums);

        nums = new int[]{3, 2, 1};
        nextPermutation.nextPermutation(nums);
        NumsUtil.printNums(nums);
    }

    public void nextPermutation(int[] nums) {
        int length = nums.length;
        if (length < 2) {
            return;
        }

        int j = length - 1;
        while (j > 0) {
            if (nums[j - 1] < nums[j]) {
                j--;
                break;
            }
            j--;
        }

        if (j == 0 && nums[0] >= nums[1]) {
            Arrays.sort(nums);
            return;
        }

        for (int i = length - 1; i > j; i--) {
            if (nums[i] > nums[j]) {
                swap(nums, i, j);

                int x = j + 1;
                int y = length - 1;
                while (x < y) {
                    swap(nums, x++, y--);
                }
                return;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        nums[i] ^= nums[j];
        nums[j] ^= nums[i];
        nums[i] ^= nums[j];
    }
}

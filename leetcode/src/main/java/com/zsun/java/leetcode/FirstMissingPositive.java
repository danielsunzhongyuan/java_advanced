package com.zsun.java.leetcode;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] a = new int[]{3, 4, -1, 1};
        FirstMissingPositive solution = new FirstMissingPositive();
        System.out.println(solution.firstMissingPositive(a));
    }

    public int firstMissingPositive(int[] nums) {
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            System.out.println(i + ", nums[i] = " + nums[i]);
            while (nums[i] > 0 && nums[i] <= length && nums[nums[i] - 1] != nums[i]) {
                swap(nums, nums[i] - 1, i);
                print(nums);
            }
        }

        for (int i = 0; i < length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return length + 1;
    }

    private void swap(int[] nums, int i, int j) {
//        int tmp = nums[i];
//        nums[i] = nums[j];
//        nums[j] = tmp;
        nums[i] ^= nums[j];
        nums[j] ^= nums[i];
        nums[i] ^= nums[j];
    }

    private void print(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println();
    }
}

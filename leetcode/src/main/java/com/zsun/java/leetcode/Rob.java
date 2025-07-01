package com.zsun.java.leetcode;

public class Rob {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1};
        System.out.println(rob(nums));
        nums = new int[]{2, 7, 9, 3, 1};
        System.out.println(rob(nums));

        nums = new int[]{1, 2, 3, 1};
        System.out.println(rob2(nums));
        nums = new int[]{2, 7, 9, 3, 1};
        System.out.println(rob2(nums));
    }

    public static int rob(int[] nums) {
        int houseCount = nums.length;
        if (houseCount == 1) {
            return nums[0];
        }
        if (houseCount == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int[] maxRobbedMoney = new int[houseCount];
        maxRobbedMoney[0] = nums[0];
        maxRobbedMoney[1] = Math.max(nums[0], nums[1]);
        int i = 2;
        while (i < houseCount) {
            maxRobbedMoney[i] = Math.max(maxRobbedMoney[i - 1], maxRobbedMoney[i - 2] + nums[i]);
            i++;
        }
        return maxRobbedMoney[houseCount - 1];
    }

    public static int rob2(int[] nums) {
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

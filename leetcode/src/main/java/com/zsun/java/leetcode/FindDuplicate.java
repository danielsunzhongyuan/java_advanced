package com.zsun.java.leetcode;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 5, 9, 6, 9, 3, 8, 9, 7, 1};
        System.out.println(new FindDuplicate().findDuplicate(nums));
    }

    public int findDuplicate(int[] nums) {
        int fast = 0;
        int slow = 0;

        slow = nums[slow];
        fast = nums[nums[fast]];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}

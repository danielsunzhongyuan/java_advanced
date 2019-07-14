package com.zsun.java.leetcode;

/**
 * Created by sunzhongyuan.
 * DateTime: 2019/07/14 11:24
 * Find minimum jumps from first step to reach last step.
 *
 * @author sunzhongyuan
 */
public class JumpGame {
    public int jump(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }

        int steps = 0;
        int k = nums.length - 1;
        while (k > 0) {
            k = jumpToKthStair(nums, k);
            steps++;
        }
        return steps;
    }

    private int jumpToKthStair(int[] nums, int k) {
        if (k <= 0) {
            return 0;
        }

        int minStairToKthStair = k - 1;
        for (int i = minStairToKthStair - 1; i >= 0; i--) {
            if (nums[i] >= (k - i)) {
                minStairToKthStair = i;
            }
        }
        return minStairToKthStair;
    }

    public int jump2(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }

        int reachable = 0;
        int step = 0;
        int start = 0;
        while (reachable < nums.length - 1) {
            int range = reachable;
            for (int i = start; i <= range; i++) {
                reachable = Math.max(reachable, i + nums[i]);
            }
            start = range + 1;
            step++;
        }
        return step;
    }
}

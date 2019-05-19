package com.zsun.java.nowcoder.jianzhioffer;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 20:35
 */

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级......它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class JumpFloor2 {
    public int Jump2(int target) {
        if (target <= 0) {
            return -1;
        }

        if (target <= 2) {
            return target;
        }

        int[] jumps = new int[target + 1];
        jumps[0] = 1;
        int i;
        int j;
        for (i = 1; i <= target; i++) {
            for (j = 0; j < i; j++) {
                jumps[i] += jumps[j];
            }
        }
        return jumps[target];
    }
}

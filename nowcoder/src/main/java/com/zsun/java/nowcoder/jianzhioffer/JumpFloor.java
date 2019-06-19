package com.zsun.java.nowcoder.jianzhioffer;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 20:30
 *
 * @author zsun
 */
public class JumpFloor {
    public int jump(int target) {
        if (target <= 0) {
            return -1;
        }

        if (target <= 2) {
            return target;
        }

        int[] jumps = new int[target];
        jumps[0] = 1;
        jumps[1] = 2;
        for (int i = 2; i < target; i++) {
            jumps[i] = jumps[i - 1] + jumps[i - 2];
        }
        return jumps[target - 1];
    }
}

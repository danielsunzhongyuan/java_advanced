package com.zsun.java.nowcoder.jianzhioffer;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 20:44
 */

/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法
 * <p>
 * 这题与JumpFloor的区别就在于 target=0 的情况，应该返回0
 */
public class RectCover {
    public int cover(int target) {
        if (target < 0) {
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

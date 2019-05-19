package com.zsun.java.nowcoder.jianzhioffer;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 20:51
 */
public class NumberOfOne {
    public int NumberOf1(int n) {
        int ret = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                ret++;
            }
            n >>>= 1;
        }
        return ret;
    }
}

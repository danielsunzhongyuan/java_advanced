package com.zsun.java.nowcoder.jianzhioffer;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 21:00
 */
public class Power {
    public double power(double base, int exponent) {
        if (exponent < 0) {
            return 1.0 / power(base, -exponent);
        }
        if (exponent == 0) {
            return 1.0;
        }
        if (exponent == 1) {
            return base;
        }
        double tmp = power(base, exponent >> 1);
        if ((exponent & 1) == 1) {
            return base * tmp * tmp;
        } else {
            return tmp * tmp;
        }
    }
}

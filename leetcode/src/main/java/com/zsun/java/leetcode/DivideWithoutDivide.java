package com.zsun.java.leetcode;

/**
 * @author : zsun
 * @date : 2020/08/29 10:20
 */
public class DivideWithoutDivide {
    public static int divide(int dividend, int divisor) {
        if (dividend < divisor) {
            return 0;
        }
        int tmp = dividend;
        int offset = 0;
        while ((tmp >> 1) > divisor) {
            offset++;
            tmp >>= 1;
        }

        int power = 1;
        int product = divisor;
        for (int i = 0; i < offset; i++) {
            power <<= 1;
            product <<= 1;
        }
        return power + divide(dividend - product, divisor);
    }

    public static void main(String[] args) {
        int dividend = 3;
        int divisor = 2;
        System.out.println(dividend + " / " + divisor + " = " + divide(dividend, divisor));
        dividend = 2123232323;
        divisor = 2;
        System.out.println(dividend + " / " + divisor + " = " + divide(dividend, divisor));
    }
}

package com.zsun.java.nowcoder.jianzhioffer;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 20:13
 *
 * @author zsun
 */
public class Fibonacci {
    public int fibonacci(int n) {
        // illegal n
        if (n < 0) {
            return -1;
        }

        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;

        int next = 0;
        while (n >= 2) {
            next = a + b;
            a = b;
            b = next;
            n--;
        }
        return next;
    }
}

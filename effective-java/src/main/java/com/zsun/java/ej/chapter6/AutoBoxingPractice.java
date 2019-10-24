package com.zsun.java.ej.chapter6;

/**
 * Created by zsun.
 * DateTime: 2019/10/24 20:14
 *
 * @author zsun
 */
public class AutoBoxingPractice {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        sumWithAutoBoxing();
        long end = System.currentTimeMillis();
        // 8s 左右
        System.out.println("Auto boxing: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        sumWithoutAutoBoxing();
        end = System.currentTimeMillis();
        // 0.7s 左右
        System.out.println("No Auto boxing: " + (end - start) + " ms");
    }

    private static void sumWithAutoBoxing() {
        // bad definition for sum
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE - 1; i++) {
            sum += i;
        }

        // int 和 long 相加时，会进行自动转换，导致速度比上面慢一点点
        // 此外注意 int 类型的 i 是永远都会小于等于 Integer.MAX_VALUE 的
        for (int i = 0; i <= Integer.MAX_VALUE - 1; i++) {
            sum += i;
        }
    }

    private static void sumWithoutAutoBoxing() {
        // good
        long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE - 1; i++) {
            sum += i;
        }

        // int 和 long 相加时，会进行自动转换，导致速度比上面慢一点点
        // 此外注意 int 类型的 i 是永远都会小于等于 Integer.MAX_VALUE 的
        for (int i = 0; i <= Integer.MAX_VALUE - 1; i++) {
            sum += i;
        }
    }
}

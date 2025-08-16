package com.zsun.java;

/**
 * 坂本友彦算法
 * 周一是 1， 周日是 0
 */
public class DayOfWeek {
    public static void main(String[] args) {
        System.out.println(getDayOfWeek(2025, 8, 10));
    }

    public static int getDayOfWeek(int y, int m, int d) {
        int[] t = new int[]{0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if (m < 3) {
            y--;
        }
        return (y + y / 4 - y / 100 + y / 400 + t[m - 1] + d) % 7;
    }
}

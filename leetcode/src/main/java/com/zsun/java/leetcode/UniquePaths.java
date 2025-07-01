package com.zsun.java.leetcode;

public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
        System.out.println(uniquePaths(3, 2));
    }

    public static int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (m == 1 || n == 1) {
            return 1;
        }

        int[] maxPathCount = new int[n];
        for (int i = 0; i < n; i++) {
            maxPathCount[i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                maxPathCount[j] = maxPathCount[j - 1] + maxPathCount[j];
            }
        }
        return maxPathCount[n - 1];
    }
}

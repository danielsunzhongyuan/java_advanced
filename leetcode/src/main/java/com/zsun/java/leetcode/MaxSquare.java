package com.zsun.java.leetcode;

public class MaxSquare {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return 0;
        }

        int n = matrix.length;
        int m = matrix[0].length;
        int maxSize = 0;

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == '1') {
                    dp[i + 1][j + 1] = Math.min(Math.min(dp[i + 1][j], dp[i][j + 1]), dp[i][j]) + 1;
                    maxSize = Math.max(maxSize, dp[i + 1][j + 1]);
                }
            }
        }
        return maxSize * maxSize;
    }
}

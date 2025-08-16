package com.zsun.java.leetcode;

public class MinFallingPathSum {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
            {2, 1, 3},
            {6, 5, 4},
            {7, 8, 9}
        };

        System.out.println(new MinFallingPathSum().minFallingPathSum(matrix));
    }
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return matrix[0][0];
        }

        int[][] currentSum = new int[2][n];
        for (int i = 0; i < n; i++) {
            currentSum[0][i] = matrix[0][i];
        }

        int currentSumIndex = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    currentSum[currentSumIndex][j] = matrix[i][j] + Math.min(currentSum[1-currentSumIndex][j], currentSum[1-currentSumIndex][j + 1]);
                } else if (j == n - 1) {
                    currentSum[currentSumIndex][j] = matrix[i][j] + Math.min(currentSum[1-currentSumIndex][j], currentSum[1-currentSumIndex][j - 1]);
                } else {
                    currentSum[currentSumIndex][j] = matrix[i][j] + Math.min(Math.min(currentSum[1-currentSumIndex][j], currentSum[1-currentSumIndex][j + 1]), currentSum[1-currentSumIndex][j - 1]);
                }
            }

            currentSumIndex = 1 - currentSumIndex;
        }

        currentSumIndex = 1 - currentSumIndex;
        int result = currentSum[currentSumIndex][0];
        for (int i = 1; i < n; i++) {
            if (result > currentSum[currentSumIndex][i]) {
                result = currentSum[currentSumIndex][i];
            }
        }
        return result;
    }
}

package com.zsun.java.leetcode;

public class UniquePathsWithObstacles {
    public static void main(String[] args) {
        int[][] a = new int[][]{
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };

        UniquePathsWithObstacles uniquePathsWithObstacles = new UniquePathsWithObstacles();
        System.out.println(uniquePathsWithObstacles.uniquePathsWithObstacles(a));

        a = new int[][]{
            {1}
        };
        System.out.println(uniquePathsWithObstacles.uniquePathsWithObstacles(a));
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        if (m == 0) {
            return 0;
        }

        int n = obstacleGrid[0].length;
        if (n == 0) {
            return 0;
        }

        int[] maxPathCount = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                maxPathCount[i] = 1 - obstacleGrid[0][0];
            } else {
                if (obstacleGrid[0][i] == 1 || maxPathCount[i - 1] == 0) {
                    maxPathCount[i] = 0;
                } else {
                    maxPathCount[i] = 1;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    maxPathCount[j] = 0;
                } else {
                    if (j > 0) {
                        maxPathCount[j] = maxPathCount[j - 1] + maxPathCount[j];
                    }
                }
            }
        }
        return maxPathCount[n - 1];
    }
}

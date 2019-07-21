package com.zsun.java.leetcode;

/**
 * Created by sunzhongyuan.
 * DateTime: 2019/07/21 15:41
 *
 * @author sunzhongyuan
 */
public class IslandPerimeter {
    public int find(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return -1;
        }
        int perimeter = 0;
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    perimeter += 4;
                    if (i > 0 && grid[i - 1][j] > 0) {
                        perimeter -= 2;
                    }
                    if (j > 0 && grid[i][j - 1] > 0) {
                        perimeter -= 2;
                    }
                }
            }
        }
        return perimeter;
    }
}

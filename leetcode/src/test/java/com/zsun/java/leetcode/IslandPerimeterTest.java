package com.zsun.java.leetcode;

import org.junit.Test;

/**
 * Created by sunzhongyuan.
 * DateTime: 2019/07/21 15:43
 *
 * @author sunzhongyuan
 */
public class IslandPerimeterTest {
    private IslandPerimeter solution = new IslandPerimeter();

    @Test
    public void testInvalid() {
        assert -1 == solution.find(null);
        assert -1 == solution.find(new int[][]{});
        int[][] grid = new int[1][];
        grid[0] = new int[]{};
        assert -1 == solution.find(grid);
    }

    @Test
    public void testNormal() {
        int[][] grid = new int[4][4];
        grid[0] = new int[]{0, 1, 0, 0};
        grid[1] = new int[]{1, 1, 1, 0};
        grid[2] = new int[]{0, 1, 0, 0};
        grid[3] = new int[]{1, 1, 0, 0};
        assert 16 == solution.find(grid);
    }
}

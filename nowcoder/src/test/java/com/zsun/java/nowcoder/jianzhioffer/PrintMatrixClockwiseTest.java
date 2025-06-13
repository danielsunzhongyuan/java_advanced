package com.zsun.java.nowcoder.jianzhioffer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Created by zsun.
 * DateTime: 2019/05/20 20:19
 */
public class PrintMatrixClockwiseTest {
    private PrintMatrixClockwise solution = new PrintMatrixClockwise();

    @Test
    public void testEmpty() {
        assertArrayEquals(new Integer[]{},
            solution.printMatrix(null).toArray());

        assertArrayEquals(new Integer[]{},
            solution.printMatrix(new int[][]{}).toArray());

        int[] x = new int[]{};
        assertArrayEquals(new Integer[]{},
            solution.printMatrix(new int[][]{x}).toArray());
    }

    @Test
    public void testNormal() {
        int[][] matrix = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10},
            solution.printMatrix(matrix).toArray());
    }

    @Test
    public void testOneColumn() {
        int[][] matrix = new int[][]{
            {1}, {2}, {3}, {4}, {5}
        };
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5},
            solution.printMatrix(matrix).toArray());
    }

    @Test
    public void testOneRow() {
        int[][] matrix = new int[][]{
            {1, 2, 3, 4, 5}
        };
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5},
            solution.printMatrix(matrix).toArray());
    }
}

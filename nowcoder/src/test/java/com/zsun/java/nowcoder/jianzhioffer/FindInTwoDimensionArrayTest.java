package com.zsun.java.nowcoder.jianzhioffer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 09:23
 */
public class FindInTwoDimensionArrayTest {
    private FindInTwoDimensionArray solution = new FindInTwoDimensionArray();

    @Test
    public void testNull() {
        assertFalse(solution.find(-1, null));
        assertFalse(solution.find(-1, new int[][]{}));
        assertFalse(solution.find2(-1, null));
        assertFalse(solution.find2(-1, new int[][]{}));
        int[] x = new int[]{};
        int[][] array = new int[][]{x};
        assertFalse(solution.find(-1, array));
        assertFalse(solution.find2(-1, array));
    }

    @Test
    public void testEvenArray() {
        int[][] array = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
        };
        for (int i = 1; i <= 16; i++) {
            assertTrue(solution.find(i, array));
            assertTrue(solution.find2(i, array));
        }
        assertFalse(solution.find(100, array));
        assertFalse(solution.find(0, array));

        assertFalse(solution.find2(100, array));
        assertFalse(solution.find2(0, array));
    }

    @Test
    public void testOddArray() {
        int[][] array = new int[][]{
            {1, 2, 3, 4, 5, 6, 7},
            {8, 9, 10, 11, 12, 13, 14},
            {15, 16, 17, 18, 19, 20, 21},
            {22, 23, 24, 25, 26, 27, 28},
            {29, 30, 31, 32, 33, 34, 35},
            {36, 37, 38, 39, 40, 41, 42},
            {43, 44, 45, 46, 47, 48, 49},
        };
        for (int i = 1; i <= 49; i++) {
            assertTrue(solution.find(i, array));
            assertTrue(solution.find2(i, array));
        }
        assertFalse(solution.find(100, array));
        assertFalse(solution.find(0, array));

        assertFalse(solution.find2(100, array));
        assertFalse(solution.find2(0, array));
    }
}

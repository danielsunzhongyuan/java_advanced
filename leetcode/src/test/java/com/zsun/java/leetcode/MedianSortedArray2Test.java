package com.zsun.java.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by sunzhongyuan.
 * DateTime: 2019-07-21 19:23
 *
 * @author sunzhongyuan
 */
public class MedianSortedArray2Test {
    private MedianSortedArray2 solution = new MedianSortedArray2();

    @Test
    public void testEmpty() {
        assertEquals(0.0, solution.find(null, null));
        assertEquals(0.0, solution.find(null, new int[]{}));
        assertEquals(0.0, solution.find(new int[]{}, new int[]{}));
    }

    @Test
    public void testOneEmptyArray() {
        assertEquals(1.0, solution.find(null, new int[]{1}));
        assertEquals(1.5, solution.find(new int[]{}, new int[]{1, 2}));
        assertEquals(2.0, solution.find(new int[]{1, 2, 3}, new int[]{}));
    }

    @Test
    public void testOddTotal() {
        assertEquals(2.0, solution.find(new int[]{1}, new int[]{2, 3}));
        assertEquals(3.0, solution.find(new int[]{1}, new int[]{2, 3, 4, 5}));

        assertEquals(3.0, solution.find(new int[]{1, 3, 5}, new int[]{2, 3}));

        assertEquals(2.0, solution.find(new int[]{2, 3}, new int[]{1}));
        assertEquals(3.0, solution.find(new int[]{2, 3, 4, 5}, new int[]{1}));

        assertEquals(3.0, solution.find(new int[]{2, 3}, new int[]{1, 3, 5}));
    }

    @Test
    public void testEvenTotal() {
        assertEquals(1.5, solution.find(new int[]{1}, new int[]{2}));
        assertEquals(2.5, solution.find(new int[]{1, 2}, new int[]{3, 4}));
        assertEquals(2.5, solution.find(new int[]{1, 3}, new int[]{2, 4}));

        assertEquals(3.5, solution.find(new int[]{1, 3, 5}, new int[]{2, 4, 6}));
        assertEquals(5.5, solution.find(new int[]{1, 3, 5, 7, 9, 11, 13}, new int[]{2, 4, 6}));
        assertEquals(6.0, solution.find(new int[]{1, 3, 5, 7, 9, 11, 13}, new int[]{2}));
    }
}

package com.zsun.java.algorithms.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Created by qzou.
 * DateTime: 2019-06-22 21:50
 *
 * @author qzou
 */
public class RadixSortTest {
    private Sort sorter = new RadixSort();

    @Test
    public void testNull() {
        Integer[] array = null;
        sorter.sort(array, null);
        assertNull(array);
    }

    @Test
    public void testEmpty() {
        Integer[] array = new Integer[]{};
        sorter.sort(array, null);
        assertArrayEquals(new Integer[]{}, array);
    }

    @Test
    public void testOneElement() {
        Integer[] array = new Integer[]{1};
        sorter.sort(array, null);
        assertArrayEquals(new Integer[]{1}, array);
    }

    @Test
    public void testRandom() {
        Integer[] array = new Integer[]{4, 2, 1, 3, 24, 34, 54, 2, 3, 43, 23, 34, 2, 3, 67, 5, 56, 56, 4, 5, 47, 66, 8, 87, 67};
        sorter.sort(array, null);
        assertArrayEquals(
            new Integer[]{1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 8, 23, 24, 34, 34, 43, 47, 54, 56, 56, 66, 67, 67, 87}, array);
    }
}

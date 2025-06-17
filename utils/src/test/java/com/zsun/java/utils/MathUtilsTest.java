package com.zsun.java.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Unit test for simple MathUtils.
 */
public class MathUtilsTest {
    @Test
    public void testNormal() {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        MathUtils.swap(array, 0, 1);
        assertArrayEquals(new Integer[]{2, 1, 3, 4, 5}, array);

        MathUtils.swap(array, 2, 4);
        assertArrayEquals(new Integer[]{2, 1, 5, 4, 3}, array);
    }

    @Test
    public void testEmpty() {
        Integer[] array = new Integer[]{};
        MathUtils.swap(array, 0, 1);
        assertArrayEquals(new Integer[]{}, array);
    }

    @Test
    public void testOneElement() {
        Integer[] array = new Integer[]{1};
        MathUtils.swap(array, 0, 1);
        assertArrayEquals(new Integer[]{1}, array);
    }

    @Test
    public void testInvalidIJ() {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        MathUtils.swap(array, -1, -1);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);

        MathUtils.swap(array, -1, 30);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);

        MathUtils.swap(array, 30, -1);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);

        MathUtils.swap(array, 30, 29);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);

        MathUtils.swap(array, 1, 30);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }
}

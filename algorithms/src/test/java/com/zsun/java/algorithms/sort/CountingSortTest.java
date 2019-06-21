package com.zsun.java.algorithms.sort;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

public class CountingSortTest extends TestCase {
    private Sort sorter = new CountingSort();

    public CountingSortTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(CountingSortTest.class);
    }

    public void testNull() {
        int[] array = null;
        sorter.sort(array);
        assertNull(array);
    }

    public void testEmpty() {
        int[] array = new int[]{};
        sorter.sort(array);
        Assert.assertArrayEquals(new int[]{}, array);
    }

    public void testOneElement() {
        int[] array = new int[]{1};
        sorter.sort(array);
        Assert.assertArrayEquals(new int[]{1}, array);
    }

    public void testRandom() {
        int[] array = new int[]{4, 2, 1, 3, 24, 34, 54, 2, 3, 43, 23, 34, 2, 3, 67, 5, 56, 56, 4, 5, 47, 66, 8, 87, 67};
        sorter.sort(array);
        Assert.assertArrayEquals(
            new int[]{1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 8, 23, 24, 34, 34, 43, 47, 54, 56, 56, 66, 67, 67, 87}, array);
    }
}

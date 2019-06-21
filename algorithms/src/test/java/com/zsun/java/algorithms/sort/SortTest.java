package com.zsun.java.algorithms.sort;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

public class SortTest extends TestCase {
    private Sort sorter;

    public SortTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(SortTest.class);
    }

    /**
     * an empty test is necessary
     */
    public void test() {
        assertTrue(true);
    }

    protected void run(Sort sorter) {
        this.sorter = sorter;
        tNull();
        tEmpty();
        tOneElement();
        tTwoElements();
        tThreeElements();
        tFourElements();
        tSorted();
        tSortedReverse();
        tRandom();
    }

    private void tNull() {
        int[] array = null;
        this.sorter.sort(array);
        assertNull(array);
    }

    private void tEmpty() {
        int[] array = new int[]{};
        this.sorter.sort(array);
        assertEquals(0, array.length);
    }

    private void tOneElement() {
        int[] array = new int[]{1};
        this.sorter.sort(array);
        Assert.assertArrayEquals(new int[]{1}, array);
    }

    private void tTwoElements() {
        int[] array = new int[]{2, 1};
        this.sorter.sort(array);
        Assert.assertArrayEquals(new int[]{1, 2}, array);
    }

    private void tThreeElements() {
        int[] array = new int[]{2, 1, -3};
        this.sorter.sort(array);
        Assert.assertArrayEquals(new int[]{-3, 1, 2}, array);
    }

    private void tFourElements() {
        int[] array = new int[]{2, 1, -3, 0, 89};
        this.sorter.sort(array);
        Assert.assertArrayEquals(new int[]{-3, 0, 1, 2, 89}, array);
    }

    private void tSorted() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        this.sorter.sort(array);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    private void tSortedReverse() {
        int[] array = new int[]{10, 9, 8, 7, 6};
        this.sorter.sort(array);
        Assert.assertArrayEquals(new int[]{6, 7, 8, 9, 10}, array);
    }

    private void tRandom() {
        int[] array = new int[]{34, 13, 24, 3, 23, 23, 435, 45, 42, 233, -1, 2, -10};
        this.sorter.sort(array);
        Assert.assertArrayEquals(new int[]{-10, -1, 2, 3, 13, 23, 23, 24, 34, 42, 45, 233, 435}, array);

        array = new int[]{9, 2, 4, 1, 3, 2, 5, 7, 6, 9};
        this.sorter.sort(array);
        Assert.assertArrayEquals(new int[]{1, 2, 2, 3, 4, 5, 6, 7, 9, 9}, array);
    }
}

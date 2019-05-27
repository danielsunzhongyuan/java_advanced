package com.zsun.java.algorithms.sort;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

/**
 * Created by zsun.
 * DateTime: 2019/05/23 00:37
 */
public class InsertSortTest extends TestCase {
    private InsertSort solution = new InsertSort();

    public InsertSortTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(InsertSortTest.class);
    }

    public void testEmpty() {
        int[] array = new int[]{};
        solution.sort(array);
        assertEquals(0, array.length);
    }

    public void testSorted() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        solution.sort(array);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    public void testSortedReverse() {
        int[] array = new int[]{10, 9, 8, 7, 6};
        solution.sort(array);
        Assert.assertArrayEquals(new int[]{6, 7, 8, 9, 10}, array);
    }
}

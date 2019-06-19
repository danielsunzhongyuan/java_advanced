package com.zsun.java.utils;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

/**
 * Unit test for simple MathUtils.
 */
public class MathUtilsTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public MathUtilsTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(MathUtilsTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testNormal() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        MathUtils.swap(array, 0, 1);
        Assert.assertArrayEquals(new int[]{2, 1, 3, 4, 5}, array);

        MathUtils.swap(array, 2, 4);
        Assert.assertArrayEquals(new int[]{2, 1, 5, 4, 3}, array);
    }

    public void testEmpty() {
        int[] array = new int[]{};
        MathUtils.swap(array, 0, 1);
        Assert.assertArrayEquals(new int[]{}, array);
    }

    public void testOneElement() {
        int[] array = new int[]{1};
        MathUtils.swap(array, 0, 1);
        Assert.assertArrayEquals(new int[]{1}, array);
    }

    public void testInvalidIJ() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        MathUtils.swap(array, -1, -1);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);

        MathUtils.swap(array, -1, 30);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);

        MathUtils.swap(array, 30, -1);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);

        MathUtils.swap(array, 30, 29);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);

        MathUtils.swap(array, 1, 30);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }
}

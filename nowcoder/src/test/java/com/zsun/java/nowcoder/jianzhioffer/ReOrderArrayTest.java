package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 22:46
 */
public class ReOrderArrayTest extends TestCase {
    private ReOrderArray solution = new ReOrderArray();

    public ReOrderArrayTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(ReOrderArrayTest.class);
    }

    public void testNull() {
        int[] a = null;
        solution.reOrderArray(a);
        assertNull(a);

        solution.reOrderArray2(a);
        assertNull(a);

        solution.reOrderArray3(a);
        assertNull(a);
    }

    public void testOneElement() {
        int[] a = new int[]{-3};
        solution.reOrderArray(a);
        Assert.assertArrayEquals(new int[]{-3}, a);

        solution.reOrderArray2(a);
        Assert.assertArrayEquals(new int[]{-3}, a);

        solution.reOrderArray3(a);
        Assert.assertArrayEquals(new int[]{-3}, a);
    }

    public void testNormal() {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        solution.reOrderArray(a);
        Assert.assertArrayEquals(new int[]{1, 3, 5, 7, 2, 4, 6}, a);

        a = new int[]{1, 2, 3, 4, 5, 6, 7};
        solution.reOrderArray2(a);
        Assert.assertArrayEquals(new int[]{1, 3, 5, 7, 2, 4, 6}, a);

        a = new int[]{1, 2, 3, 4, 5, 6, 7};
        solution.reOrderArray3(a);
        Assert.assertArrayEquals(new int[]{1, 7, 3, 5, 4, 6, 2}, a);
    }

    public void testReOrdered() {
        int[] a = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8};
        solution.reOrderArray(a);
        Assert.assertArrayEquals(new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8}, a);

        a = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8};
        solution.reOrderArray2(a);
        Assert.assertArrayEquals(new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8}, a);

        a = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8};
        solution.reOrderArray3(a);
        Assert.assertArrayEquals(new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8}, a);
    }

    public void testAllOdds() {
        int[] a = new int[]{1, 3, 5, 7, 9};
        solution.reOrderArray(a);
        Assert.assertArrayEquals(new int[]{1, 3, 5, 7, 9}, a);

        a = new int[]{1, 3, 5, 7, 9};
        solution.reOrderArray2(a);
        Assert.assertArrayEquals(new int[]{1, 3, 5, 7, 9}, a);

        a = new int[]{1, 3, 5, 7, 9};
        solution.reOrderArray3(a);
        Assert.assertArrayEquals(new int[]{1, 3, 5, 7, 9}, a);
    }

    public void testAllEvens() {
        int[] a = new int[]{2, 4, 6, 8, 0};
        solution.reOrderArray(a);
        Assert.assertArrayEquals(new int[]{2, 4, 6, 8, 0}, a);

        a = new int[]{2, 4, 6, 8, 0};
        solution.reOrderArray2(a);
        Assert.assertArrayEquals(new int[]{2, 4, 6, 8, 0}, a);

        a = new int[]{2, 4, 6, 8, 0};
        solution.reOrderArray3(a);
        Assert.assertArrayEquals(new int[]{2, 4, 6, 8, 0}, a);
    }

    public void testMinusNumbers() {
        int[] a = new int[]{-3, -2, -1, -8, -9};
        solution.reOrderArray(a);
        Assert.assertArrayEquals(new int[]{-3, -1, -9, -2, -8}, a);

        a = new int[]{-3, -2, -1, -8, -9};
        solution.reOrderArray2(a);
        Assert.assertArrayEquals(new int[]{-3, -1, -9, -2, -8}, a);

        a = new int[]{-3, -2, -1, -8, -9};
        solution.reOrderArray3(a);
        Assert.assertArrayEquals(new int[]{-3, -9, -1, -8, -2}, a);
    }
}

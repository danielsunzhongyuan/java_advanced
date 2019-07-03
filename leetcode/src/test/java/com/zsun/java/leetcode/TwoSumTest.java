package com.zsun.java.leetcode;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

/**
 * Created by zsun.
 * DateTime: 2019/07/03 23:01
 *
 * @author zsun
 */
public class TwoSumTest extends TestCase {
    private TwoSum solution = new TwoSum();

    public TwoSumTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(TwoSumTest.class);
    }

    public void testEmpty() {
        Assert.assertArrayEquals(new int[]{0, 0}, solution.find(null, 100));
        Assert.assertArrayEquals(new int[]{0, 0}, solution.find(new int[]{}, 100));
        Assert.assertArrayEquals(new int[]{0, 0}, solution.find(new int[]{1}, 100));
        Assert.assertArrayEquals(new int[]{0, 0}, solution.find(new int[]{100}, 100));
    }

    public void testNormal() {
        Assert.assertArrayEquals(new int[]{0, 0}, solution.find(new int[]{1, 2, 3}, 100));
        Assert.assertArrayEquals(new int[]{0, 1}, solution.find(new int[]{5, 2, 9}, 7));
    }
}

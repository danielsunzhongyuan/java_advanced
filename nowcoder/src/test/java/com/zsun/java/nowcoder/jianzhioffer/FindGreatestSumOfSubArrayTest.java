package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/07/03 22:15
 *
 * @author zsun
 */
public class FindGreatestSumOfSubArrayTest extends TestCase {
    private FindGreatestSumOfSubArray solution = new FindGreatestSumOfSubArray();

    public FindGreatestSumOfSubArrayTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(FindGreatestSumOfSubArrayTest.class);
    }

    public void testEmpty() {
        assertEquals(0, solution.find(null));
        assertEquals(0, solution.find(new int[]{}));
    }

    public void testOneElement() {
        assertEquals(-1, solution.find(new int[]{-1}));
        assertEquals(0, solution.find(new int[]{0}));
        assertEquals(1, solution.find(new int[]{1}));
    }

    public void testNormal() {
        assertEquals(-10, solution.find(new int[]{-10, -11, -12, -13, -14}));
        assertEquals(18, solution.find(new int[]{1, -2, 3, 10, -4, 7, 2, -5}));
        assertEquals(8, solution.find(new int[]{6, -3, -2, 7, -15, 1, 2, 2}));
    }
}

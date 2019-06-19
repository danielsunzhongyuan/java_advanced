package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/06/19 15:48
 *
 * @author zsun
 */
public class RotateArrayTest extends TestCase {
    private RotateArray solution = new RotateArray();

    public RotateArrayTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(RotateArrayTest.class);
    }

    public void testNormal() {
        assertEquals(1, solution.minNumberInRotateArray(new int[]{1}));

        assertEquals(1, solution.minNumberInRotateArray(new int[]{1, 2, 3}));

        assertEquals(1, solution.minNumberInRotateArray(new int[]{3, 1, 2}));

        assertEquals(1, solution.minNumberInRotateArray(new int[]{2, 3, 1}));
    }

    public void testInvalid() {
        assertEquals(0, solution.minNumberInRotateArray(new int[]{}));
    }
}

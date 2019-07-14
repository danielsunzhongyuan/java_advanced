package com.zsun.java.leetcode;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by sunzhongyuan.
 * DateTime: 2019/07/14 12:16
 *
 * @author sunzhongyuan
 */
public class JumpGameTest extends TestCase {
    private JumpGame solution = new JumpGame();

    public JumpGameTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(JumpGameTest.class);
    }

    public void testEmpty() {
        assertEquals(0, solution.jump(null));
        assertEquals(0, solution.jump2(null));

        int[] emptyArray = new int[]{};
        assertEquals(0, solution.jump(emptyArray));
        assertEquals(0, solution.jump2(emptyArray));

        int[] oneElement = new int[]{1};
        assertEquals(0, solution.jump(oneElement));
        assertEquals(0, solution.jump2(oneElement));
    }

    public void testNormal() {
        int[] array = new int[]{2, 3, 1, 1, 4};
        assertEquals(2, solution.jump(array));
        assertEquals(2, solution.jump2(array));
    }
}

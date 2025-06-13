package com.zsun.java.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by sunzhongyuan.
 * DateTime: 2019/07/14 12:16
 *
 * @author sunzhongyuan
 */
public class JumpGameTest {
    private JumpGame solution = new JumpGame();

    @Test
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

    @Test
    public void testNormal() {
        int[] array = new int[]{2, 3, 1, 1, 4};
        assertEquals(2, solution.jump(array));
        assertEquals(2, solution.jump2(array));
    }
}

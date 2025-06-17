package com.zsun.java.nowcoder.jianzhioffer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by qzou.
 * DateTime: 2019-07-03 00:05
 *
 * @author qzou
 */
public class JumpFloor2Test {
    private JumpFloor2 solution = new JumpFloor2();

    @Test
    public void testInvalid() {
        for (int i = -3; i <= 0; i++) {
            assertEquals(-1, solution.jump2(i));
        }
    }

    @Test
    public void testNormal() {
        assertEquals(1, solution.jump2(1));
        assertEquals(2, solution.jump2(2));
        assertEquals(4, solution.jump2(3));
        assertEquals(8, solution.jump2(4));
        assertEquals(16, solution.jump2(5));
    }
}

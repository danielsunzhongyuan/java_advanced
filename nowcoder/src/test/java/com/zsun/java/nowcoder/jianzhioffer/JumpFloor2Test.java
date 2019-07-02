package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by qzou.
 * DateTime: 2019-07-03 00:05
 *
 * @author qzou
 */
public class JumpFloor2Test extends TestCase {
    private JumpFloor2 solution = new JumpFloor2();

    public JumpFloor2Test(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(JumpFloor2Test.class);
    }

    public void testInvalid() {
        for (int i = -3; i <= 0; i++) {
            assertEquals(-1, solution.jump2(i));
        }
    }

    public void testNormal() {
        assertEquals(1, solution.jump2(1));
        assertEquals(2, solution.jump2(2));
        assertEquals(4, solution.jump2(3));
        assertEquals(8, solution.jump2(4));
        assertEquals(16, solution.jump2(5));
    }
}

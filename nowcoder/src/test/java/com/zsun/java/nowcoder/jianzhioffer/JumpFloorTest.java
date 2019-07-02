package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by qzou.
 * DateTime: 2019-07-03 00:02
 *
 * @author qzou
 */
public class JumpFloorTest extends TestCase {
    private JumpFloor solution = new JumpFloor();

    public JumpFloorTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(JumpFloorTest.class);
    }

    public void testInvalid() {
        for (int i = -3; i <= 0; i++) {
            assertEquals(-1, solution.jump(i));
        }
    }

    public void testNormal() {
        assertEquals(1, solution.jump(1));
        assertEquals(2, solution.jump(2));
        assertEquals(3, solution.jump(3));
        assertEquals(5, solution.jump(4));
        assertEquals(8, solution.jump(5));
    }
}

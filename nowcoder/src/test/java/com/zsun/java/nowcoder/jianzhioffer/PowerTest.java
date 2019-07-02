package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by qzou.
 * DateTime: 2019-07-02 23:48
 *
 * @author qzou
 */
public class PowerTest extends TestCase {
    private Power solution = new Power();

    public PowerTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(PowerTest.class);
    }

    public void testExponentZero() {
        assertEquals(1.0, solution.power(10.0, 0));
        assertEquals(1.0, solution.power(-10.0, 0));
    }

    public void testExponentOne() {
        for (int i = -3; i < 4; i++) {
            assertEquals(1.0 * i, solution.power(1.0 * i, 1));
        }
    }

    public void testMinusExponent() {
        assertEquals(0.5, solution.power(2, -1));
    }

    public void testBigExponent() {
        assertEquals(4.0, solution.power(2.0, 2));
        assertEquals(8.0, solution.power(2.0, 3));
        assertEquals(16.0, solution.power(2.0, 4));
        assertEquals(32.0, solution.power(2.0, 5));
        assertEquals(64.0, solution.power(2.0, 6));
        assertEquals(128.0, solution.power(2.0, 7));
        assertEquals(256.0, solution.power(2.0, 8));
        assertEquals(512.0, solution.power(2.0, 9));
    }
}

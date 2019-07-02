package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by qzou.
 * DateTime: 2019-07-02 23:57
 *
 * @author qzou
 */
public class RectCoverTest extends TestCase {
    private RectCover solution = new RectCover();

    public RectCoverTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(RectCoverTest.class);
    }

    public void testMinus() {
        for (int i = -4; i < 0; i++) {
            assertEquals(-1, solution.cover(i));
        }
    }

    public void testZero() {
        assertEquals(0, solution.cover(0));
    }

    public void testOne() {
        assertEquals(1, solution.cover(1));
    }

    public void testNormal() {
        assertEquals(2, solution.cover(2));
        assertEquals(3, solution.cover(3));
        assertEquals(5, solution.cover(4));
        assertEquals(8, solution.cover(5));
    }
}

package com.zsun.java.nowcoder.jianzhioffer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by qzou.
 * DateTime: 2019-07-02 23:57
 *
 * @author qzou
 */
public class RectCoverTest {
    private RectCover solution = new RectCover();

    @Test
    public void testMinus() {
        for (int i = -4; i < 0; i++) {
            assertEquals(-1, solution.cover(i));
        }
    }

    @Test
    public void testZero() {
        assertEquals(0, solution.cover(0));
    }

    @Test
    public void testOne() {
        assertEquals(1, solution.cover(1));
    }

    @Test
    public void testNormal() {
        assertEquals(2, solution.cover(2));
        assertEquals(3, solution.cover(3));
        assertEquals(5, solution.cover(4));
        assertEquals(8, solution.cover(5));
    }
}

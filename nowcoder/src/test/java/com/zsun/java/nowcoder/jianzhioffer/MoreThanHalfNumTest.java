package com.zsun.java.nowcoder.jianzhioffer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by zsun.
 * DateTime: 2019/07/03 21:22
 *
 * @author zsun
 */
public class MoreThanHalfNumTest {
    private MoreThanHalfNum solution = new MoreThanHalfNum();

    @Test
    public void testEmpty() {
        assertEquals(0, solution.findMoreThanHalfNum(null));
        assertEquals(0, solution.findMoreThanHalfNum(new int[]{}));
    }

    @Test
    public void testOneElement() {
        assertEquals(1, solution.findMoreThanHalfNum(new int[]{1}));
    }

    @Test
    public void testNormal() {
        assertEquals(0, solution.findMoreThanHalfNum(
            new int[]{5, 5, 5, 5, 1, 2, 3, 4}
        ));
        assertEquals(5, solution.findMoreThanHalfNum(
            new int[]{5, 1, 5, 2, 5, 3, 5, 4, 5}
        ));
        assertEquals(0, solution.findMoreThanHalfNum(
            new int[]{5, 1, 5, 2, 5, 3, 6, 4}
        ));
    }
}

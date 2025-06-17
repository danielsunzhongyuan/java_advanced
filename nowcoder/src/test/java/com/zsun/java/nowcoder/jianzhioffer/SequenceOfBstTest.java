package com.zsun.java.nowcoder.jianzhioffer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by zsun.
 * DateTime: 2019/05/21 13:15
 *
 * @author zsun
 */
public class SequenceOfBstTest {
    private SequenceOfBst solution = new SequenceOfBst();

    @Test
    public void testEmpty() {
        assertFalse(solution.verify(null));
        assertFalse(solution.verify(new int[]{}));
    }

    @Test
    public void testOneElement() {
        assertTrue(solution.verify(new int[]{1}));
    }

    @Test
    public void testTwoElements() {
        assertTrue(solution.verify(new int[]{1, 2}));
    }

    @Test
    public void testNormal() {
        assertTrue(solution.verify(new int[]{4, 8, 6, 12, 16, 14, 10}));
        assertTrue(solution.verify(new int[]{1, 2, 3, 4, 5}));
        assertTrue(solution.verify(new int[]{5, 4, 3, 2, 1}));

        assertFalse(solution.verify(new int[]{4, 8, 6, 12, 9, 14, 10}));
    }
}

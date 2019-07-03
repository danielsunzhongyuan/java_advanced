package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/05/21 13:15
 *
 * @author zsun
 */
public class SequenceOfBstTest extends TestCase {
    private SequenceOfBst solution = new SequenceOfBst();

    public SequenceOfBstTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(SequenceOfBstTest.class);
    }

    public void testEmpty() {
        assertFalse(solution.verify(null));
        assertFalse(solution.verify(new int[]{}));
    }

    public void testOneElement() {
        assertTrue(solution.verify(new int[]{1}));
    }

    public void testTwoElements() {
        assertTrue(solution.verify(new int[]{1, 2}));
    }

    public void testNormal() {
        assertTrue(solution.verify(new int[]{4, 8, 6, 12, 16, 14, 10}));
        assertTrue(solution.verify(new int[]{1, 2, 3, 4, 5}));
        assertTrue(solution.verify(new int[]{5, 4, 3, 2, 1}));

        assertFalse(solution.verify(new int[]{4, 8, 6, 12, 9, 14, 10}));
    }
}

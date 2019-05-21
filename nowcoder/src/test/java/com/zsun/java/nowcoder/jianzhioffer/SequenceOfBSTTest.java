package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/05/21 13:15
 */
public class SequenceOfBSTTest extends TestCase {
    private SequenceOfBST solution = new SequenceOfBST();

    public SequenceOfBSTTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(SequenceOfBSTTest.class);
    }

    public void testVerifyPostOrderNull() {
        assertFalse(solution.VerifyPostOrderTraversalOfBST(new int[]{}));
    }

    public void testVerifyPostOrderOneElement() {
        assertTrue(solution.VerifyPostOrderTraversalOfBST(new int[]{1}));
    }

    public void testVerifyPostOrderTwoElements() {
        assertTrue(solution.VerifyPostOrderTraversalOfBST(new int[]{1, 2}));
    }

    public void testVerifyPostOrder() {
        assertTrue(solution.VerifyPostOrderTraversalOfBST(new int[]{4, 8, 6, 12, 16, 14, 10}));
    }
}

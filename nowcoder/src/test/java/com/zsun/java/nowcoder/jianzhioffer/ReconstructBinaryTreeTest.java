package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/05/21 10:13
 */
public class ReconstructBinaryTreeTest extends TestCase {
    private ReconstructBinaryTree solution = new ReconstructBinaryTree();

    public ReconstructBinaryTreeTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(ReconstructBinaryTreeTest.class);
    }

    public void testOneNode() {
        TreeNode root = solution.reConstruct(new int[]{1}, new int[]{1});
        assertEquals(1, root.getValue());
    }

    public void testNullNode() {
        TreeNode root = solution.reConstruct(new int[]{}, new int[]{});
        assertNull(root);
    }

    public void testNormal() {
        int[] pre = new int[]{1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = new int[]{4, 7, 2, 1, 5, 3, 8, 6};
        TreeNode root = solution.reConstruct(pre, in);
        assertEquals(1, root.getValue());
        assertEquals(2, root.left.getValue());
        assertEquals(4, root.left.left.getValue());
        assertEquals(7, root.left.left.right.getValue());
        assertEquals(3, root.right.getValue());
        assertEquals(5, root.right.left.getValue());
        assertEquals(6, root.right.right.getValue());
        assertEquals(8, root.right.right.left.getValue());
    }
}

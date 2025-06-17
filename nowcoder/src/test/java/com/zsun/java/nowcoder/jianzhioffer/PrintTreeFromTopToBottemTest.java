package com.zsun.java.nowcoder.jianzhioffer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PrintTreeFromTopToBottemTest {
    private PrintTreeFromTopToBottem solution = new PrintTreeFromTopToBottem();

    @Test
    public void testNull() {
        TreeNode root = null;
        assertArrayEquals(new Integer[]{}, solution.print(root).toArray());
    }

    @Test
    public void testNormal() {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;

        assertArrayEquals(new Integer[]{1, 2, 3}, solution.print(root).toArray());
    }
}

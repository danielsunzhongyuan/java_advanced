package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

public class PrintTreeFromTopToBottemTest extends TestCase {
    private PrintTreeFromTopToBottem solution = new PrintTreeFromTopToBottem();

    public PrintTreeFromTopToBottemTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(PrintTreeFromTopToBottemTest.class);
    }

    public void testNull() {
        TreeNode root = null;
        Assert.assertArrayEquals(new Integer[]{}, solution.print(root).toArray());
    }

    public void testNormal() {
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        root.left = left;
        root.right = right;

        Assert.assertArrayEquals(new Integer[]{1, 2, 3}, solution.print(root).toArray());
    }
}

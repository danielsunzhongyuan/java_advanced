package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

import java.util.ArrayList;

/**
 * Created by qzou.
 * DateTime: 2019-06-26 23:01
 *
 * @author qzou
 */
public class PathInTreeTest extends TestCase {
    private PathInTree solution = new PathInTree();

    public PathInTreeTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(PathInTreeTest.class);
    }

    public void testNull() {
        assertEquals(0, solution.findPath(null, 0).size());
    }

    public void testSingleNode() {
        TreeNode root = new TreeNode(1);

        ArrayList<ArrayList<Integer>> result = solution.findPath(root, 1);
        Assert.assertArrayEquals(new Integer[]{1}, result.get(0).toArray());
//
        result = solution.findPath(root, 5);
        Assert.assertArrayEquals(new Integer[]{}, result.toArray());
    }

    public void testThreeNodes() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        ArrayList<ArrayList<Integer>> result = solution.findPath(root, 3);
        Assert.assertArrayEquals(new Integer[]{1, 2}, result.get(0).toArray());
        assertEquals("one path in total", 1, result.size());

        result = solution.findPath(root, 4);
        Assert.assertArrayEquals(new Integer[]{1, 3}, result.get(0).toArray());

        result = solution.findPath(root, 5);
        Assert.assertArrayEquals(new Integer[]{}, result.toArray());
    }
}

package com.zsun.java.nowcoder.jianzhioffer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by qzou.
 * DateTime: 2019-06-26 23:01
 *
 * @author qzou
 */
public class PathInTreeTest {
    private PathInTree solution = new PathInTree();

    @Test
    public void testNull() {
        assertEquals(0, solution.findPath(null, 0).size());
    }

    @Test
    public void testSingleNode() {
        TreeNode root = new TreeNode(1);

        ArrayList<ArrayList<Integer>> result = solution.findPath(root, 1);
        assertArrayEquals(new Integer[]{1}, result.get(0).toArray());

        result = solution.findPath(root, 5);
        assertArrayEquals(new Integer[]{}, result.toArray());
    }

    @Test
    public void testThreeNodes() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        ArrayList<ArrayList<Integer>> result = solution.findPath(root, 3);
        assertArrayEquals(new Integer[]{1, 2}, result.get(0).toArray());
        assertEquals(1, result.size());

        result = solution.findPath(root, 4);
        assertArrayEquals(new Integer[]{1, 3}, result.get(0).toArray());

        result = solution.findPath(root, 5);
        assertArrayEquals(new Integer[]{}, result.toArray());
    }
}

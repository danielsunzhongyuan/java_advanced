package com.zsun.java.algorithms.structures;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by qzou at 2020-01-08 00:46
 *
 * @author qzou
 */
public class TreeNode {
    private int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

    public static List<Integer> preorderTraversalInRecursive(TreeNode root) {
        List<Integer> results = new ArrayList<>();
        if (root == null) {
            return results;
        }
        results.add(root.getValue());
        results.addAll(preorderTraversalInRecursive(root.left));
        results.addAll(preorderTraversalInRecursive(root.right));
        return results;
    }

    public int getValue() {
        return value;
    }
}

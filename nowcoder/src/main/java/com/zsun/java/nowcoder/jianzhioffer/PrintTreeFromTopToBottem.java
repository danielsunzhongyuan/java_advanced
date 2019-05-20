package com.zsun.java.nowcoder.jianzhioffer;

import java.util.ArrayList;
import java.util.LinkedList;

public class PrintTreeFromTopToBottem {
    public ArrayList<Integer> print(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        queue.add(root);
        TreeNode tmp = null;
        while (!queue.isEmpty()) {
            tmp = queue.pop();
            results.add(tmp.val);
            if (tmp.left != null) {
                queue.add(tmp.left);
            }
            if (tmp.right != null) {
                queue.add(tmp.right);
            }
        }
        return results;
    }
}

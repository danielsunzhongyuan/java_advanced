package com.zsun.java.nowcoder.jianzhioffer;

import java.util.ArrayList;

/**
 * Created by zsun.
 * DateTime: 2019/05/22 21:48
 *
 * @author zsun
 */
public class PathInTree {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        ArrayList<Integer> currentPath = new ArrayList<>();
        helper(results, currentPath, root, target);
        return results;
    }

    private void helper(ArrayList<ArrayList<Integer>> results, ArrayList<Integer> currentPath, TreeNode node, int currentTarget) {
        if (node == null) {
            return;
        }
        currentPath.add(node.getValue());
        // 必须是从根结点到叶子节点，所以要加上后面俩判断条件
        if (currentTarget == node.getValue() && node.left == null && node.right == null) {
            results.add((ArrayList<Integer>) currentPath.clone());
        }
        helper(results, (ArrayList<Integer>) currentPath.clone(), node.left, currentTarget - node.getValue());
        helper(results, (ArrayList<Integer>) currentPath.clone(), node.right, currentTarget - node.getValue());
    }
}

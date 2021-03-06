package com.zsun.java.nowcoder.jianzhioffer;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 17:13
 */
public class ReconstructBinaryTree {
    public TreeNode reConstruct(int[] pre, int[] in) {
        return helper(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    private TreeNode helper(int[] pre, int preI, int preJ, int[] in, int inI, int inJ) {
        if (preI == preJ || inI == inJ) {
            return new TreeNode(pre[preI]);
        } else if (preI > preJ || inI > inJ
            || preJ >= pre.length || inJ >= in.length
            || preI < 0 || inI < 0) {
            return null;
        }
        TreeNode node = new TreeNode(pre[preI]);

        int index = indexOf(in, inI, inJ, pre[preI]);
        if (index < 0) {
            return null;
        }

        node.left = helper(pre, preI + 1, preI + (index - inI), in, inI, index - 1);
        node.right = helper(pre, preI + (index - inI) + 1, preJ, in, index + 1, inJ);
        return node;
    }

    private int indexOf(int[] arr, int i, int j, int target) {
        for (int k = i; k <= j; k++) {
            if (arr[k] == target) {
                return k;
            }
        }
        return -1;
    }
}

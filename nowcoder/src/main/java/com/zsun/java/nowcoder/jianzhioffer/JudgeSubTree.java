package com.zsun.java.nowcoder.jianzhioffer;

/**
 * @author : zsun
 * @date : 2020/08/13 21:15
 */
public class JudgeSubTree {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null) {
            return false;
        }
        if (root2 == null) {
            return false;
        }
        if (equals(root1, root2)) {
            return true;
        }
        return HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

    private boolean equals(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.getValue() != root2.getValue()) {
            return false;
        }

        return equals(root1.left, root2.left) && equals(root1.right, root2.right);
    }
}

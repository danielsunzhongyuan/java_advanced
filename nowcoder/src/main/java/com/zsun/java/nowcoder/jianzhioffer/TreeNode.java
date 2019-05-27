package com.zsun.java.nowcoder.jianzhioffer;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 23:22
 */
public class TreeNode {
    private int value;

    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
            "val=" + getValue() +
            ", left=" + left +
            ", right=" + right +
            '}';
    }
}

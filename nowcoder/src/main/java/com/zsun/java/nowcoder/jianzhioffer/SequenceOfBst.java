package com.zsun.java.nowcoder.jianzhioffer;

/**
 * Created by zsun.
 * DateTime: 2019/05/21 13:14
 * 判断一个数组是不是BST的后序遍历
 *
 * @author zsun
 */
public class SequenceOfBst {
    public boolean verify(int[] sequence) {
        if (null == sequence) {
            return false;
        }
        int length = sequence.length;
        return helper(sequence, 0, length - 1);
    }

    private boolean helper(int[] sequence, int i, int j) {
        if (sequence == null || i < 0 || j >= sequence.length) {
            return false;
        }
        if (i > j) {
            return false;
        }
        if (j - i <= 1) {
            return true;
        }
        int index = findIndex(sequence, i, j - 1, sequence[j]);
        if (index == -2) {
            return false;
        } else if (index == i - 1 || index == j - 1) {
            return helper(sequence, i, j - 1);
        } else {
            return helper(sequence, i, index) && helper(sequence, index + 1, j - 1);
        }
    }

    /**
     * 找到一个节点，该节点及其左边的数都比target小，右边的数都比target大
     * 返回该节点的index
     * 如果找不到，返回-2
     *
     * @param array  待查找的数组
     * @param start  查找的起始位置
     * @param end    查找的终止位置
     * @param target 查找的目标
     * @return 要查找的坐标
     */
    private int findIndex(int[] array, int start, int end, int target) {
        // 首先找到最后一个比target小的index
        int result;
        for (result = start; result <= end; result++) {
            if (array[result] >= target) {
                break;
            }
        }
        result--;

        // 然后验证result之后的是不是都比target大
        for (int i = result + 1; i <= end; i++) {
            if (array[i] <= target) {
                return -2;
            }
        }
        return result;
    }
}

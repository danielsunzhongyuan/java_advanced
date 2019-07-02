package com.zsun.java.nowcoder.jianzhioffer;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 09:22
 *
 * @author zsun
 */
public class FindInTwoDimensionArray {
    public boolean find(int target, int[][] array) {
        if (array == null) {
            return false;
        }
        int m = array.length;
        if (m < 1) {
            return false;
        }

        int n = array[0].length;
        return n >= 1 && helper(target, array, 0, m - 1, 0, n - 1);
    }

    private boolean helper(int target, int[][] array, int mi, int mj, int ni, int nj) {
        if (mi > mj || ni > nj) {
            return false;
        }

        if (mi == mj && ni == nj) {
            return array[mi][ni] == target;
        }

        int mMid = (mi + mj) >> 1;
        int nMid = (ni + nj) >> 1;

        if (array[mMid][nMid] == target) {
            return true;
        } else if (array[mMid][nMid] > target) {
            return helper(target, array, mMid + 1, mj, ni, nj - 1)
                || helper(target, array, mi, mj - 1, nMid + 1, nj)
                || helper(target, array, mi, mMid, ni, nMid);
        } else {
            return helper(target, array, mMid + 1, mj, ni, nj)
                || helper(target, array, mi, mj, nMid + 1, nj)
                || helper(target, array, mMid + 1, mj, nMid + 1, nj);
        }
    }
}

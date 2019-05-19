package com.zsun.java.nowcoder.jianzhioffer;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 09:22
 */
public class FindIn2DArray {
    public boolean Find(int target, int[][] array) {
        if (array == null) {
            return false;
        }
        int m = array.length;
        if (m < 1) {
            return false;
        }

        int n = array[0].length;
        if (n < 1) {
            return false;
        }
        return Helper(target, array, 0, m - 1, 0, n - 1);
    }

    private boolean Helper(int target, int[][] array, int mi, int mj, int ni, int nj) {
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
            return Helper(target, array, mi, mMid, ni, nMid);
        } else {
            return Helper(target, array, mMid + 1, mj, ni, nj)
                || Helper(target, array, mi, mj, nMid + 1, nj)
                || Helper(target, array, mMid + 1, mj, nMid + 1, nj);
        }
    }
}

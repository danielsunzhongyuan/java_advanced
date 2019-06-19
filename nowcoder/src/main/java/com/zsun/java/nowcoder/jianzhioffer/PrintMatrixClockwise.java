package com.zsun.java.nowcoder.jianzhioffer;

import java.util.ArrayList;

/**
 * Created by zsun.
 * DateTime: 2019/05/20 20:18
 *
 * @author zsun
 */
public class PrintMatrixClockwise {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> results = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return results;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        helper(results, matrix, 0, m - 1, 0, n - 1);
        return results;
    }

    private void helper(ArrayList<Integer> results, int[][] matrix, int mi, int mj, int ni, int nj) {
        if (mi > mj || ni > nj) {
            return;
        }
        // top
        for (int k = ni; k <= nj; k++) {
            results.add(matrix[mi][k]);
        }
        // right
        for (int k = mi + 1; k <= mj; k++) {
            results.add(matrix[k][nj]);
        }
        // bottem
        if (mi < mj) {
            for (int k = nj - 1; k >= ni; k--) {
                results.add(matrix[mj][k]);
            }
        }
        // left
        if (ni < nj) {
            for (int k = mj - 1; k > mi; k--) {
                results.add(matrix[k][ni]);
            }
        }

        helper(results, matrix, mi + 1, mj - 1, ni + 1, nj - 1);
    }
}

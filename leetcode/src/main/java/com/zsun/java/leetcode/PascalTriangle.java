package com.zsun.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsun.
 * DateTime: 2019/07/11 23:12
 *
 * @author zsun
 */
public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        if (numRows <= 0) {
            return new ArrayList<>();
        }
        ArrayList<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> tmp = new ArrayList<>(i + 1);
            for (int k = 0; k < i + 1; k++) {
                tmp.add(1);
            }
            for (int j = 1; j < i; j++) {
                tmp.set(j, result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
            }
            result.add(tmp);
        }
        return result;
    }

//    public List<Integer> getRow(int rowIndex) {
//        if (rowIndex < 0) {
//            return new ArrayList<>();
//        }
//        return null;
//    }
}

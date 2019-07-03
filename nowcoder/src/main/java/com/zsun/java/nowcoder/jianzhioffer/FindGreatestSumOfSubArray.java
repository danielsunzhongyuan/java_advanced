package com.zsun.java.nowcoder.jianzhioffer;

/**
 * Created by zsun.
 * DateTime: 2019/07/03 22:13
 *
 * @author zsun
 */
public class FindGreatestSumOfSubArray {
    public int find(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        //记录当前所有子数组的和的最大值
        int res = array[0];
        //包含array[i]的连续数组最大值
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            max = Math.max(max + array[i], array[i]);
            res = Math.max(max, res);
        }
        return res;
    }
}

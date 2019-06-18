package com.zsun.java.algorithms.sort;

import static com.zsun.java.utils.MathUtils.swap;

/**
 * Created by zsun.
 * DateTime: 2019/05/23 00:32
 *
 * @author zsun
 */
public class SelectSort implements Sort {
    @Override
    public void sort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(array, i, minIndex);
            }
        }
    }
}

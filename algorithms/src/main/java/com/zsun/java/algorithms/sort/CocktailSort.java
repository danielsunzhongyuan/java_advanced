package com.zsun.java.algorithms.sort;

import static com.zsun.java.utils.MathUtils.swap;

/**
 * Created by zsun.
 * DateTime: 2019/05/23 00:32
 *
 * @author zsun
 */
public class CocktailSort implements Sort {
    @Override
    public void sort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int length = array.length;
        int left = 0;
        int right = length - 1;
        while (left < right) {
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (array[i - 1] > array[i]) {
                    swap(array, i - 1, i);
                }
            }
            left++;
        }
    }
}

package com.zsun.java.algorithms.sort;

import java.util.Comparator;

import static com.zsun.java.utils.MathUtils.swap;

/**
 * Created by zsun.
 * DateTime: 2019/05/23 00:32
 *
 * @author zsun
 */
public class CocktailSort<T> implements Sort<T> {
    @Override
    public void sort(T[] array, Comparator<T> comparator) {
        if (array == null || array.length <= 1) {
            return;
        }
        int length = array.length;
        int left = 0;
        int right = length - 1;
        while (left < right) {
            for (int i = left; i < right; i++) {
                if (comparator.compare(array[i], array[i + 1]) > 0) {
                    swap(array, i, i + 1);
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (comparator.compare(array[i - 1], array[i]) > 0) {
                    swap(array, i - 1, i);
                }
            }
            left++;
        }
    }
}

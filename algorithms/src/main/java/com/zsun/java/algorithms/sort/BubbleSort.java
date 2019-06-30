package com.zsun.java.algorithms.sort;

import java.util.Comparator;

import static com.zsun.java.utils.MathUtils.swap;

/**
 * Created by zsun.
 * DateTime: 2019/05/23 00:32
 *
 * @author zsun
 */
public class BubbleSort<T> implements Sort<T> {
    @Override
    public void sort(T[] array, Comparator<T> comparator) {
        if (array == null || array.length <= 1) {
            return;
        }
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (comparator.compare(array[j], array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                }
            }
        }
    }
}

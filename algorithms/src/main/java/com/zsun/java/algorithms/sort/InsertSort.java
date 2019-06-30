package com.zsun.java.algorithms.sort;

import java.util.Comparator;

/**
 * Created by zsun.
 * DateTime: 2019/05/23 00:32
 *
 * @author zsun
 */
public class InsertSort<T> implements Sort<T> {
    @Override
    public void sort(T[] array, Comparator<T> comparator) {
        if (array == null || array.length <= 1) {
            return;
        }
        int length = array.length;
        T tmp;
        for (int i = 1; i < length; i++) {
            tmp = array[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (comparator.compare(array[j], tmp) > 0) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = tmp;
        }
    }
}

package com.zsun.java.algorithms.sort;

import java.util.Comparator;

/**
 * Created by zsun.
 * DateTime: 2019/06/02 20:57
 *
 * @author zsun
 */
public class InsertionSortDichotomySort<T> implements Sort<T> {
    @Override
    public void sort(T[] array, Comparator<T> comparator) {
        if (array == null || array.length <= 1) {
            return;
        }

        int length = array.length;
        for (int i = 1; i < length; i++) {
            T cur = array[i];
            int left = 0;
            int right = i - 1;
            while (left <= right) {
                int mid = (left + right) >> 1;
                if (comparator.compare(array[mid], cur) > 0) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            for (int j = i - 1; j >= left; j--) {
                array[j + 1] = array[j];
            }
            array[left] = cur;
        }
    }
}

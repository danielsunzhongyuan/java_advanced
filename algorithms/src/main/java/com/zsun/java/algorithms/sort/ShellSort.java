package com.zsun.java.algorithms.sort;

import java.util.Comparator;

/**
 * Created by zsun.
 * DateTime: 2019/06/13 20:18
 *
 * @author zsun
 */
public class ShellSort<T> implements Sort<T> {
    @Override
    public void sort(T[] array, Comparator<T> comparator) {
        if (array == null || array.length <= 1) {
            return;
        }
        int length = array.length;
        int h = 0;
        while (h < length) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < length; i += h) {
                int j = i - h;
                T cur = array[i];
                while (j >= 0 && comparator.compare(array[j], cur) > 0) {
                    array[j + h] = array[j];
                    j = j - h;
                }
                array[j + h] = cur;
            }
            h = (h - 1) / 3;
        }
    }
}

package com.zsun.java.algorithms.sort;

/**
 * Created by zsun.
 * DateTime: 2019/06/13 20:18
 *
 * @author zsun
 */
public class ShellSort implements Sort {
    @Override
    public void sort(int[] array) {
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
                int cur = array[i];
                while (j >= 0 && array[j] > cur) {
                    array[j + h] = array[j];
                    j = j - h;
                }
                array[j + h] = cur;
            }
            h = (h - 1) / 3;
        }
    }
}

package com.zsun.java.algorithms.sort;

/**
 * Created by zsun.
 * DateTime: 2019/05/23 00:32
 */
public class InsertSort {
    public void sort(int[] array) {
        int length = array.length;
        if (length <= 1) {
            return;
        }
        int tmp;
        for (int i = 1; i < length; i++) {
            tmp = array[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (array[j] > tmp) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = tmp;
        }
    }
}

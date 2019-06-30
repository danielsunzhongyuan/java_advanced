package com.zsun.java.algorithms.sort;

import java.util.Comparator;

/**
 * Created by zsun.
 * DateTime: 2019/06/18 19:33
 *
 * @author zsun
 */
public class MergeSortIteration<T> implements Sort<T> {
    @Override
    public void sort(T[] array, Comparator<T> comparator) {
        if (array == null || array.length <= 1) {
            return;
        }
        int length = array.length;
        int left;
        int mid;
        int right;
        for (int i = 1; i < length; i += i) {
            left = 0;
            // 首先mid必须要小于总长度，否则就不需要merge了，left:length-1 这一段在上次merge时已经排好序了
            while (left + i - 1 < length) {
                mid = left + i - 1;
                right = left + i * 2 - 1;

                // 然后right如果超出length，那么就用length-1，否则直接用right
                if (right >= length) {
                    merge(array, left, mid, length - 1, comparator);
                } else {
                    merge(array, left, mid, right, comparator);
                }

                left = right + 1;
            }
        }
    }

    private void merge(T[] array, int left, int mid, int right, Comparator<T> comparator) {
        int length = right - left + 1;
        Object[] tmp = new Object[length];
        int index = 0;
        int i = left;
        int j = mid + 1;
        while (i <= mid && j <= right) {
            if (comparator.compare(array[i], array[j]) < 0) {
                tmp[index++] = array[i++];
            } else {
                tmp[index++] = array[j++];
            }
        }
        while (i <= mid) {
            tmp[index++] = array[i++];
        }
        while (j <= right) {
            tmp[index++] = array[j++];
        }

        i = left;
        index = 0;
        while (index < length) {
            array[i++] = (T) tmp[index++];
        }
    }
}

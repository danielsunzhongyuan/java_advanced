package com.zsun.java.algorithms.sort;

import java.util.Comparator;

/**
 * Created by zsun.
 * DateTime: 2019/06/13 20:42
 *
 * @author zsun
 */
public class MergeSortRecursion<T> implements Sort<T> {
    @Override
    public void sort(T[] array, Comparator<T> comparator) {
        if (array == null || array.length <= 1) {
            return;
        }
        int length = array.length;
        sortRecursion(array, 0, length - 1, comparator);
    }

    private void sortRecursion(T[] array, int left, int right, Comparator<T> comparator) {
        if (left == right) {
            return;
        }

        int mid = (left + right) >> 1;
        sortRecursion(array, left, mid, comparator);
        sortRecursion(array, mid + 1, right, comparator);
        merge(array, left, mid, right, comparator);
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

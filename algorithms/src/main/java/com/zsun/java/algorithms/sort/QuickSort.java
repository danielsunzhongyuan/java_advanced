package com.zsun.java.algorithms.sort;

import java.util.Comparator;

import static com.zsun.java.utils.MathUtils.swap;

/**
 * Created by zsun.
 * DateTime: 2019/06/18 21:14
 *
 * @author zsun
 */
public class QuickSort<T> implements Sort<T> {
    @Override
    public void sort(T[] array, Comparator<T> comparator) {
        if (array == null || array.length <= 1) {
            return;
        }
        int length = array.length;
        quickSortRecursion(array, 0, length - 1, comparator);
    }

    private void quickSortRecursion(T[] array, int left, int right, Comparator<T> comparator) {
        if (left >= right) {
            return;
        }
        int pivotIndex = partition(array, left, right, comparator);
        quickSortRecursion(array, left, pivotIndex - 1, comparator);
        quickSortRecursion(array, pivotIndex + 1, right, comparator);
    }

    private int partition(T[] array, int left, int right, Comparator<T> comparator) {
        T pivot = array[right];
        int tail = left - 1;
        for (int i = left; i < right; i++) {
            if (comparator.compare(array[i], pivot) <= 0) {
                swap(array, ++tail, i);
            }
        }
        swap(array, tail + 1, right);
        return tail + 1;
    }
}

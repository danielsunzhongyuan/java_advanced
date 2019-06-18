package com.zsun.java.algorithms.sort;

import static com.zsun.java.utils.MathUtils.swap;

/**
 * Created by zsun.
 * DateTime: 2019/06/18 21:14
 *
 * @author zsun
 */
public class QuickSort implements Sort {
    @Override
    public void sort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int length = array.length;
        quickSortRecursion(array, 0, length - 1);
    }

    private void quickSortRecursion(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivotIndex = partition(array, left, right);
        quickSortRecursion(array, left, pivotIndex - 1);
        quickSortRecursion(array, pivotIndex + 1, right);
    }

    private int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int tail = left - 1;
        for (int i = left; i < right; i++) {
            if (array[i] <= pivot) {
                swap(array, ++tail, i);
            }
        }
        swap(array, tail + 1, right);
        return tail + 1;
    }
}

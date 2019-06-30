package com.zsun.java.algorithms.sort;

import java.util.Comparator;

import static com.zsun.java.utils.MathUtils.swap;

/**
 * Created by zsun.
 * DateTime: 2019/06/18 20:33
 *
 * @author zsun
 */
public class HeapSort<T> implements Sort<T> {
    @Override
    public void sort(T[] array, Comparator<T> comparator) {
        if (array == null || array.length <= 1) {
            return;
        }
        int length = array.length;
        int heapSize = BuildHeap(array, length, comparator);
        while (heapSize > 1) {
            swap(array, 0, --heapSize);
            heapify(array, 0, heapSize, comparator);
        }
    }

    private void heapify(T[] array, int i, int length, Comparator<T> comparator) {
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        int max = i;
        if (leftChild < length && comparator.compare(array[leftChild], array[max]) > 0) {
            max = leftChild;
        }
        if (rightChild < length && comparator.compare(array[rightChild], array[max]) > 0) {
            max = rightChild;
        }
        if (max != i) {
            swap(array, i, max);
            heapify(array, max, length, comparator);
        }
    }

    private int BuildHeap(T[] array, int length, Comparator<T> comparator) {
        for (int i = (length >> 1) - 1; i >= 0; i--) {
            heapify(array, i, length, comparator);
        }
        return length;
    }
}

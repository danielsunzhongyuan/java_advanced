package com.zsun.java.algorithms.sort;

import static com.zsun.java.utils.MathUtils.swap;

/**
 * Created by zsun.
 * DateTime: 2019/06/18 20:33
 *
 * @author zsun
 */
public class HeapSort implements Sort {
    @Override
    public void sort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int length = array.length;
        int heapSize = BuildHeap(array, length);
        while (heapSize > 1) {
            swap(array, 0, --heapSize);
            heapify(array, 0, heapSize);
        }
    }

    private void heapify(int[] array, int i, int length) {
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        int max = i;
        if (leftChild < length && array[leftChild] > array[max]) {
            max = leftChild;
        }
        if (rightChild < length && array[rightChild] > array[max]) {
            max = rightChild;
        }
        if (max != i) {
            swap(array, i, max);
            heapify(array, max, length);
        }
    }

    private int BuildHeap(int[] array, int length) {
        for (int i = (length >> 1) - 1; i >= 0; i--) {
            heapify(array, i, length);
        }
        return length;
    }
}

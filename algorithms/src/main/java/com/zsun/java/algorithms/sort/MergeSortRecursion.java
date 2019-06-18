package com.zsun.java.algorithms.sort;

/**
 * Created by zsun.
 * DateTime: 2019/06/13 20:42
 *
 * @author zsun
 */
public class MergeSortRecursion implements Sort {
    @Override
    public void sort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int length = array.length;
        SortRecursion(array, 0, length - 1);
    }

    private void SortRecursion(int[] array, int left, int right) {
        if (left == right) {
            return;
        }

        int mid = (left + right) >> 1;
        SortRecursion(array, left, mid);
        SortRecursion(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    public static void merge(int[] array, int left, int mid, int right) {
        int length = right - left + 1;
        int[] tmp = new int[length];
        int index = 0;
        int i = left;
        int j = mid + 1;
        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
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
            array[i++] = tmp[index++];
        }
    }
}

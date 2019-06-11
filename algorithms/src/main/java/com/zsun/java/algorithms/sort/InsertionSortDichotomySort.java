package com.zsun.java.algorithms.sort;

public class InsertionSortDichotomySort implements Sort {
    @Override
    public void sort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int length = array.length;
        for (int i = 1; i < length; i++) {
            int cur = array[i];
            int left = 0;
            int right = i - 1;
            while (left <= right) {
                int mid = (left + right) >> 1;
                if (array[mid] > cur) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            for (int j = i - 1; j >= left; j--) {
                array[j + 1] = array[j];
            }
            array[left] = cur;
        }
    }
}

package com.zsun.java.leetcode;

/**
 * Created by sunzhongyuan.
 * DateTime: 2019-07-21 19:15
 *
 * @author sunzhongyuan
 */
public class MedianSortedArray2 {
    public double find(int[] array1, int[] array2) {
        // 如果有一个数据是空，就返回正常一个数组的中位数
        if (isEmpty(array1)) {
            return median(array2);
        }
        if (isEmpty(array2)) {
            return median(array1);
        }

        int m = array1.length;
        int n = array2.length;
        int totalLength = m + n;
        int[] total = new int[totalLength];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (array1[i] <= array2[j]) {
                total[k++] = array1[i++];
            } else {
                total[k++] = array2[j++];
            }
        }
        while (i < m) {
            total[k++] = array1[i++];
        }
        while (j < n) {
            total[k++] = array2[j++];
        }

        return median(total);
    }

    private double median(int[] array) {
        if (isEmpty(array)) {
            return 0.0;
        }

        int length = array.length;
        if ((length & 1) == 0) {
            return ((double) array[length / 2 - 1] + (double) array[length / 2]) / 2.0;
        } else {
            return (double) array[length / 2];
        }
    }

    private boolean isEmpty(int[] array) {
        return array == null || array.length == 0;
    }
}

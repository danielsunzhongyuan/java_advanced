package com.zsun.java.algorithms.sort;

import java.util.Comparator;

/**
 * Created by qzou.
 * DateTime: 2019-06-22 20:25
 *
 * @author qzou
 */
public class RadixSort implements Sort<Integer> {
    private static final int DIGIT_NUMBER = 3;
    private static final int MAX = 10;
    private int[] radix = new int[DIGIT_NUMBER + 1];

    public RadixSort() {
        radix[0] = 1;
        for (int i = 1; i <= DIGIT_NUMBER; i++) {
            radix[i] = (int) Math.pow(10.0, (double) (i - 1));
        }
    }

    @Override
    public void sort(Integer[] array, Comparator<Integer> comparator) {
        if (array == null || array.length <= 1) {
            return;
        }
        int length = array.length;

        for (int d = 1; d <= DIGIT_NUMBER; d++) {
            countingSort(array, length, d);
        }
    }

    private void countingSort(Integer[] array, int n, int d) {
        int[] counting = new int[MAX];
        for (int i = 0; i < MAX; i++) {
            counting[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            counting[getDigit(array[i], d)]++;
        }

        for (int i = 1; i < MAX; i++) {
            counting[i] += counting[i - 1];
        }

        Integer[] tmp = new Integer[n];
        int digit;
        for (int i = n - 1; i >= 0; i--) {
            digit = getDigit(array[i], d);
            tmp[--counting[digit]] = array[i];
        }

        System.arraycopy(tmp, 0, array, 0, n);
    }

    /**
     * 获取元素x的第d位数字
     *
     * @param x
     * @param d
     * @return
     */
    private int getDigit(int x, int d) {
        return (x / radix[d]) % 10;
    }
}

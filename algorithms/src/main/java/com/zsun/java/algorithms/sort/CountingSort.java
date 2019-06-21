package com.zsun.java.algorithms.sort;

public class CountingSort implements Sort {
    private static final int BASE = 100;
    private int[] counter = new int[BASE];

    @Override
    public void sort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int length = array.length;

        for (int i = 0; i < length; i++) {
            counter[array[i]]++;
        }

        for (int i = 1; i < BASE; i++) {
            counter[i] += counter[i - 1];
        }

        int[] tmp = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            tmp[--counter[array[i]]] = array[i];
        }

        for (int i = 0; i < length; i++) {
            array[i] = tmp[i];
        }
    }
}

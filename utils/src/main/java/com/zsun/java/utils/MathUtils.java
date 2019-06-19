package com.zsun.java.utils;

/**
 * Created by zsun.
 * DateTime: 2019/06/18 21:10
 *
 * @author zsun
 */
public class MathUtils {
    private MathUtils() {
    }

    public static void swap(int[] array, int i, int j) {
        int length = array.length;
        if (length > 1 && i != j && i >= 0 && j >= 0 && i < length && j < length) {
            array[i] ^= array[j];
            array[j] ^= array[i];
            array[i] ^= array[j];
        }
    }
}

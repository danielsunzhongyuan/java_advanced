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
        if (i != j) {
            array[i] ^= array[j];
            array[j] ^= array[i];
            array[i] ^= array[j];
        }
    }
}

package com.zsun.java.utils;

import java.util.List;

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

    public static <T> void swap(List<T> array, int i, int j) {
        int length = array.size();
        if (length > 1 && i != j && i >= 0 && j >= 0 && i < length && j < length) {
            T tmp = array.get(i);
            array.set(i, array.get(j));
            array.set(j, tmp);
        }
    }

    public static <T> void swap(T[] array, int i, int j) {
        int length = array.length;
        if (length > 1 && i != j && i >= 0 && j >= 0 && i < length && j < length) {
            T tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }
}

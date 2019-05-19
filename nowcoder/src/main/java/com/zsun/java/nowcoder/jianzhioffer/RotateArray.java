package com.zsun.java.nowcoder.jianzhioffer;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 19:59
 */
public class RotateArray {
    public int minNumberInRotateArray(int[] array) {
        int length = array.length;
        if (length <= 0) {
            return 0;
        }
        int i = 0;
        int j = length - 1;
        while (i < j) {
            if (array[i] < array[j]) {
                return array[i];
            }
            int mid = (i + j) >> 1;
            if (mid == i) {
                return array[j];
            }
            if (array[mid] > array[i]) {
                i = mid + 1;
            } else if (array[mid] == array[i]) {
                i = mid;
            } else {
                j = mid;
            }
        }
        return array[j];
    }
}

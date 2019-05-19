package com.zsun.java.nowcoder.jianzhioffer;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 22:01
 */

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class ReOrderArray {
    /**
     * 20ms, 9304k
     */
    public void reOrderArray(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int length = array.length;
        int[] odds = new int[length];
        int[] evens = new int[length];
        int m = 0;
        int n = 0;
        int tmp;
        for (int i = 0; i < length; i++) {
            tmp = array[i];
            if (isOdd(tmp)) {
                odds[m++] = tmp;
            } else {
                evens[n++] = tmp;
            }
        }
        System.arraycopy(odds, 0, array, 0, m);
        System.arraycopy(evens, 0, array, m, n);
    }

    /**
     * 18ms, 9272K
     */
    public void reOrderArray2(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int length = array.length;
        int i = 0;
        int j = 0;
        int tmp;
        while (i < length) {
            while (i < length && isOdd(array[i])) {
                i++;
            }
            j = i + 1;
            while (j < length && !isOdd(array[j])) {
                j++;
            }
            if (j < length) {
                tmp = array[j];
                for (int k = j; k > i; k--) {
                    array[k] = array[k - 1];
                }
                array[i] = tmp;
            }
            i++;
        }
    }

    /**
     * 下面这个解法只能把奇偶分开，没法保证原先的相对顺序
     * 例如： 1 2 3 4 5 6 7 会变成 1 7 3 5 4 6 2
     * 但是，应该本题的要求是变成 1 3 5 7 2 4 6
     */
    public void reOrderArray3(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int length = array.length;
        int i = 0;
        int j = length - 1;
        int tmp;
        while (i < j) {
            while (i < j && isOdd(array[i])) {
                i++;
            }
            while (i < j && !isOdd(array[j])) {
                j--;
            }
            if (i < j) {
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }
            i++;
            j--;
        }
    }

    private boolean isOdd(int number) {
        return (number & 1) == 1;
    }
}

package com.zsun.java.nowcoder.jianzhioffer;

import java.util.ArrayList;
import java.util.Arrays;

import static com.zsun.java.utils.MathUtils.swap;

/**
 * Created by qzou.
 * DateTime: 2019-07-03 00:22
 *
 * @author qzou
 */
public class GetLeastKNumbers {
    public ArrayList<Integer> findKNumbers(int[] input, int k) {
        ArrayList<Integer> results = new ArrayList<>();
        if (input == null || input.length == 0) {
            return results;
        }
        int length = input.length;

        // 如果K比输入数组总长度还大，就返回空（题目的意思）
        if (length < k || k <= 0) {
//            int[] tmp = new int[length];
//            System.arraycopy(input, 0, tmp, 0, length);
//            Arrays.sort(tmp);
//            for (int i : tmp) {
//                results.add(i);
//            }
//            return results;
            return results;
        }

        int[] minKNumbers = new int[k];
        System.arraycopy(input, 0, minKNumbers, 0, k);
        buildHeap(minKNumbers, k);
        for (int i = k; i < length; i++) {
            if (input[i] < minKNumbers[0]) {
                minKNumbers[0] = input[i];
                heapify(minKNumbers, 0, k);
            }
        }

        // 排好序，然后加到结果里
        Arrays.sort(minKNumbers);
        for (int i : minKNumbers) {
            results.add(i);
        }
        return results;
    }

    private int buildHeap(int[] array, int length) {
        for (int i = (length >> 1) - 1; i >= 0; i--) {
            heapify(array, i, length);
        }
        return length;
    }

    private void heapify(int[] array, int i, int length) {
        int leftChild = 2 * i + 1;
        int rightChild = 2 * i + 2;
        int max = i;
        if (leftChild < length && array[leftChild] > array[max]) {
            max = leftChild;
        }
        if (rightChild < length && array[rightChild] > array[max]) {
            max = rightChild;
        }
        if (max != i) {
            swap(array, i, max);
            heapify(array, max, length);
        }
    }
}

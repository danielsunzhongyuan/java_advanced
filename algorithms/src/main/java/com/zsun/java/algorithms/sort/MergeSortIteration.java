package com.zsun.java.algorithms.sort;

/**
 * Created by zsun.
 * DateTime: 2019/06/18 19:33
 *
 * @author zsun
 */
public class MergeSortIteration implements Sort {
    @Override
    public void sort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
        int length = array.length;
        int left;
        int mid;
        int right;
        for (int i = 1; i < length; i += i) {
            left = 0;
            // 首先mid必须要小于总长度，否则就不需要merge了，left:length-1 这一段在上次merge时已经排好序了
            while (left + i - 1 < length) {
                mid = left + i - 1;
                right = left + i * 2 - 1;

                // 然后right如果超出length，那么就用length-1，否则直接用right
                if (right >= length) {
                    MergeSortRecursion.merge(array, left, mid, length - 1);
                } else {
                    MergeSortRecursion.merge(array, left, mid, right);
                }

                left = right + 1;
            }
        }
    }
}

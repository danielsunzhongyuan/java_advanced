package com.zsun.java.nowcoder.jianzhioffer;

/**
 * Created by sunzhongyuan.
 * DateTime: 2019/07/18 20:36
 *
 * @author sunzhongyuan
 */
public class GetNumberOfK {
    public int find(int[] array, int k) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int length = array.length;
        int left = 0;
        int right = length - 1;
        int firstIndex = -1;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (array[mid] == k) {
                firstIndex = mid;
                break;
            } else if (array[mid] < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (firstIndex == -1 || firstIndex >= length) {
            return 0;
        }

        int minIndex = firstIndex;
        int maxIndex = firstIndex;

        return maxIndex - minIndex + 1;
    }
}

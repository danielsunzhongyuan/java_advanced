package com.zsun.java.nowcoder.jianzhioffer;

/**
 * Created by zsun.
 * DateTime: 2019/07/03 21:19
 *
 * @author zsun
 */
public class MoreThanHalfNum {
    public int findMoreThanHalfNum(int[] array) {
        if (array == null || array.length <= 0) {
            return 0;
        }
        int length = array.length;
        if (length == 1) {
            return array[0];
        }
        int count = 1;
        int tmp = array[0];
        for (int i = 1; i < length; i++) {
            if (count == 0) {
                tmp = array[i];
                count = 1;
            } else {
                if (array[i] == tmp) {
                    count++;
                } else {
                    count--;
                }
            }
        }

        count = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] == tmp) {
                count++;
            }
        }

        return (count * 2 <= length) ? 0 : tmp;
    }
}

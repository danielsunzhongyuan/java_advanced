package com.zsun.java.algorithms.shuffle;

import java.util.Random;

/**
 * @author : zsun
 * @date : 2020/01/14 18:51
 */
public class SelectFromCurrent {
    public void shuffle(int[] arr) {
        int length = arr.length;
        if (length <= 0) {
            return;
        }
        Random random = new Random();
        int next = -1;
        for (int i = 0; i < length - 1; i++) {
            next = random.nextInt(length - i) + i;
            int tmp = arr[i];
            arr[i] = arr[next];
            arr[next] = tmp;
        }
    }
}

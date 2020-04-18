package com.zsun.java.algorithms.shuffle;

import java.util.Random;

/**
 * @author : zsun
 * @date : 2020/01/14 18:51
 */
public class SelectFromBeginning {
    /**
     * 这样乱序，结果并不是完全随机的
     */
    public void shuffle(int[] arr) {
        int length = arr.length;
        if (length <= 0) {
            return;
        }
        Random random = new Random();
        int next = -1;
        for (int i = 0; i < length; i++) {
            next = random.nextInt(length);
            int tmp = arr[i];
            arr[i] = arr[next];
            arr[next] = tmp;
        }
    }
}

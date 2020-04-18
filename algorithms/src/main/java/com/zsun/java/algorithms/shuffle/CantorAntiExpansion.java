package com.zsun.java.algorithms.shuffle;

import java.util.Random;

/**
 * @author : zsun
 * @date : 2020/01/14 18:53
 */
public class CantorAntiExpansion {
    public void shuffle(int[] arr) {
        int length = arr.length;
        if (length <= 0) {
            return;
        }
        int[] factorials = new int[length];
        factorials[0] = 1;
        for (int i = 1; i < length; i++) {
            factorials[i] = i * factorials[i - 1];
        }

        Random random = new Random();
        int cantorNumber = random.nextInt(factorials[length]);

    }
}

package com.zsun.java.tij.chapter4;

import java.util.Random;

public class ForEachFloat {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        float[] f = new float[10];
        for (int i = 0; i < 10; i++) {
            f[i] = random.nextFloat();
        }

        for (float x : f) {
            System.out.printf("%.2f\n", x);
        }
    }
}

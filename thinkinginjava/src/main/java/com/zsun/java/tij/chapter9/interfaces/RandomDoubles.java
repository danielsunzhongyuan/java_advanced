package com.zsun.java.tij.chapter9.interfaces;

import java.util.Random;

/**
 * Created by zsun.
 * DateTime: 2019/05/01 18:31
 */
public class RandomDoubles {
    private static Random rand = new Random(System.currentTimeMillis());

    public double next() {
        return rand.nextDouble();
    }

    public static void main(String[] args) {
        RandomDoubles rd = new RandomDoubles();
        for (int i = 0; i < 7; i++) {
            System.out.println(rd.next() + " ");
        }
    }
}

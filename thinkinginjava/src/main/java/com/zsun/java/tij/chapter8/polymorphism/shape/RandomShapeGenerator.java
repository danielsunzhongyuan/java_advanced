package com.zsun.java.tij.chapter8.polymorphism.shape;

import java.util.Random;

/**
 * Created by zsun.
 * DateTime: 2019/05/01 18:24
 */
public class RandomShapeGenerator {
    private Random random = new Random(System.currentTimeMillis());

    public Shape next() {
        switch (random.nextInt(3)) {
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
            default:
                return new Circle();
        }
    }
}

package com.zsun.java.tij.chapter8.polymorphism.shape;

/**
 * Created by zsun.
 * DateTime: 2019/05/01 18:26
 */
public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.print("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.print("Triangle.erase()");
    }

    @Override
    public void wheels() {
        System.out.print("Triangle.wheels()");
    }
}

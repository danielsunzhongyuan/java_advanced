package com.zsun.java.tij.chapter8.polymorphism.shape;

/**
 * Created by zsun.
 * DateTime: 2019/05/01 18:25
 */
public class Square extends Shape {
    @Override
    public void draw() {
        System.out.print("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.print("Square.erase()");
    }
}

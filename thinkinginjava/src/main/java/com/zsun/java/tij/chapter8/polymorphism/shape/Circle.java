package com.zsun.java.tij.chapter8.polymorphism.shape;

/**
 * Created by zsun.
 * DateTime: 2019/05/01 18:22
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.print("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.print("Circle.erase()");
    }
}

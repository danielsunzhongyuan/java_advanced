package com.zsun.java.tij.chapter8;

import com.zsun.java.tij.chapter8.polymorphism.shape.RandomShapeGenerator;
import com.zsun.java.tij.chapter8.polymorphism.shape.Shape;

/**
 * Created by zsun.
 * DateTime: 2019/05/01 17:51
 */
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] shapes = new Shape[9];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = gen.next();
        }

        for (Shape s : shapes) {
            s.draw();
            System.out.print("\t\t");
            s.wheels();
            System.out.print("\n");
        }
    }
}

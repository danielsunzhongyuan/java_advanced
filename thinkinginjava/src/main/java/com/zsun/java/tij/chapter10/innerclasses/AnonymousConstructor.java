package com.zsun.java.tij.chapter10.innerclasses;

/**
 * Created by zsun.
 * DateTime: 2019/05/05 16:03
 */

abstract class Base {
    public Base(int i) {
        System.out.println("Base constructor. i = " + i);
    }

    public abstract void f();
}
public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            { System.out.println("Inside instance initializer");}

            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}

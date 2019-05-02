package com.zsun.java.tij.chapter7;

/**
 * Created by zsun.
 * DateTime: 2019/05/01 17:45
 */
public class PracticeFive {
    public static void main(String[] args) {
        C c = new C();
    }
}

class A {
    A() {
        System.out.println("A constructor");
    }

    A(int i) {
        System.out.println("A constructor:" + i);
    }
}

class B {
    B() {
        System.out.println("B constructor");
    }

    B(int i) {
        System.out.println("B constructor:" + i);
    }
}

class C extends A {
    private B b = new B();
}

package com.zsun.java.tij.chapter10.innerclasses;

/**
 * Created by zsun.
 * DateTime: 2019/05/06 19:39
 */
public class MultiInterfaces {
    static void takesA(A a) {
    }

    static void takesB(B a) {
    }

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesA(y);
        takesB(x);
        takesB(y.makeB());
    }
}

interface A {
}

interface B {
}

class X implements A, B {
}

class Y implements A {
    B makeB() {
        return new B() {
        };
    }
}

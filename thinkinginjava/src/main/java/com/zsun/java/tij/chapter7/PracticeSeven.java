package com.zsun.java.tij.chapter7;

/**
 * Created by zsun.
 * DateTime: 2019/05/01 17:49
 */
public class PracticeSeven {
    public static void main(String[] args) {
        D d = new D();
    }
}

class D extends A {
    private B b = new B(2);

    D() {
        super(1);
    }
}

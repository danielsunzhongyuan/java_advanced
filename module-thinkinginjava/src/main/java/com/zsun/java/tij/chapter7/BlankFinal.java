package com.zsun.java.tij.chapter7;

/**
 * Created by zsun.
 * DateTime: 2019/05/01 17:37
 */
public class BlankFinal {
    private final int i = 0;
    private final int j;
    private final Poppet p;

    public BlankFinal() {
        j = 1;
        p = new Poppet(1);
    }

    public BlankFinal(int x) {
        j = x;
        p = new Poppet(x);
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}

class Poppet {
    private int i;

    public Poppet(int i) {
        this.i = i;
    }
}

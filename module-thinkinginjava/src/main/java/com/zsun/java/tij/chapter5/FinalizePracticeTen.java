package com.zsun.java.tij.chapter5;

import java.util.concurrent.atomic.AtomicInteger;

public class FinalizePracticeTen {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Tank t = new Tank(Tank.STATUS.FULL);
        }
        System.gc();
    }
}

class Tank {
    STATUS status = STATUS.FULL;

    public static AtomicInteger a;

    public Tank(STATUS status) {
        this.status = status;
    }

    protected void finalize() {
//        System.out.println(a.addAndGet(1));
        if (STATUS.FULL.equals(status)) {
            System.out.println("finalize");
        }
    }

    enum STATUS {
        FULL,
        EMPTY,
    }
}

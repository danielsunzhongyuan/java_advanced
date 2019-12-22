package com.zsun.java.chapter4;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by qzou at 2019-12-22 19:46
 *
 * @author qzou
 */
public class TryLockTest {
    public static void main(String[] args) {
        final MyService3 service = new MyService3();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };

        Thread t1 = new Thread(runnable);
        t1.setName("A");
        Thread t2 = new Thread(runnable);
        t2.setName("B");
        t1.start();
        t2.start();
    }
}

class MyService3 {
    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        if (lock.tryLock()) {
            System.out.printf(Thread.currentThread().getName() + " gets the lock");
        } else {
            System.out.println(Thread.currentThread().getName() + " doesn't get the lock");
        }
    }
}

package com.zsun.java.chapter4;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by qzou at 2019-12-22 19:50
 *
 * @author qzou
 */
public class TryLockWithParameters {
    public static void main(String[] args) {
        final MyService4 service = new MyService4();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " invoke at " + System.currentTimeMillis());
                service.waitMethod();
            }
        };

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        t1.setName("A");
        t2.setName("B");
        t1.start();
        t2.start();
    }
}

class MyService4 {
    public ReentrantLock lock = new ReentrantLock();

    public void waitMethod() {
        try {
            if (lock.tryLock(3, TimeUnit.SECONDS)) {
                System.out.println("    " + Thread.currentThread().getName() + " get the lock at " + System.currentTimeMillis());
                Thread.sleep(10000);
            } else {
                System.out.println("    " + Thread.currentThread().getName() + " cannot get the lock. " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}
package com.zsun.java.chapter4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by qzou at 2019-12-22 19:24
 *
 * @author qzou
 */
public class LockInterruptibly {
    public static void main(String[] args) throws InterruptedException {
        final MyService2 service = new MyService2();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };

        Thread threadA = new Thread(runnable);
        threadA.setName("A");
        threadA.start();
        Thread.sleep(500);

        Thread threadB = new Thread(runnable);
        threadB.setName("B");
        threadB.start();

        threadB.interrupt();
        System.out.println("main end");
    }
}

class MyService2 {
    public ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod() {
        try {
            lock.lockInterruptibly();
            final long start = System.currentTimeMillis();
            System.out.println("lock begin by " + Thread.currentThread().getName() + " at " + start);
            for (int i = 0; i < Integer.MAX_VALUE / 10; i++) {
                String newString = new String();
                Math.random();
            }
            final long end = System.currentTimeMillis();
            System.out.println("lock end by " + Thread.currentThread().getName() + " at " + end);
            System.out.println("Spend " + (end - start) + " milliseconds");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}
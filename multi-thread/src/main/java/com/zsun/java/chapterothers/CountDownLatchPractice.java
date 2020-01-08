package com.zsun.java.chapterothers;

import java.util.concurrent.CountDownLatch;

/**
 * @author : zsun
 * @date : 2020/01/07 14:23
 */
public class CountDownLatchPractice {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(4);
        Worker first = new Worker(1000, latch, "worker-1");
        Worker second = new Worker(1000, latch, "worker-2");
        Worker third = new Worker(1000, latch, "worker-3");
        Worker fourth = new Worker(1000, latch, "worker-4");

        first.start();
        second.start();
        third.start();
        fourth.start();


        latch.await();
        System.out.println(Thread.currentThread().getName() + " has finished.");
    }
}

class Worker extends Thread {
    private int delay;
    private CountDownLatch latch;

    public Worker(int delay, CountDownLatch latch, String name) {
        super(name);
        this.delay = delay;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(delay);
            System.out.println(Thread.currentThread().getName() + " finished");
        } catch (InterruptedException e) {
            System.out.println(e);
        } finally {
            latch.countDown();
        }
        try {
            latch.await();
            System.out.println(Thread.currentThread().getName() + " is waiting others");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

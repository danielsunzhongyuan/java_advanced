package com.zsun.java.chapterothers;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @author : zsun
 * @date : 2020/01/07 14:45
 */
public class CyclicBarrierPractice {
    public static void main(String[] args) {
        int n = 4;
        // 选择一个线程执行最后这个 runnable
        CyclicBarrier barrier = new CyclicBarrier(n, new Runnable() {
            @Override
            public void run() {
                System.out.println("current thread: " + Thread.currentThread().getName());
            }
        });

        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                new Writer(barrier).start();
            } else {
                try {
                    // 最后一个线程 Writer 晚了5秒，这样其他的线程等了2秒之后就不等了。
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                new Writer(barrier).start();
            }
        }

        try {
            Thread.sleep(14000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("CyclicBarrier重用");
        for (int i = 0; i < n; i++) {
            new Writer(barrier).start();
        }
    }
}

class Writer extends Thread {
    private CyclicBarrier barrier;

    public Writer(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is writing ...");
        try {
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " is done, waiting others");
//            try {
//                barrier.await(2000, TimeUnit.MILLISECONDS);
//            } catch (TimeoutException e) {
//                e.printStackTrace();
//            }
            barrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println("all is done");
    }
}

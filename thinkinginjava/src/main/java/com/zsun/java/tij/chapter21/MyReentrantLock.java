package com.zsun.java.tij.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

/**
 * Created by zsun.
 * DateTime: 2019/07/08 10:07
 *
 * @author zsun
 */
public class MyReentrantLock {
    private int count = 0;
    private static final int TOTAL_INCREMENT = 8000;
    private ReentrantLock lock = new ReentrantLock();

    public void increment() {
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        simpleReentrantLock();

        System.out.println("#############");

        usagesOfLock();
    }

    private static void simpleReentrantLock() {
        MyReentrantLock myReentrantLock = new MyReentrantLock();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        IntStream.range(0, TOTAL_INCREMENT)
            .forEach(i -> executor.submit(myReentrantLock::increment));

        ExecutorServiceUtils.stop(executor);

        // 期望是8000，实际也是8000
        System.out.println(myReentrantLock.getCount());
    }

    private static void usagesOfLock() {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        ReentrantLock lock = new ReentrantLock();

        executor.submit(() -> {
            lock.lock();
            try {
                ExecutorServiceUtils.sleep(1);
            } finally {
                lock.unlock();
            }
        });

        executor.submit(() -> {
            ExecutorServiceUtils.sleep(2);
            System.out.println("Locked: " + lock.isLocked());
            System.out.println("Held by me: " + lock.isHeldByCurrentThread());
            boolean locked = lock.tryLock();
            System.out.println("Lock acquired: " + locked);
        });

        ExecutorServiceUtils.stop(executor);
    }
}

package com.zsun.java.tij.chapter21;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.StampedLock;

/**
 * Created by zsun.
 * DateTime: 2019/07/08 17:15
 *
 * @author zsun
 */
public class MyStampedLock {
    public static void main(String[] args) {
        simpleStampedLock();

        System.out.println("#######");

        optimisticStampedLock();
    }

    private static void simpleStampedLock() {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Map<String, String> map = new HashMap<>();

        StampedLock lock = new StampedLock();

        executor.submit(() -> {
            long stamp = lock.writeLock();
            System.out.println(stamp);
            try {
                ExecutorServiceUtils.sleep(3);
                map.put("foo", "bar");
            } finally {
                lock.unlockWrite(stamp);
            }
        });

        Runnable readTask = () -> {
            long stamp = lock.readLock();
            System.out.println(stamp);
            try {
                System.out.println(map.get("foo") + " " + Thread.currentThread().getName());
                ExecutorServiceUtils.sleep(3);
            } finally {
                lock.unlockRead(stamp);
            }
        };

        executor.submit(readTask);
        executor.submit(readTask);

        ExecutorServiceUtils.stop(executor);
    }

    private static void optimisticStampedLock() {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Map<String, String> map = new HashMap<>();

        StampedLock lock = new StampedLock();

        executor.submit(() -> {
            long stamp = lock.tryOptimisticRead();
            try {
                System.out.println("Optimistic Lock Valid: " + lock.validate(stamp));
                ExecutorServiceUtils.sleep(1);
                System.out.println("Optimistic Lock Valid: " + lock.validate(stamp));
                ExecutorServiceUtils.sleep(2);
                System.out.println("Optimistic Lock Valid: " + lock.validate(stamp));
            } finally {
                lock.unlock(stamp);
            }
        });

        executor.submit(() -> {
            long stamp = lock.writeLock();
            try {
                System.out.println("Write Lock acquired");
                ExecutorServiceUtils.sleep(2);
            } finally {
                lock.unlock(stamp);
                System.out.println("Write done");
            }
        });

        ExecutorServiceUtils.stop(executor);
    }
}

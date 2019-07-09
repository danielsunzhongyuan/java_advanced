package com.zsun.java.tij.chapter21;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.StampedLock;

/**
 * Created by zsun.
 * DateTime: 2019/07/08 17:15
 *
 * @author zsun
 */
public class MyStampedLock {
    public static void main(String[] args) {
//        simpleStampedLock();
//
//        System.out.println("#######");
//
//        optimisticStampedLock();
//
//        System.out.println("#######");

        tryConvertToWriteLock();
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

    private static void tryConvertToWriteLock() {
        AtomicInteger count = new AtomicInteger(0);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        StampedLock lock = new StampedLock();

        executor.submit(() -> {
            long stamp = lock.readLock();
            try {
                if (count.get() == 0) {
                    stamp = lock.tryConvertToWriteLock(stamp);
                    if (stamp == 0L) {
                        System.out.println("Could not convert to write lock");
                        stamp = lock.writeLock();
                    } else {
                        count.set(23);
                    }
                }
                System.out.println(count);
            } finally {
                lock.unlock(stamp);
            }
        });

        ExecutorServiceUtils.stop(executor);
    }
}

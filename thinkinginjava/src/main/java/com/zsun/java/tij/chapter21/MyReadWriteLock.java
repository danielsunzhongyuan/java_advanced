package com.zsun.java.tij.chapter21;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by zsun.
 * DateTime: 2019/07/08 16:49
 *
 * @author zsun
 */
public class MyReadWriteLock {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Map<String, String> map = new HashMap<>();

        ReadWriteLock lock = new ReentrantReadWriteLock();

        executor.submit(() -> {
            lock.writeLock().lock();
            try {
                ExecutorServiceUtils.sleep(3);
                map.put("foo", "bar");
            } finally {
                lock.writeLock().unlock();
            }
        });

        Runnable readTask = () -> {
            lock.readLock().lock();
            try {
                System.out.println(map.get("foo"));
                ExecutorServiceUtils.sleep(3);
            } finally {
                lock.readLock().unlock();
            }
        };

        executor.submit(readTask);
        executor.submit(readTask);

        executor.submit(() -> {
            lock.writeLock().lock();
            try {
                ExecutorServiceUtils.sleep(3);
                map.put("foo", "bbbb");
            } finally {
                lock.writeLock().unlock();
            }
        });

        executor.submit(readTask);

        ExecutorServiceUtils.stop(executor);
    }
}

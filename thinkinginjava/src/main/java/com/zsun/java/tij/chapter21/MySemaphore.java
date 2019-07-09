package com.zsun.java.tij.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * Created by zsun.
 * DateTime: 2019/07/09 11:06
 *
 * @author zsun
 */
public class MySemaphore {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        Semaphore semaphore = new Semaphore(5);
        Runnable longRunningTask = () -> {
            boolean permit = false;
            try {
                do {
                    permit = semaphore.tryAcquire(1, TimeUnit.SECONDS);
                    if (permit) {
                        System.out.println("Semaphore acquired");
                        ExecutorServiceUtils.sleep(5);
                    } else {
                        System.out.println("Could not acquire semaphore");
                    }
                } while (!permit);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            } finally {
                if (permit) {
                    semaphore.release();
                }
            }
        };

        IntStream.range(0, 10)
            .forEach(i -> executor.submit(longRunningTask));

        ExecutorServiceUtils.stop(executor);
    }
}

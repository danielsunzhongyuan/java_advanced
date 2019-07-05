package com.zsun.java.tij.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by zsun.
 * DateTime: 2019/07/05 17:10
 *
 * @author zsun
 */
public class MyExecutors {
    public static void main(String[] args) {
        simpleShutdown();

        System.out.println("\n####\n");

        gracefulShutdown();
    }

    private static void simpleShutdown() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
//            try {
//                Thread.sleep(1L);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println("Hello " + threadName);
        });

        // 多次执行 shutdown 也没事
        executor.shutdown();
        executor.shutdown();
        executor.shutdownNow();
        executor.shutdownNow();
    }

    private static void gracefulShutdown() {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> {
            String threadName = Thread.currentThread().getName();
            try {
                Thread.sleep(5001L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello " + threadName);
        });
        try {
            System.out.println("attempt to shudown executor");
            executor.shutdown();
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.err.println("tasks interrupted");
        } finally {
            if (!executor.isShutdown()) {
                System.err.println("cancel non-finished tasks");
            }
            executor.shutdownNow();
            System.out.println("shutdown finished");
        }
    }
}

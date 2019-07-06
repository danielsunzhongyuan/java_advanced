package com.zsun.java.tij.chapter21;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * Created by qzou.
 * DateTime: 2019-07-06 08:18
 *
 * @author qzou
 */
public class MyScheduledExecutors {
    public static void main(String[] args) {
        delayTask();
        System.out.println("#############");
        fixedRate();
        System.out.println("#############");
        fixedDelay();
    }

    private static void delayTask() {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        Runnable task = () -> {
            System.out.println("Scheduling delayTask: " + System.currentTimeMillis());
        };

        ScheduledFuture<?> future = executor.schedule(task, 3, TimeUnit.SECONDS);

        try {
            TimeUnit.MILLISECONDS.sleep(1337);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 任务是延时3秒，上面等了1.337秒，还剩1.663秒（不会这么精确，要少一点）
        long remainingDelay = future.getDelay(TimeUnit.MILLISECONDS);
        System.out.printf("Remaining Delay: %sms\n", remainingDelay);

        ExecutorServiceUtils.stop(executor);
    }

    private static void fixedRate() {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        Runnable task = () -> {
            System.out.println("Scheduling fixedRate: " + System.currentTimeMillis() + ", nanoTime: " + System.nanoTime());
        };

        int initialDelay = 0;
        int period = 1;
        executor.scheduleAtFixedRate(task, initialDelay, period, TimeUnit.SECONDS);

        ExecutorServiceUtils.sleep(20);
        ExecutorServiceUtils.stop(executor);
    }

    private static void fixedDelay() {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        Runnable task = () -> {
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Scheduling fixedDelay: " + System.currentTimeMillis() + ", nanoTime: " + System.nanoTime());
            } catch (Exception e) {
                System.err.println(e);
            }
        };

        executor.scheduleWithFixedDelay(task, 0, 1, TimeUnit.SECONDS);

        ExecutorServiceUtils.sleep(20);
        ExecutorServiceUtils.stop(executor);
    }
}

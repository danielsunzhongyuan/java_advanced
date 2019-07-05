package com.zsun.java.tij.chapter21;

import java.util.concurrent.TimeUnit;

/**
 * Created by zsun.
 * DateTime: 2019/07/05 16:46
 *
 * @author zsun
 */
public class SimpleThread {
    public static void main(String[] args) throws Exception {
        simpleRunAndThreadStart();
        longRunningTask();
    }

    private static void simpleRunAndThreadStart() {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        };

        task.run();

        try {
            Thread thread = new Thread(task);
            thread.start();

            System.out.println("Done!");
            thread.join();
            System.out.println("really done!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void longRunningTask() {
        Runnable task = () -> {
            try {
                String name = Thread.currentThread().getName();
                System.out.println("Foo " + name);
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Bar " + name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Thread thread = new Thread(task);
        thread.start();
    }
}

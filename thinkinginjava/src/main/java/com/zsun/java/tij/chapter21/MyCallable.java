package com.zsun.java.tij.chapter21;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by zsun.
 * DateTime: 2019/07/05 19:29
 *
 * @author zsun
 */
public class MyCallable {
    public static void main(String[] args) {
        simpleFuture();
        futureWithTimeout();
    }

    private static void simpleFuture() {
        Callable<Integer> task = () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                return 123;
            } catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(task);

        System.out.println("future done? " + future.isDone());
        try {
            Integer result = future.get();

            System.out.println("future done? " + future.isDone());
            System.out.println("result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            System.err.println(e);
        }

        executor.shutdown();
    }

    private static void futureWithTimeout() {
        Callable<Integer> task = () -> {
            try {
                TimeUnit.SECONDS.sleep(2);
                return 123;
            } catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        };

        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(task);

        System.out.println("future done? " + future.isDone());
        try {
            // 就是这里，加上了超时时间
            // 不过因为程序是停了2秒，这里只等待1秒，所以会报错
            Integer result = future.get(1, TimeUnit.SECONDS);

            System.out.println("future done? " + future.isDone());
            System.out.println("result: " + result);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            System.err.println(e);
            e.printStackTrace();
        }

        executor.shutdown();
    }
}

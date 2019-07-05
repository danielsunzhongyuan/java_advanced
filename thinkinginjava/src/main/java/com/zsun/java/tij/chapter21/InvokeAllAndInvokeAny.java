package com.zsun.java.tij.chapter21;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by zsun.
 * DateTime: 2019/07/05 20:32
 *
 * @author zsun
 */
public class InvokeAllAndInvokeAny {
    public static void main(String[] args) {
        executeInvokeAll();
        executeInvokeAny();
    }

    private static void executeInvokeAll() {
        ExecutorService executor = Executors.newWorkStealingPool();
        List<Callable<String>> callables = Arrays.asList(
            () -> "task1",
            () -> "task2",
            () -> "task3"
        );
        try {
            executor.invokeAll(callables)
                .stream()
                .map(future -> {
                    try {
                        return future.get();
                    } catch (Exception e) {
                        throw new IllegalStateException(e);
                    }
                })
                .forEach(System.out::println);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void executeInvokeAny() {
        ExecutorService executor = Executors.newWorkStealingPool();

        List<Callable<String>> callables = Arrays.asList(
            callable("task1", 2),
            callable("task2", 1),
            callable("task3", 3));

        try {
            String result = executor.invokeAny(callables);
            // task2 最先返回，所以打印 task2
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Callable<String> callable(String result, long sleepSeconds) {
        return () -> {
            TimeUnit.SECONDS.sleep(sleepSeconds);
            return result;
        };
    }
}

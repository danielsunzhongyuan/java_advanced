package com.zsun.java.tij.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * Created by zsun.
 * DateTime: 2019/07/09 20:39
 *
 * @author zsun
 */
public class MyAtomic {
    public static void main(String[] args) {
        myAtomicInteger();
    }

    private static void myAtomicInteger() {
        AtomicInteger atomicInteger = new AtomicInteger(0);

        ExecutorService executor = Executors.newFixedThreadPool(2);

        IntStream.range(0, 7000)
            .forEach(i -> executor.submit(atomicInteger::incrementAndGet));

        IntStream.range(0, 7000)
            .forEach(i -> {
                Runnable task = () -> {
                    atomicInteger.updateAndGet(n -> n + 2);
                };
                executor.submit(task);
            });

        // 这里是累加，相当于从 0 加到 6999
        IntStream.range(0, 7000)
            .forEach(i -> {
                Runnable task = () -> {
                    atomicInteger.accumulateAndGet(i, (n, m) -> n + m);
                };
                executor.submit(task);
            });
        ExecutorServiceUtils.stop(executor);

        System.out.println(atomicInteger.get());
    }
}

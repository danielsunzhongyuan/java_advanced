package com.zsun.java.tij.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.IntStream;

/**
 * Created by zsun.
 * DateTime: 2019/07/09 21:31
 *
 * @author zsun
 */
public class MyLongAdder {
    public static void main(String[] args) {
        LongAdder longAdder = new LongAdder();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        IntStream.range(0, 6000)
            .forEach(i -> {
                executor.submit(longAdder::increment);
            });
        ExecutorServiceUtils.stop(executor);

        // should be 6000
        System.out.println(longAdder.sumThenReset());
        // should be 0
        System.out.println(longAdder.sum());
    }
}

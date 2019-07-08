package com.zsun.java.tij.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * Created by zsun.
 * DateTime: 2019/07/06 11:03
 *
 * @author zsun
 */
public class BadIncrement {
    private int count = 0;

    public void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        BadIncrement badIncrement = new BadIncrement();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        IntStream.range(0, 10000)
            .forEach(i -> executor.submit(badIncrement::increment));

        ExecutorServiceUtils.stop(executor);

        // 期待是 10000，但是实际上比10000小，比如 9538。
        System.out.println(badIncrement.getCount());
    }
}

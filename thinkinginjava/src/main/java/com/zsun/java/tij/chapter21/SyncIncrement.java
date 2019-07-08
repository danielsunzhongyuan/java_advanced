package com.zsun.java.tij.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * Created by zsun.
 * DateTime: 2019/07/06 13:54
 *
 * @author zsun
 */
public class SyncIncrement {
    private int count = 0;
    private static final int TOTAL_INCREMENT = 9000;

    public synchronized void increment() {
        count = count + 1;
    }

    public void increment2() {
        synchronized (this) {
            count = count + 1;
        }
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        SyncIncrement syncIncrement = new SyncIncrement();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        IntStream.range(0, TOTAL_INCREMENT)
            .forEach(i -> executor.submit(syncIncrement::increment2));

        ExecutorServiceUtils.stop(executor);

        // 期望是 9000，实际也是9000
        System.out.println(syncIncrement.getCount());
    }
}

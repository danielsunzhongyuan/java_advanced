package com.zsun.java.tij.chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.function.LongBinaryOperator;
import java.util.stream.IntStream;

/**
 * Created by zsun.
 * DateTime: 2019/07/09 21:34
 *
 * @author zsun
 */
public class MyLongAccumulator {
    public static void main(String[] args) {
        LongBinaryOperator operator = (x, y) -> 2 * x + y;
        LongAccumulator accumulator = new LongAccumulator(operator, 1L);

        ExecutorService executor = Executors.newFixedThreadPool(2);

        IntStream.range(0, 10)
            .forEach(i -> executor.submit(() -> accumulator.accumulate(i)));

        ExecutorServiceUtils.stop(executor);

        // 2037 => (((((((((1*2+0)*2+1)*2+2)*2+3)*2+4)*2+5)*2+6)*2+7)*2+8)*2+9
        System.out.println(accumulator.getThenReset());
    }
}

package com.zsun.java.nowcoder.jianzhioffer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by zsun.
 * DateTime: 2019/06/19 11:48
 *
 * @author zsun
 */
public class FibonacciTest {
    private Fibonacci solution = new Fibonacci();

    @Test
    public void testNormal() {
        assertEquals(0, solution.fibonacci(0));
        assertEquals(1, solution.fibonacci(1));
        assertEquals(1, solution.fibonacci(2));
        assertEquals(2, solution.fibonacci(3));
        assertEquals(3, solution.fibonacci(4));
        assertEquals(5, solution.fibonacci(5));
        assertEquals(8, solution.fibonacci(6));
        assertEquals(13, solution.fibonacci(7));
        assertEquals(21, solution.fibonacci(8));
        assertEquals(34, solution.fibonacci(9));
        assertEquals(55, solution.fibonacci(10));
    }

    @Test
    public void testInvalid() {
        assertEquals(-1, solution.fibonacci(-1));
        assertEquals(-1, solution.fibonacci(-10));
    }
}

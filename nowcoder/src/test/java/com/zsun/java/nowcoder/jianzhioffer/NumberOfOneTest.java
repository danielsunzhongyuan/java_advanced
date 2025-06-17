package com.zsun.java.nowcoder.jianzhioffer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by zsun.
 * DateTime: 2019/05/21 10:07
 *
 * @author zsun
 */
public class NumberOfOneTest {
    private NumberOfOne solution = new NumberOfOne();

    @Test
    public void testZero() {
        assertEquals(0, solution.NumberOf1(0));
    }

    @Test
    public void testOne() {
        assertEquals(0, solution.NumberOf1(0));
    }

    @Test
    public void testMinusOne() {
        assertEquals(32, solution.NumberOf1(-1));
    }

    @Test
    public void testFive() {
        assertEquals(2, solution.NumberOf1(5));
    }
}

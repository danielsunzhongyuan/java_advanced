package com.zsun.java.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by zsun.
 * DateTime: 2019/07/11 23:27
 *
 * @author zsun
 */
public class PascalTriangleTest {
    private PascalTriangle solution = new PascalTriangle();

    @Test
    public void testEmpty() {
        assertEquals(0, solution.generate(-1).size());
        assertEquals(0, solution.generate(0).size());
    }

    @Test
    public void testOne() {
        assertEquals(1, solution.generate(1).get(0).get(0).intValue());
    }

    @Test
    public void testTwo() {
        assertEquals(1, solution.generate(2).get(0).get(0).intValue());
        assertEquals(1, solution.generate(2).get(1).get(0).intValue());
        assertEquals(1, solution.generate(2).get(1).get(1).intValue());
    }

    @Test
    public void testThree() {
        assertEquals(2, solution.generate(3).get(2).get(1).intValue());
    }
}

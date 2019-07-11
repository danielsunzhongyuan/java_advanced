package com.zsun.java.leetcode;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/07/11 23:27
 *
 * @author zsun
 */
public class PascalTriangleTest extends TestCase {
    private PascalTriangle solution = new PascalTriangle();

    public PascalTriangleTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(PascalTriangleTest.class);
    }

    public void testEmpty() {
        assertEquals(0, solution.generate(-1).size());
        assertEquals(0, solution.generate(0).size());
    }

    public void testOne() {
        assertEquals(1, solution.generate(1).get(0).get(0).intValue());
    }

    public void testTwo() {
        assertEquals(1, solution.generate(2).get(0).get(0).intValue());
        assertEquals(1, solution.generate(2).get(1).get(0).intValue());
        assertEquals(1, solution.generate(2).get(1).get(1).intValue());
    }

    public void testThree() {
        assertEquals(2, solution.generate(3).get(2).get(1).intValue());
    }
}

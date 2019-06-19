package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/05/21 10:07
 *
 * @author zsun
 */
public class NumberOfOneTest extends TestCase {
    private NumberOfOne solution = new NumberOfOne();

    public NumberOfOneTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(NumberOfOneTest.class);
    }

    public void testZero() {
        assertEquals(0, solution.NumberOf1(0));
    }

    public void testOne() {
        assertEquals(0, solution.NumberOf1(0));
    }

    public void testMinusOne() {
        assertEquals(32, solution.NumberOf1(-1));
    }

    public void testFive() {
        assertEquals(2, solution.NumberOf1(5));
    }
}

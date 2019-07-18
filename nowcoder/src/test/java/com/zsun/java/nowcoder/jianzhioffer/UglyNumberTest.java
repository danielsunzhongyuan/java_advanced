package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by sunzhongyuan.
 * DateTime: 2019/07/18 20:10
 *
 * @author sunzhongyuan
 */
public class UglyNumberTest extends TestCase {
    private UglyNumber solution = new UglyNumber();

    public UglyNumberTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(UglyNumberTest.class);
    }

    public void testInvalid() {
        for (int i = 0; i > -5; i--) {
            assertEquals(0, solution.findNthUglyNumber(i));
        }
    }

    public void testNormal() {
        int[] expected = new int[]{0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, 16, 18, 20, 24, 25};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], solution.findNthUglyNumber(i));
        }
    }
}

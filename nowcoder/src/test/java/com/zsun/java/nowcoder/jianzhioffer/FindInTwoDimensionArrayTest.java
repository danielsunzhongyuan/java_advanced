package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 09:23
 */
public class FindInTwoDimensionArrayTest extends TestCase {
    public FindInTwoDimensionArrayTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(FindInTwoDimensionArrayTest.class);
    }

    public void testFind() {
        int target = 10;
        int[][] array = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
        };
        assertTrue("should find 10 in array", new FindInTwoDimensionArray().find(target, array));
    }
}

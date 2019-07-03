package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/07/03 21:22
 *
 * @author zsun
 */
public class MoreThanHalfNumTest extends TestCase {
    private MoreThanHalfNum solution = new MoreThanHalfNum();

    public MoreThanHalfNumTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(MoreThanHalfNumTest.class);
    }

    public void testEmpty() {
        assertEquals(0, solution.findMoreThanHalfNum(null));
        assertEquals(0, solution.findMoreThanHalfNum(new int[]{}));
    }

    public void testOneElement() {
        assertEquals(1, solution.findMoreThanHalfNum(new int[]{1}));
    }

    public void testNormal() {
        assertEquals(0, solution.findMoreThanHalfNum(
            new int[]{5, 5, 5, 5, 1, 2, 3, 4}
        ));
        assertEquals(5, solution.findMoreThanHalfNum(
            new int[]{5, 1, 5, 2, 5, 3, 5, 4, 5}
        ));
        assertEquals(0, solution.findMoreThanHalfNum(
            new int[]{5, 1, 5, 2, 5, 3, 6, 4}
        ));
    }
}

package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/06/19 15:42
 *
 * @author zsun
 */
public class FirstCharExistingOnceTest extends TestCase {
    private FirstCharExistingOnce solution = new FirstCharExistingOnce();

    public FirstCharExistingOnceTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(FirstCharExistingOnceTest.class);
    }

    public void testInvalid() {
        assertEquals(-1, solution.firstNotRepeatingChar(""));

        assertEquals(-1, solution.firstNotRepeatingChar("abba"));
    }

    public void testNormal() {
        assertEquals(0, solution.firstNotRepeatingChar("abb"));

        assertEquals(1, solution.firstNotRepeatingChar("bab"));

        assertEquals(3, solution.firstNotRepeatingChar("babcad"));
    }
}

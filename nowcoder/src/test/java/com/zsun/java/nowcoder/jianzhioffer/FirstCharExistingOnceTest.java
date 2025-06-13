package com.zsun.java.nowcoder.jianzhioffer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by zsun.
 * DateTime: 2019/06/19 15:42
 *
 * @author zsun
 */
public class FirstCharExistingOnceTest {
    private FirstCharExistingOnce solution = new FirstCharExistingOnce();

    @Test
    public void testInvalid() {
        assertEquals(-1, solution.firstNotRepeatingChar(""));

        assertEquals(-1, solution.firstNotRepeatingChar("abba"));
    }

    @Test
    public void testNormal() {
        assertEquals(0, solution.firstNotRepeatingChar("abb"));

        assertEquals(1, solution.firstNotRepeatingChar("bab"));

        assertEquals(3, solution.firstNotRepeatingChar("babcad"));
    }
}

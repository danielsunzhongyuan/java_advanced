package com.zsun.java.nowcoder.jianzhioffer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by sunzhongyuan.
 * DateTime: 2019/07/18 20:10
 *
 * @author sunzhongyuan
 */
public class UglyNumberTest {
    private UglyNumber solution = new UglyNumber();

    @Test
    public void testInvalid() {
        for (int i = 0; i > -5; i--) {
            assertEquals(0, solution.findNthUglyNumber(i));
        }
    }

    @Test
    public void testNormal() {
        int[] expected = new int[]{0, 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, 16, 18, 20, 24, 25};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], solution.findNthUglyNumber(i));
        }
    }
}

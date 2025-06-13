package com.zsun.java.nowcoder.jianzhioffer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by zsun.
 * DateTime: 2019/06/19 15:48
 *
 * @author zsun
 */
public class RotateArrayTest {
    private RotateArray solution = new RotateArray();

    @Test
    public void testNormal() {
        assertEquals(1, solution.minNumberInRotateArray(new int[]{1}));

        assertEquals(1, solution.minNumberInRotateArray(new int[]{1, 2, 3}));

        assertEquals(1, solution.minNumberInRotateArray(new int[]{3, 1, 2}));

        assertEquals(1, solution.minNumberInRotateArray(new int[]{2, 3, 1}));
    }

    @Test
    public void testInvalid() {
        assertEquals(0, solution.minNumberInRotateArray(new int[]{}));
    }
}

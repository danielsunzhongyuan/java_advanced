package com.zsun.java.nowcoder.jianzhioffer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Created by qzou.
 * DateTime: 2019-07-03 00:49
 *
 * @author qzou
 */
public class GetLeastKNumbersTest {
    private GetLeastKNumbers solution = new GetLeastKNumbers();

    @Test
    public void testInvalid() {
        assertArrayEquals(new Integer[]{}, solution.findKNumbers(null, 0).toArray());
        assertArrayEquals(new Integer[]{}, solution.findKNumbers(new int[]{}, 0).toArray());
        int[] array = new int[]{4, 1, 3, 2};
        assertArrayEquals(new Integer[]{}, solution.findKNumbers(array, 0).toArray());
        assertArrayEquals(new Integer[]{}, solution.findKNumbers(array, 5).toArray());
    }

    @Test
    public void testNormal() {
        int[] array = new int[]{4, 1, 3, 2};
        assertArrayEquals(new Integer[]{1}, solution.findKNumbers(array, 1).toArray());
        assertArrayEquals(new Integer[]{1, 2}, solution.findKNumbers(array, 2).toArray());
        assertArrayEquals(new Integer[]{1, 2, 3}, solution.findKNumbers(array, 3).toArray());
        assertArrayEquals(new Integer[]{1, 2, 3, 4}, solution.findKNumbers(array, 4).toArray());
    }
}

package com.zsun.java.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by zsun.
 * DateTime: 2019/07/03 23:01
 *
 * @author zsun
 */
public class TwoSumTest {
    private TwoSum solution = new TwoSum();

    @Test
    void testEmpty() {
        Assertions.assertArrayEquals(new int[]{0, 0}, solution.find(null, 100));
        Assertions.assertArrayEquals(new int[]{0, 0}, solution.find(new int[]{}, 100));
        Assertions.assertArrayEquals(new int[]{0, 0}, solution.find(new int[]{1}, 100));
        Assertions.assertArrayEquals(new int[]{0, 0}, solution.find(new int[]{100}, 100));
    }

    @Test
    void testNormal() {
        Assertions.assertArrayEquals(new int[]{0, 0}, solution.find(new int[]{1, 2, 3}, 100));
        Assertions.assertArrayEquals(new int[]{0, 1}, solution.find(new int[]{5, 2, 9}, 7));
    }
}

package com.zsun.java.nowcoder.jianzhioffer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by zsun.
 * DateTime: 2019/06/19 14:17
 *
 * @author zsun
 */
public class IsPushOrderTest {
    private IsPushOrder solution = new IsPushOrder();

    @Test
    public void testNull() {
        assertEquals(true, solution.right(new int[]{}, new int[]{}));
    }

    @Test
    public void testTrue() {
        assertTrue(solution.right(new int[]{1}, new int[]{1}));

        assertTrue(solution.right(new int[]{1, 2, 3}, new int[]{3, 2, 1}));
    }

    @Test
    public void testFalse() {
        assertFalse(solution.right(new int[]{1}, new int[]{3}));

        assertFalse(solution.right(new int[]{1, 2, 3}, new int[]{3, 1, 2}));

        assertFalse(solution.right(new int[]{1, 2, 3}, new int[]{4, 1, 2}));

        assertFalse(solution.right(new int[]{1, 2, 3, 4, 5, 6}, new int[]{6, 1, 5, 2, 3, 4}));

        assertFalse(solution.right(new int[]{1, 2, 3}, new int[]{3, 1, 2}));

        assertFalse(solution.right(new int[]{1, 2, 3}, new int[]{3, 1, 2, 4}));
    }
}

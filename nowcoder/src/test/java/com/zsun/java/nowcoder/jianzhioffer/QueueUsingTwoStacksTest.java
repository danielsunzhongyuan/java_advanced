package com.zsun.java.nowcoder.jianzhioffer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by zsun.
 * DateTime: 2019/07/03 21:29
 *
 * @author zsun
 */
public class QueueUsingTwoStacksTest {
    private QueueUsingTwoStacks solution = new QueueUsingTwoStacks();

    @Test
    public void testNormal() {
        solution.push(1);
        solution.push(2);
        assertEquals(1, solution.pop());
        assertEquals(2, solution.pop());
        assertEquals(-1, solution.pop());
    }
}

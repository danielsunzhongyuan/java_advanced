package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/07/03 21:29
 *
 * @author zsun
 */
public class QueueUsingTwoStacksTest extends TestCase {
    private QueueUsingTwoStacks solution = new QueueUsingTwoStacks();

    public QueueUsingTwoStacksTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(QueueUsingTwoStacksTest.class);
    }

    public void testNormal() {
        solution.push(1);
        solution.push(2);
        assertEquals(1, solution.pop());
        assertEquals(2, solution.pop());
        assertEquals(-1, solution.pop());
    }
}

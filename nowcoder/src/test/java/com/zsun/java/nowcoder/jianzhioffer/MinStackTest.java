package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/05/21 10:56
 *
 * @author zsun
 */
public class MinStackTest extends TestCase {
    private MinStack minStack = new MinStack();

    public MinStackTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(MinStackTest.class);
    }

    public void testNull() {
        assertEquals(-1, minStack.top());
    }

    public void testPushOne() {
        minStack.push(1);
        assertEquals(1, minStack.min());

        // empty
        minStack.pop();
        assertEquals(-1, minStack.min());
        assertEquals(-1, minStack.top());

        // invalid pop
        minStack.pop();
        assertEquals(-1, minStack.min());
        assertEquals(-1, minStack.top());
    }

    public void testPushTwo() {
        minStack.push(2);
        assertEquals(2, minStack.top());
        assertEquals(2, minStack.min());
    }

    public void testPop() {
        minStack.push(1);
        minStack.push(2);
        minStack.push(4);
        minStack.push(0);
        assertEquals(0, minStack.min());
        minStack.pop();
        assertEquals(1, minStack.min());
        minStack.pop();
        assertEquals(1, minStack.min());
        assertNotNull(minStack.data);
    }
}

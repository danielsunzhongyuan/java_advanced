package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/06/21 20:18
 *
 * @author zsun
 */
public class RandomListNodeTest extends TestCase {
    public RandomListNodeTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(RandomListNodeTest.class);
    }

    public void testNull() {
        RandomListNode p1 = null;
        assertNull(RandomListNode.clone(p1));
    }

    public void testNormal() {
        RandomListNode p1 = new RandomListNode(1);
        RandomListNode p2 = new RandomListNode(2);
        RandomListNode p3 = new RandomListNode(3);
        RandomListNode p4 = new RandomListNode(4);
        RandomListNode p5 = new RandomListNode(5);

        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        p4.next = p5;

        p1.random = p3;
        p2.random = p5;
        p4.random = p2;

        RandomListNode result = RandomListNode.clone(p1);
        for (int i = 0; i < 5 && result != null; i++) {
            assertEquals(i + 1, result.label);
            result = result.next;
        }
    }
}

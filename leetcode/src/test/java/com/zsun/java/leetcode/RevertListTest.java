package com.zsun.java.leetcode;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/07/12 00:08
 *
 * @author zsun
 */
public class RevertListTest extends TestCase {
    public RevertListTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(RevertListTest.class);
    }

    public void testEmpty() {
        assertNull(ListNode.reverseList(null));
    }

    public void testOneNode() {
        assertEquals(1, ListNode.reverseList(new ListNode(1)).value);
    }

    public void testNormal() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        ListNode newHead = ListNode.reverseList(node1);
        assertEquals(3, newHead.value);
        assertEquals(2, newHead.next.value);
        assertEquals(1, newHead.next.next.value);
        assertNull(newHead.next.next.next);
    }
}

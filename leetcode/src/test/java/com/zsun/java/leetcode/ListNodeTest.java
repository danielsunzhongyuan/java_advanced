package com.zsun.java.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by sunzhongyuan.
 * DateTime: 2019/07/13 23:55
 *
 * @author sunzhongyuan
 */
public class ListNodeTest {
    @Test
    public void testCircle() {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        assertFalse(ListNode.circle(root));

        root.next.next.next = root;
        assertTrue(ListNode.circle(root));

        assertFalse(ListNode.circle(null));
        assertFalse(ListNode.circle(new ListNode(1)));
    }

    @Test
    public void testLength() {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);

        assertEquals(3, ListNode.getLength(root));
        assertEquals(2, ListNode.getLength(root.next));
        assertEquals(1, ListNode.getLength(root.next.next));
        assertEquals(0, ListNode.getLength(root.next.next.next));
    }
}

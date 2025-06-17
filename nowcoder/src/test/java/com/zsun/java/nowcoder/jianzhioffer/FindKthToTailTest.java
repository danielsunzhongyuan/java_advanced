package com.zsun.java.nowcoder.jianzhioffer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 23:16
 */
public class FindKthToTailTest {
    private FindKthToTail findKthToTail = new FindKthToTail();
    private ListNode head;

    @BeforeEach
    public void setHead() {
        head = ListNode.initListFromArray(new int[]{1, 2, 3, 4, 5});
    }

    @Test
    public void testNthListNode() {
        assertTrue(1 == findKthToTail.kthFromTail(head, 5).getValue());
    }

    @Test
    public void testZerothListNode() {
        assertNull(findKthToTail.kthFromTail(head, 0));
    }

    @Test
    public void testTooLargeKList() {
        assertNull(findKthToTail.kthFromTail(head, 6));
    }

    @Test
    public void testNullList() {
        head = null;
        assertNull(findKthToTail.kthFromTail(head, 1));
    }

    @Test
    public void testLastListNode() {
        assertEquals(5, findKthToTail.kthFromTail(head, 1).getValue());
    }
}

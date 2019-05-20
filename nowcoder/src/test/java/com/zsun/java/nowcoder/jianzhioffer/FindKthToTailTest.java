package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 23:16
 */
public class FindKthToTailTest extends TestCase {
    private FindKthToTail findKthToTail;
    private ListNode head;

    public FindKthToTailTest(String name) {
        super(name);
    }

    @Override
    public void setUp() throws Exception {
        findKthToTail = new FindKthToTail();
        head = ListNode.initListFromArray(new int[]{1, 2, 3, 4, 5});
    }

    @Override
    public void tearDown() throws Exception {
        findKthToTail = null;
    }

    public static Test suite() {
        return new TestSuite(FindKthToTailTest.class);
    }

    public void testNthListNode() {
        assertTrue("should be first node: 1", 1 == findKthToTail.kthFromTail(head, 5).getValue());
    }

    public void testZerothListNode() {
        assertTrue("should be null", null == findKthToTail.kthFromTail(head, 0));
    }

    public void testTooLargeKList() {
        assertTrue("should be null", null == findKthToTail.kthFromTail(head, 6));
    }

    public void testNullList() {
        head = null;
        assertTrue("should be null", null == findKthToTail.kthFromTail(head, 1));
    }

    public void testLastListNode() {
        assertTrue("should be last node: 5", 5 == findKthToTail.kthFromTail(head, 1).getValue());
    }
}

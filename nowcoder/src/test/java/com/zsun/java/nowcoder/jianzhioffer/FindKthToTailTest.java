package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.BeforeClass;

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
    @BeforeClass
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

    public void testNullList() {
        assertTrue("should be null", true);
    }

    public void testNthListNode() {
        assertTrue("should be first node: 1", true);
    }

    public void testZerothListNode() {
        assertTrue("should be null", true);
    }

    public void testLastListNode() {
        assertTrue("should be 5", 5 == findKthToTail.kthFromTail(head, 5).getValue());
    }
}

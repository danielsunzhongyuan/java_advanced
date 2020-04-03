package com.zsun.java.leetcode;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

/**
 * Created by qzou at 2020-04-02 22:55
 *
 * @author qzou
 */
public class NextGreaterNodeInLinkedListTest extends TestCase {
    private NextGreaterNodeInLinkedList solution = new NextGreaterNodeInLinkedList();

    public NextGreaterNodeInLinkedListTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(NextGreaterNodeInLinkedListTest.class);
    }

    public void test() {
        ListNode head = ListNode.parseFromArray(new int[]{2, 7, 4, 3, 5});
        int[] results = solution.nextLargerNodes(head);
        Assert.assertArrayEquals(new int[]{7, 0, 5, 5, 0}, results);
    }

    public void test2() {
        ListNode head = ListNode.parseFromArray(new int[]{9, 7, 6, 7, 6, 9});
        Assert.assertArrayEquals(new int[]{0, 9, 9, 9, 9, 0}, solution.nextLargerNodes(head));
    }
}

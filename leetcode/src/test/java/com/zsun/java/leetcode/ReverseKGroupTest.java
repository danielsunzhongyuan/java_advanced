package com.zsun.java.leetcode;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

/**
 * Created by sunzhongyuan.
 * DateTime: 2019/07/13 23:01
 *
 * @author sunzhongyuan
 */
public class ReverseKGroupTest extends TestCase {
    private ReverseKGroup solution = new ReverseKGroup();

    public ReverseKGroupTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(ReverseKGroupTest.class);
    }

    public void testNoChange() {
        assertNull(solution.reverse(null, 10));

        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);

        Assert.assertArrayEquals(new int[]{1, 2, 3},
            ListNode.toArray(solution.reverse(root, 1)));
        Assert.assertArrayEquals(new int[]{1, 2, 3},
            ListNode.toArray(solution.reverse(root, 4)));
    }

    public void testNormal() {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);

        Assert.assertArrayEquals(new int[]{2, 1, 3},
            ListNode.toArray(solution.reverse(root, 2)));

        root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        Assert.assertArrayEquals(new int[]{3, 2, 1},
            ListNode.toArray(solution.reverse(root, 3)));
    }
}

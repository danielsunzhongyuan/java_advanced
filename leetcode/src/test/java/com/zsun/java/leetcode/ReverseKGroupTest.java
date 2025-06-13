package com.zsun.java.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Created by sunzhongyuan.
 * DateTime: 2019/07/13 23:01
 *
 * @author sunzhongyuan
 */
public class ReverseKGroupTest {
    private ReverseKGroup solution = new ReverseKGroup();

    @Test
    public void testNoChange() {
        assertNull(solution.reverse(null, 10));

        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);

        Assertions.assertArrayEquals(new int[]{1, 2, 3},
            ListNode.toArray(solution.reverse(root, 1)));
        Assertions.assertArrayEquals(new int[]{1, 2, 3},
            ListNode.toArray(solution.reverse(root, 4)));
    }

    @Test
    public void testNormal() {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);

        Assertions.assertArrayEquals(new int[]{2, 1, 3},
            ListNode.toArray(solution.reverse(root, 2)));

        root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        Assertions.assertArrayEquals(new int[]{3, 2, 1},
            ListNode.toArray(solution.reverse(root, 3)));
    }
}

package com.zsun.java.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by qzou at 2020-04-02 22:55
 *
 * @author qzou
 */
public class NextGreaterNodeInLinkedListTest {
    private NextGreaterNodeInLinkedList solution = new NextGreaterNodeInLinkedList();

    @Test
    public void test() {
        ListNode head = ListNode.parseFromArray(new int[]{2, 7, 4, 3, 5});
        int[] results = solution.nextLargerNodes(head);
        Assertions.assertArrayEquals(new int[]{7, 0, 5, 5, 0}, results);
    }

    @Test
    public void test2() {
        ListNode head = ListNode.parseFromArray(new int[]{9, 7, 6, 7, 6, 9});
        Assertions.assertArrayEquals(new int[]{0, 9, 9, 9, 9, 0}, solution.nextLargerNodes(head));
    }
}

package com.zsun.java.leetcode;

import java.util.Arrays;

/**
 * Created by qzou at 2020-04-02 22:35
 *
 * @author qzou
 */
public class NextGreaterNodeInLinkedList {
    public int[] nextLargerNodes(ListNode head) {
        if (head == null) {
            return new int[0];
        }

        int length = getListLength(head);
        int[] results = new int[length];
        Arrays.fill(results, 0);

        ListNode nextLargerNode = getNextLargerNode(head);
        if (nextLargerNode != null) {
            results[0] = nextLargerNode.value;
        }

        ListNode runner = head.next;
        for (int i = 1; i < length - 1; i++) {
            if (runner.value >= results[i - 1]) {
                nextLargerNode = getNextLargerNode(runner);
                if (nextLargerNode != null) {
                    results[i] = nextLargerNode.value;
                }
            } else {
                results[i] = results[i - 1];
            }
            runner = runner.next;
        }
        return results;
    }

    private ListNode getNextLargerNode(ListNode node) {
        if (node == null) {
            return null;
        }
        ListNode runner = node.next;
        while (runner != null) {
            if (runner.value > node.value) {
                return runner;
            }
            runner = runner.next;
        }
        return runner;
    }

    private int getListLength(ListNode node) {
        ListNode runner = node;
        int length = 0;
        while (runner != null) {
            length++;
            runner = runner.next;
        }
        return length;
    }
}

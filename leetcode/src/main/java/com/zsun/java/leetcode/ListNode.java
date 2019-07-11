package com.zsun.java.leetcode;

/**
 * Created by zsun.
 * DateTime: 2019/07/12 00:02
 *
 * @author zsun
 */
public class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode sentinal = new ListNode(0);
        ListNode runner = head;
        ListNode tmp;
        while (runner != null) {
            tmp = runner.next;
            runner.next = sentinal.next;
            sentinal.next = runner;
            runner = tmp;
        }
        return sentinal.next;
    }
}

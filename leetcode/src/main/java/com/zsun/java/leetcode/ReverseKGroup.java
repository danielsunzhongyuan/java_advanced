package com.zsun.java.leetcode;

/**
 * Created by sunzhongyuan.
 * DateTime: 2019/07/13 22:56
 *
 * @author sunzhongyuan
 */
public class ReverseKGroup {
    public ListNode reverse(ListNode head, int k) {
        if (head == null || k <= 1 || !needReverse(head, k)) {
            return head;
        }
        ListNode first = head;
        ListNode runner = head;
        ListNode tmp = runner.next;
        ListNode sentinal = new ListNode(-1);
        for (int i = 0; i < k; i++) {
            tmp = runner.next;
            runner.next = sentinal.next;
            sentinal.next = runner;
            runner = tmp;
        }
        first.next = reverse(tmp, k);
        return sentinal.next;
    }

    private boolean needReverse(ListNode node, int k) {
        // 防御编码，正常情况下，下面这个if是进不去的
        if (node == null || k <= 1) {
            return false;
        }
        ListNode runner = node;
        while (k > 0 && runner != null) {
            runner = runner.next;
            k--;
        }
        return runner != null || k == 0;
    }
}

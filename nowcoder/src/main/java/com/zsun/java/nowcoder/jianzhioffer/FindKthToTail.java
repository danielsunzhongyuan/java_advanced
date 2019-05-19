package com.zsun.java.nowcoder.jianzhioffer;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 23:16
 */
public class FindKthToTail {
    public ListNode kthFromTail(ListNode head, int k) {
        if (k <= 0 || head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null && k > 1) {
            fast = fast.next;
            k--;
        }
        if (fast == null) {
            if (k == 0) {
                return fast;
            } else {
                return slow;
            }
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}

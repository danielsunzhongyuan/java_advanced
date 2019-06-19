package com.zsun.java.nowcoder.jianzhioffer;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 23:16
 *
 * @author zsun
 */
public class FindKthToTail {
    public ListNode kthFromTail(ListNode head, int k) {
        if (k <= 0 || head == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && k > 1) {
            fast = fast.next;
            k--;
        }
        if (fast == null) {
            return null;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}

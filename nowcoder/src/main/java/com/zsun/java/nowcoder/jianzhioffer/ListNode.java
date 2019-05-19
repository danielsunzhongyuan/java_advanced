package com.zsun.java.nowcoder.jianzhioffer;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 23:21
 */
public class ListNode {
    private int value;

    ListNode next = null;

    ListNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ListNode{" +
            "value=" + value +
            ", next=" + next +
            '}';
    }

    public static ListNode initListFromArray(int[] array) {
        if (array == null || 0 == array.length) {
            return null;
        }
        int length = array.length;
        ListNode head = new ListNode(array[0]);
        for (int i = length - 1; i > 0; i--) {
            ListNode tmp = new ListNode(array[i]);
            tmp.next = head.next;
            head.next = tmp;
        }
        return head;
    }
}

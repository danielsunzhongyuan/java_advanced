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

    public static int[] toArray(ListNode node) {
        if (node == null) {
            return new int[]{};
        }
        ListNode runner = node;
        int length = getLength(node);
        int[] result = new int[length];
        for (int i = 0; i < length && runner != null; i++, runner = runner.next) {
            result[i] = runner.value;
        }

        return result;
    }

    public static ListNode parseFromArray(int[] array) {
        if (array.length <= 0) {
            return null;
        }
        int length = array.length;
        ListNode sentinal = new ListNode(0);
        for (int i = length - 1; i >= 0; i--) {
            ListNode tmp = new ListNode(array[i]);
            tmp.next = sentinal.next;
            sentinal.next = tmp;
        }
        return sentinal.next;
    }

    /**
     * 计算单链表的长度，前提条件是没有环
     *
     * @param root 单链表的头节点
     * @return 单链表的长度
     */
    public static int getLength(ListNode root) {
        if (root == null) {
            return 0;
        }
        int result = 0;
        ListNode runner = root;
        while (runner != null) {
            result++;
            runner = runner.next;
        }
        return result;
    }

    /**
     * 判断是否有环
     *
     * @param root 单链表的头节点
     * @return 是否有环，true表示有
     */
    public static boolean circle(ListNode root) {
        if (root == null || root.next == null || root.next.next == null) {
            return false;
        }
        ListNode slow = root.next;
        ListNode fast = root.next.next;
        while (slow != fast && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow == fast;
    }
}

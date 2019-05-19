package com.zsun.java.nowcoder.jianzhioffer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 16:36
 */
public class PrintLinkList {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (null == listNode) {
            return ret;
        }
        ListNode runner = listNode;
        while (null != runner) {
            ret.add(runner.val);
            runner = runner.next;
        }
        Collections.reverse(ret);
        return ret;
    }
}

class ListNode {
    int val;

    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

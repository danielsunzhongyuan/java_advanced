package com.zsun.java.nowcoder.jianzhioffer;

/**
 * Created by zsun.
 * DateTime: 2019/06/19 17:43
 *
 * @author zsun
 */
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }

    public RandomListNode clone(RandomListNode pHead) {
        if (pHead == null) {
            return null;
        }
        RandomListNode runner = pHead;
        while (runner != null) {
            RandomListNode newNode = new RandomListNode(runner.label);
            newNode.next = runner.next;
            runner.next = newNode;
            runner = runner.next.next;
        }

        runner = pHead;
        while (runner != null) {
            runner.next.random = runner.random.next;
            runner = runner.next.next;
        }

        runner = pHead;
        RandomListNode result = runner.next;
        RandomListNode tail = null;
        while (runner != null) {
            tail = runner.next;

        }
        return null;
    }
}

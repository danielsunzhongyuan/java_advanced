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

        // 原先的链表double一下，原先的1、2、3变成1、1、2、2、3、3
        RandomListNode runner = pHead;
        while (runner != null) {
            RandomListNode newNode = new RandomListNode(runner.label);
            newNode.next = runner.next;
            runner.next = newNode;
            runner = runner.next.next;
        }

        // 给random赋值
        runner = pHead;
        while (runner != null) {
            runner.next.random = runner.random.next;
            runner = runner.next.next;
        }

        // 把double之后的链表再拆成两个
        runner = pHead;
        RandomListNode result = runner.next;
        RandomListNode tail = runner.next;
        runner.next = runner.next.next;
        runner = runner.next;

        while (runner != null) {
            tail.next = runner.next;
            tail = tail.next;
            runner.next = tail.next;
            runner = runner.next;
        }
        return result;
    }
}

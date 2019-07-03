package com.zsun.java.nowcoder.jianzhioffer;

import java.util.Stack;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 19:53
 *
 * @author zsun
 */
public class QueueUsingTwoStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (!stack2.empty()) {
            return stack2.pop();
        }
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        if (!stack2.empty()) {
            return stack2.pop();
        }

        return -1;
    }
}

package com.zsun.java.nowcoder.jianzhioffer;

import java.util.Stack;

/**
 * Created by zsun.
 * DateTime: 2019/05/20 20:43
 */
public class MinStack {
    Stack<Integer> data = new Stack();
    Stack<Integer> minData = new Stack();

    public void push(int node) {
        if (data.empty()) {
            data.push(node);
            minData.push(node);
            return;
        }

        int currentMin = minData.peek();
        if (currentMin < node) {
            minData.push(currentMin);
        } else {
            minData.push(node);
        }
        data.push(node);
    }

    public void pop() {
        if (data.empty()) {
            return;
        }
        data.pop();
        minData.pop();
    }

    public int top() {
        if (data.empty()) {
            return -1;
        }
        return data.peek();
    }

    public int min() {
        if (minData.empty()) {
            return -1;
        }
        return minData.peek();
    }
}

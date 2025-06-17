package com.zsun.java.leetcode;

import java.util.Stack;

/**
 * @author : zsun
 * @date : 2020/09/02 17:28
 */
public class SortedStack<E extends Comparable> {
    Stack<E> data;
    Stack<E> helper;

    public SortedStack() {
        data = new Stack<>();
        helper = new Stack<>();
    }

    public void push(E val) {
        while (!data.isEmpty() && data.peek().compareTo(val) < 0) {
            helper.add(data.pop());
        }
        data.add(val);
        while (!helper.isEmpty()) {
            data.add(helper.pop());
        }
    }

    public void pop() {
        if (!data.isEmpty()) {
            data.pop();
        }
    }

    public E peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("stack is empty");
        }
        return data.peek();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public static void main(String[] args) throws Exception {
        SortedStack<Integer> stack = new SortedStack<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.peek());
    }
}

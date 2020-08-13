package com.zsun.java.nowcoder.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author : zsun
 * @date : 2020/08/13 20:16
 */
public class GetMinInStack {
    public int[] getMinStack(int[][] op) {
        if (op.length < 1) {
            return new int[0];
        }
        // write code here
        List<Integer> results = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int[] i : op) {
            if (i.length == 2) {
                if (stack.isEmpty()) {
                    stack.add(i[1]);
                } else {
                    stack.add(Math.min(i[1], stack.get(stack.size() - 1)));
                }
            } else if (i.length == 1) {
                if (i[0] == 2) {
                    stack.pop();
                } else if (i[0] == 3) {
                    results.add(stack.peek());
                }
            }
        }
        return results.stream().mapToInt(Integer::valueOf).toArray();
    }
}

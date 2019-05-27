package com.zsun.java.nowcoder.jianzhioffer;

import java.util.Stack;

public class IsPushOrder {
    public boolean right(int[] pushA, int[] popA) {
        Stack<Integer> s = new Stack<>();

        int length = pushA.length;
        if (length <= 0) {
            return true;
        }
        int i = 0;
        int j = 0;
        s.push(pushA[i++]);
        while (j < length) {
            while (s.peek() != popA[j] && i < length) {
                s.push(pushA[i++]);
            }
            while (j < length && !s.empty() && s.peek() == popA[j]) {
                s.pop();
                j++;
            }
        }
        return s.empty();
    }

    public static void main(String[] args) {
        IsPushOrder solution = new IsPushOrder();
        boolean result = solution.right(new int[]{1}, new int[]{1});
        System.out.println(result);
    }
}

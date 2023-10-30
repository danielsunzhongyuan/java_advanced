package com.zsun.java.leetcode;

import java.util.ArrayDeque;

/**
 * Created by qzou at 2020-08-25 07:42
 * 最长有效括号的长度。
 * 解法：用栈把有效的括号都删掉，剩下的非法的括号的index的间隔就是被消除掉的括号的长度
 *
 * @author qzou
 */
public class ValidParenthese {
    class Pair<K, V> {
        K k;
        V v;

        public Pair(K k, V v) {
            this.k = k;
            this.v = v;
        }

        public K getKey() {
            return k;
        }

        public V getValue() {
            return v;
        }
    }

    public int longestValidParentheses(String s) {
        ArrayDeque<Pair<Character, Integer>> stack = new ArrayDeque<>();
        int max = 0;
        int value;
        char current;
        Pair p;

        for (int i = 0; i < s.length(); i++) {
            current = s.charAt(i);
            if (!stack.isEmpty() && stack.peekLast().getKey() == '(' && current == ')') {
                stack.pollLast();
            } else {
                stack.add(new Pair(current, i + 1));
            }
        }

        int prev = s.length() + 1;

        while (!stack.isEmpty()) {
            max = Math.max(max, prev - stack.peekLast().getValue() - 1);
            prev = stack.peekLast().getValue();
            stack.pollLast();
        }

        return Math.max(max, prev - 1);
    }

    public static void main(String[] args) {
        ValidParenthese validParenthese = new ValidParenthese();
        int i = validParenthese.longestValidParentheses("((()()))))");
        System.out.println(i);
    }
}

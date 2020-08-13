package com.zsun.java.nowcoder.questions;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by qzou at 2020-08-14 01:05
 *
 * @author qzou
 */
public class QuestionTwo {
    public String solve(String str) {
        if ("".equals(str) || str.length() < 2) {
            return str;
        }

        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (stack.empty()) {
                stack.add(c);
            } else {
                if (c == '1' && stack.peek() == '1') {
                    stack.pop();
                } else if (c == '0' && stack.peek() == '0') {
                    stack.pop();
                    if (!stack.empty() && stack.peek() == '1') {
                        stack.pop();
                    } else {
                        stack.push('1');
                    }
                } else {
                    stack.push(c);
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        Iterator<Character> iterator = stack.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        QuestionTwo questionTwo = new QuestionTwo();
        String s = "00110001";
        System.out.println(questionTwo.solve(s));
    }
}

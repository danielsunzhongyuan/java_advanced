package com.zsun.java.leetcode;

import java.util.Stack;

/**
 * 逆波兰表达式
 *
 * @author : zsun
 * @date : 2020/08/21 14:19
 */
public class EvalReversePolishNotation {
    public static int evalRpn(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int a;
        int b;
        for (String token : tokens) {
            switch (token) {
                case "+":
                    a = Integer.parseInt(stack.pop());
                    b = Integer.parseInt(stack.pop());
                    stack.push(String.valueOf(a + b));
                    break;
                case "-":
                    a = Integer.parseInt(stack.pop());
                    b = Integer.parseInt(stack.pop());
                    stack.push(String.valueOf(b - a));
                    break;
                case "*":
                    a = Integer.parseInt(stack.pop());
                    b = Integer.parseInt(stack.pop());
                    stack.push(String.valueOf(a * b));
                    break;
                case "/":
                    a = Integer.parseInt(stack.pop());
                    b = Integer.parseInt(stack.pop());
                    stack.push(String.valueOf(b / a));
                    break;
                default:
                    stack.push(token);
                    break;
            }
        }
        return Integer.parseInt(stack.pop());
    }

    public static void main(String[] args) {
        System.out.println(evalRpn(new String[]{"2", "1", "+", "3", "*"}));
        System.out.println(evalRpn(new String[]{"4", "13", "5", "/", "+"}));
    }
}

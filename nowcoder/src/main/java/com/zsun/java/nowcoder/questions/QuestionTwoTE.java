package com.zsun.java.nowcoder.questions;

/**
 * Created by qzou at 2020-08-14 00:28
 *
 * @author qzou
 */
public class QuestionTwoTE {
    public String solve(String str) {
        // write code here
        if ("".equals(str)) {
            return str;
        }

        String next = change(str);
        while (!str.equals(next)) {
            System.out.println(str + " => " + next);
            str = next;
            next = change(next);
        }
        return str;
    }

    private String change(String str) {
        if ("".equals(str) || str.length() == 1) {
            return str;
        }

        for (int i = 1, length = str.length(); i < length; i++) {
            char pre = str.charAt(i - 1);
            char cur = str.charAt(i);
            String ret = "";
            if (pre == '0' && cur == '0') {
                return str.substring(0, i - 1) + "1" + str.substring(i + 1, length);
            } else if (pre == '1' && cur == '1') {
                return str.substring(0, i - 1) + str.substring(i + 1, length);
            }
        }

        return str;
    }

    public static void main(String[] args) {
        QuestionTwoTE questionTwoTE = new QuestionTwoTE();
        String s = "00110001";
        System.out.println(questionTwoTE.solve(s));
    }
}

package com.zsun.java.nowcoder.questions;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by qzou at 2020-08-14 00:46
 * 还是超时
 *
 * @author qzou
 */
public class QuestionTwo {
    public String solve(String str) {
        // write code here
        if ("".equals(str)) {
            return str;
        }

        List<Character> chars = new LinkedList<>();
        for (char c : str.toCharArray()) {
            chars.add(c);
        }

        int preCount = chars.size();
        change(chars);
        while (preCount != chars.size()) {
            System.out.println(chars);
            preCount = chars.size();
            change(chars);
        }

        StringBuffer sb = new StringBuffer();
        chars.forEach(c -> {
            sb.append(c);
        });
        return sb.toString();
    }

    private void change(List<Character> chars) {
        if (chars.size() < 2) {
            return;
        }

        for (int i = 1, length = chars.size(); i < length; i++) {
            char pre = chars.get(i - 1);
            char cur = chars.get(i);

            if (pre == '0' && cur == '0') {
                chars.set(i - 1, '1');
                chars.remove(i);
                return;
            } else if (pre == '1' && cur == '1') {
                chars.remove(i);
                chars.remove(i - 1);
                return;
            }
        }

        return;
    }

    public static void main(String[] args) {
        QuestionTwo questionTwo = new QuestionTwo();
        String s = "00110001";
        System.out.println(questionTwo.solve(s));
    }
}

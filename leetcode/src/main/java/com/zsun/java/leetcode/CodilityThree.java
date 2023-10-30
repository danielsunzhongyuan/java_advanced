package com.zsun.java.leetcode;

/**
 * Created by qzou at 2020-08-05 21:08
 *
 * @author qzou
 */
public class CodilityThree {
    private static final char WHITESPACE = ' ';

    /**
     * 获取一个字符串最后一个 word 的长度
     *
     * @param s 字母加空格的字符串
     * @return 最后一个 word 的长度
     */
    public int Solution(String s) {
        String trim = s.trim();
        if ("".equals(trim)) {
            return 0;
        }
        String[] s1 = trim.split(" ");
        if (s1.length < 1) {
            return 0;
        }
        return s1[s1.length - 1].length();
    }

    /**
     * 占用空间少一些
     */
    public int Solution2(String s) {
        if ("".equals(s)) {
            return 0;
        }

        int length = s.length() - 1;

        while (length >= 0 && s.charAt(length) == WHITESPACE) {
            length--;
        }
        if (length < 0) {
            return 0;
        }

        int count = 0;
        while (length >= 0 && s.charAt(length) != WHITESPACE) {
            count++;
            length--;
        }
        return count;
    }

    public static void main(String[] args) {
        CodilityThree codilityThree = new CodilityThree();
        System.out.println(codilityThree.Solution(" "));
        System.out.println(codilityThree.Solution(""));
        System.out.println(codilityThree.Solution(" sdf sdfksd sdfjs sdffswer"));
        System.out.println(codilityThree.Solution(" sdfs skdf s  "));
        System.out.println(codilityThree.Solution(" ssssssssss  "));
        System.out.println(codilityThree.Solution("sfsfasdfasdfaf"));
        System.out.println(codilityThree.Solution("        "));
        System.out.println("####");
        System.out.println(codilityThree.Solution2(" "));
        System.out.println(codilityThree.Solution2(""));
        System.out.println(codilityThree.Solution2(" sdf sdfksd sdfjs sdffswer"));
        System.out.println(codilityThree.Solution2(" sdfs skdf s  "));
        System.out.println(codilityThree.Solution2(" ssssssssss  "));
        System.out.println(codilityThree.Solution2("sfsfasdfasdfaf"));
        System.out.println(codilityThree.Solution2("        "));
    }
}

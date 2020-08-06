package com.zsun.java.leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by qzou at 2020-08-05 20:41
 *
 * @author qzou
 */
public class CodilityFive {
    /**
     * 按照 SML 来排序
     * <p>
     * TODO： 这个没全对，性能也不行
     * 真是 2B 了，这不就是计数排序嘛。。。
     */
    public String Solution2(String T) {
        if ("".equals(T)) {
            return T;
        }
        int lCounter = 0;
        int mCounter = 0;
        int sCounter = 0;
        int length = T.length();
        for (int i = 0; i < length; i++) {
            char c = T.charAt(i);
            switch (c) {
                case 'S':
                    sCounter++;
                    break;
                case 'M':
                    mCounter++;
                    break;
                case 'L':
                    lCounter++;
                    break;
                default:
                    break;
            }
        }
        StringBuffer sb = new StringBuffer(lCounter + mCounter + sCounter);
        for (int i = 0; i < sCounter; i++) {
            sb.append('S');
        }
        for (int i = 0; i < mCounter; i++) {
            sb.append('M');
        }
        for (int i = 0; i < lCounter; i++) {
            sb.append('L');
        }
        return sb.toString();
    }

    public String Solution(String T) {
        if ("".equals(T)) {
            return T;
        }
        char[] chars = T.toCharArray();
        StringBuffer sb = new StringBuffer();
        List<Character> list = new ArrayList<>(chars.length);
        for (char aChar : chars) {
            list.add(aChar);
        }
        list.sort(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o2.compareTo(o1);
            }
        });
        for (Character character : list) {
            sb.append(character);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        CodilityFive codilityFive = new CodilityFive();
        System.out.println(codilityFive.Solution2("MSSLS"));
        System.out.println(codilityFive.Solution2("LLMS"));
        System.out.println(codilityFive.Solution2("SMS"));
    }
}

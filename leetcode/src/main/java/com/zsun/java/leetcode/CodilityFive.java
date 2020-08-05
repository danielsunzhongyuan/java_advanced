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
     *
     * TODO： 这个没全对，性能也不行
     */
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
        System.out.println(codilityFive.Solution("MSSLS"));
        System.out.println(codilityFive.Solution("LLMS"));
        System.out.println(codilityFive.Solution("SMS"));
        assert "SSSML".equals(codilityFive.Solution("MSSLS"));
        assert "SMLL".equals(codilityFive.Solution("LLMS"));
        assert "SSM".equals(codilityFive.Solution("SMS"));
    }
}

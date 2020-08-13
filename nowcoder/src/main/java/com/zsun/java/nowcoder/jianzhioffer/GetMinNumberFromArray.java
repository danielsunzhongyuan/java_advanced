package com.zsun.java.nowcoder.jianzhioffer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author : zsun
 * @date : 2020/08/13 20:47
 */
public class GetMinNumberFromArray {
    public String PrintMinNumber(int[] numbers) {
        if (numbers.length < 1) {
            return "";
        }
        List<Integer> x = new ArrayList<>();
        for (int number : numbers) {
            x.add(number);
        }
        x.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = String.valueOf(o1) + String.valueOf(o2);
                String s2 = String.valueOf(o2) + String.valueOf(o1);
                return s1.compareTo(s2);
            }
        });
        StringBuffer sb = new StringBuffer();
        x.forEach(k -> {
            sb.append(k.toString());
        });
        return sb.toString();
    }
}

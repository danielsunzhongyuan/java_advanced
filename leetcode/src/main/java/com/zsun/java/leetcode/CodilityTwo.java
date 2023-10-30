package com.zsun.java.leetcode;

import java.util.HashMap;

/**
 * Created by qzou at 2020-08-05 20:06
 *
 * @author qzou
 */
public class CodilityTwo {
    /**
     * @param s 某一天是星期几
     * @param k 几天后
     * @return 是星期几？
     */
    public String Solution(String s, int k) {
        if (k < 0 || k > 500) {
            return "";
        }
        HashMap<String, Integer> weekdayToNumber = new HashMap<>();
        String[] weekdays = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        for (int i = 0; i < weekdays.length; i++) {
            weekdayToNumber.put(weekdays[i], i);
        }

        if (!weekdayToNumber.containsKey(s)) {
            return "";
        }
        Integer currentDayNumber = weekdayToNumber.get(s);
        int nextDayNumber = (currentDayNumber + k) % 7;
        return weekdays[nextDayNumber];
    }

    public static void main(String[] args) {
        CodilityTwo codilityTwo = new CodilityTwo();
        System.out.println(codilityTwo.Solution("Mon", 2));
        System.out.println(codilityTwo.Solution("Wed", 2));
        System.out.println(codilityTwo.Solution("Sat", 23));
    }
}

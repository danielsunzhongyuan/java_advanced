package com.zsun.java.leetcode;

import java.util.HashMap;

/**
 * Created by qzou at 2020-08-05 20:06
 *
 * @author qzou
 */
public class CodilityTwo {
    /**
     *
     * @param S 某一天是星期几
     * @param K 几天后
     * @return 是星期几？
     */
    public String Solution(String S, int K) {
        if (K < 0 || K > 500) {
            return "";
        }
        HashMap<String, Integer> weekdayToNumber = new HashMap<>();
        String[] weekdays = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        for (int i = 0; i < weekdays.length; i++) {
            weekdayToNumber.put(weekdays[i], i);
        }

        if (!weekdayToNumber.containsKey(S)) {
            return "";
        }
        Integer currentDayNumber = weekdayToNumber.get(S);
        int nextDayNumber = (currentDayNumber + K) % 7;
        return weekdays[nextDayNumber];
    }

    public static void main(String[] args) {
        CodilityTwo codilityTwo = new CodilityTwo();
        System.out.println(codilityTwo.Solution("Mon", 2));
        System.out.println(codilityTwo.Solution("Wed", 2));
        System.out.println(codilityTwo.Solution("Sat", 23));
    }

}

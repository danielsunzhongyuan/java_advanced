package com.zsun.java.nowcoder.jianzhioffer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zsun.
 * DateTime: 2019/05/22 23:31
 */
public class FirstCharExistingOnce {
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character, Integer> mapping = new HashMap<>();
        int length = str.length();
        if (length <= 0) {
            return -1;
        }
        char c;
        for (int i = 0; i < length; i++) {
            c = str.charAt(i);
            if (mapping.containsKey(c)) {
                mapping.put(c, -1);
            } else {
                mapping.put(c, i);
            }
        }
        int minIndex = -1;
        int curIndex;
        for (Map.Entry<Character, Integer> entry : mapping.entrySet()) {
            curIndex = entry.getValue();
            if (curIndex >= 0) {
                if (minIndex > curIndex || minIndex == -1) {
                    minIndex = curIndex;
                }
            }
        }
        return minIndex;
    }
}

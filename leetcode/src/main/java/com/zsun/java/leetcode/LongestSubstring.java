package com.zsun.java.leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println(new LongestSubstring().lengthOfLongestSubstring("tmmzuxt"));
    }

    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) {
            return s.length();
        }
        int maxLength = 1;
        Map<Character, Integer> map = new HashMap<>();
        int length = s.length();
        int left = 0;
        int right = 0;
        while (right < length) {
            if (!map.containsKey(s.charAt(right))) {
                map.put(s.charAt(right), right);
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                left = map.get(s.charAt(right)) + 1;
                map.put(s.charAt(right), right);
                Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry<Character, Integer> next = iterator.next();
                    if (next.getValue() < left) {
                        iterator.remove();
                    }
                }
            }
            right++;
        }
        return maxLength;
    }
}

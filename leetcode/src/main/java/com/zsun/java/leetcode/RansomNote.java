package com.zsun.java.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }

        for (char c : ransomNote.toCharArray()) {
            if (charMap.containsKey(c)) {
                int count = charMap.get(c) - 1;
                if (count <= 0) {
                    charMap.remove(c);
                } else {
                    charMap.put(c, count);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        RansomNote ransomNote = new RansomNote();
        boolean b = ransomNote.canConstruct("fihjjjjei", "hjibagacbhadfaefdjaeaebgi");
        System.out.println(b);
    }
}

package com.zsun.java.leetcode;

import java.util.*;

public class FindAllAnagrams {
    public static void main(String[] args) {
        System.out.println(new FindAllAnagrams().getEigenvalue("abca"));
        System.out.println(new FindAllAnagrams().findAnagrams("abab", "ab"));
    }

    public List<Integer> findAnagrams(String s, String p) {
        Map<Character, Integer> windows = new HashMap<>();
        Map<Character, Integer> need = new HashMap<>();
        for(int i = 0; i< p.length(); i++){
            char c = p.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int left =0, right =0;
        int valit = 0;
        List<Integer> res = new ArrayList<>();
        while(right < s.length()){
            char c = s.charAt(right);
            right++;
            if(need.containsKey(c)){
                windows.put(c, windows.getOrDefault(c, 0) + 1);
                if(need.get(c).equals(windows.get(c))){
                    valit++;
                }
            }

            while(right - left >= p.length()){
                if(valit == need.size()){
                    res.add(left);
                }
                char t = s.charAt(left);
                left++;
                if(need.containsKey(t)){
                    if(need.get(t).equals(windows.get(t))){
                        valit--;
                    }
                    windows.put(t, windows.getOrDefault(t, 0) - 1);
                }
            }
        }
        return res;
    }

    public List<Integer> findAnagrams2(String s, String p) {
        List<Integer> results = new ArrayList<>();

        int lenS = s.length();
        int lenP = p.length();
        Set<Character> chars = getChars(p);
        String eigenvalue = getEigenvalue(p);
        int i = 0;
        while (i < lenS - lenP + 1) {
            String substring = s.substring(i, i + lenP);
            // below code will lead to worse performance
//            int k = i;
//            for (int j = 0; j < lenP; j++) {
//                if (!chars.contains(substring.charAt(j))) {
//                    k = j + 1;
//                }
//            }
//            if (k > i) {
//                i = k;
//                continue;
//            }
            String eigenvalue1 = getEigenvalue(substring);
            if (eigenvalue.equalsIgnoreCase(eigenvalue1)) {
                results.add(i);
            }
            i++;
        }
        return results;
    }

    private String getEigenvalue(String p) {
        int[] alphabetsCount = new int[26];
        char[] charArray = p.toCharArray();
        for (char c : charArray) {
            alphabetsCount[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (alphabetsCount[i] > 0) {
                sb.append((char)(i + 'a'));
                sb.append(alphabetsCount[i]);
            }
        }
        return sb.toString();
    }

    private Set<Character> getChars(String p) {
        HashSet<Character> chars = new HashSet<>();
        char[] charArray = p.toCharArray();
        for (char c : charArray) {
            chars.add(c);
        }
        return chars;
    }
}

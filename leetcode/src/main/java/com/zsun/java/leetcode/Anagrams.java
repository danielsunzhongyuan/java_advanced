package com.zsun.java.leetcode;

import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        String[] strs = new String[]{"are", "bat", "ear", "code", "tab", "era"};
        System.out.println(new Anagrams().groupAnagrams(strs));
        System.out.println(new Anagrams().groupAnagrams(new String[]{""}));
        System.out.println(new Anagrams().groupAnagrams(new String[]{"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa","aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab"}));
    }

    public List<List<String>> groupAnagrams2(String[] strs) {
        Map<String, List<String>> multipleToListMap = new HashMap<>();

        for (String str : strs) {
            String sortedStr = getSortedStr(str);
            System.out.println(sortedStr);
            if (multipleToListMap.containsKey(sortedStr)) {
                List<String> strList = multipleToListMap.get(sortedStr);
                strList.add(str);
            } else {
                List<String> strList = new ArrayList<>();
                strList.add(str);
                multipleToListMap.put(sortedStr, strList);
            }
        }

        return new ArrayList<>(multipleToListMap.values());
    }

    private String getSortedStr(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return String.valueOf(charArray);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Character, Integer> charToPrimeNumberMap = getCharToPrimeNumberMap();

        Map<Double, List<String>> multipleToListMap = new HashMap<>();
        for (String str : strs) {
            double multiple = getMultiple(str, charToPrimeNumberMap);
            System.out.println(multiple);
            if (multipleToListMap.containsKey(multiple)) {
                List<String> strList = multipleToListMap.get(multiple);
                strList.add(str);
            } else {
                List<String> strList = new ArrayList<>();
                strList.add(str);
                multipleToListMap.put(multiple, strList);
            }
        }

        return new ArrayList<>(multipleToListMap.values());
    }

    private double getMultiple(String str, Map<Character, Integer> charToPrimeNumberMap) {
        double result = 1;
        for (char c : str.toCharArray()) {
            result *= charToPrimeNumberMap.get(c);
        }
        return result;
    }

    private Map<Character, Integer> getCharToPrimeNumberMap() {
        Map<Character, Integer> result = new HashMap<>();
        result.put('a', 2);
        result.put('b', 3);
        result.put('c', 5);
        result.put('d', 7);
        result.put('e', 11);
        result.put('f', 13);
        result.put('g', 17);
        result.put('h', 19);
        result.put('i', 23);
        result.put('j', 29);
        result.put('k', 31);
        result.put('l', 37);
        result.put('m', 41);
        result.put('n', 43);
        result.put('o', 47);
        result.put('p', 53);
        result.put('q', 59);
        result.put('r', 61);
        result.put('s', 67);
        result.put('t', 71);
        result.put('u', 73);
        result.put('v', 79);
        result.put('w', 83);
        result.put('x', 89);
        result.put('y', 97);
        result.put('z', 101);
        return result;
    }
}

package com.zsun.java.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SumOfKMirrorNumber {
    public static void main(String[] args) {
        SumOfKMirrorNumber sumOfKMirrorNumber = new SumOfKMirrorNumber();
//        System.out.println(sumOfKMirrorNumber.kMirror(2, 5));
//        System.out.println(sumOfKMirrorNumber.kMirror(3, 7));
        System.out.println(sumOfKMirrorNumber.kMirror(7, 17));
        System.out.println(sumOfKMirrorNumber.toKNumberSystem(7, "4602064"));
    }
    public long kMirror(int k, int n) {
        long result = 0;
        int count = 0;

        List<List<String>> kMirrorPossibleNumbers = new ArrayList<>();
        List<String> oneDigitalMirrorNumbers = new ArrayList<>();
        List<String> twoDigitalsMirrorNumbers = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            oneDigitalMirrorNumbers.add("" + i);
            twoDigitalsMirrorNumbers.add("" + i + i);
        }
        kMirrorPossibleNumbers.add(oneDigitalMirrorNumbers);
        kMirrorPossibleNumbers.add(twoDigitalsMirrorNumbers);

        while (count < n) {
            List<String> lastButOneMirrorNumbers = kMirrorPossibleNumbers.get(kMirrorPossibleNumbers.size() - 2);
//            System.out.println(lastButOneMirrorNumbers);
            for (String number : lastButOneMirrorNumbers) {
                if (isMirrorNumberInDecimal(number) && isMirrorNumberInDecimal(String.valueOf(stringToLong(k, number)))) {
                    System.out.println("k is " + k + ", n is " + n + ", number is " + number + ", digital number is " + stringToLong(k, number));
                    count++;
                    result += stringToLong(k, number);
                }
                if (count >= n) {
                    return result;
                }
            }
            kMirrorPossibleNumbers.add(appendMirrorNumbers(k, lastButOneMirrorNumbers));
        }
        return result;
    }

    private boolean isMirrorNumberInDecimal(String number) {
        int length = number.length();
        if (number.startsWith("0")) {
            return false;
        }
        if (length < 2) {
            return true;
        }
        int i = 0;
        while (i < length / 2) {
            if (number.charAt(i) == number.charAt(length - 1 - i)) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }

    private long stringToLong(int k, String number) {
        long result = 0;
        for (int i = 0; i < number.length(); i++) {
            result = result * k + Integer.valueOf(String.valueOf(number.charAt(i)));
        }
        return result;
    }

    private List<String> appendMirrorNumbers(int k, List<String> numbers) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            for (String number : numbers) {
                result.add("" + i + number + i);
            }
        }
        return result;
    }

    private String toDecimal(int k, String number) {
        long result = 0;
        for (int i = 0; i < number.length(); i++) {
            result = result * k + Integer.valueOf(String.valueOf(number.charAt(i)));
        }
        return String.valueOf(result);
    }

    private String toKNumberSystem(int k, String number) {
        String result = "";
        Long numberInDecimal = Long.valueOf(number);
        while (numberInDecimal > 0) {
            result = "" + numberInDecimal % k + result;
            numberInDecimal /= k;
        }
        return result;
    }
}

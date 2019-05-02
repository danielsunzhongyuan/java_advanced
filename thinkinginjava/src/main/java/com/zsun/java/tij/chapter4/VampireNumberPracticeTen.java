package com.zsun.java.tij.chapter4;

import java.util.Arrays;

public class VampireNumberPracticeTen {
    private static boolean isVampireNumber(int multiply, int i, int j) {
        if (i < 10 || i > 99 || j < 10 || j > 99 || multiply < 1000 || multiply > 9999) {
            return false;
        }
        String m = sortString(String.valueOf(multiply));

        return m.equals(sortString(String.valueOf(i) + String.valueOf(j)));
    }

    public static String sortString(String inputString) {
        // convert input string to char array
        char[] tempArray = inputString.toCharArray();

        // sort tempArray
        Arrays.sort(tempArray);

        // return new sorted string
        return new String(tempArray);
    }

    public static void main(String[] args) {
//        outer:
        for (int i = 11; i < 99; i++) {
            int minJ = Math.max(Math.max(10, 1000 / i), i);
            int maxJ = Math.min(99, 10000 / i);
            for (int j = minJ; j <= maxJ; j++) {
                int multiply = i * j;
                if (isVampireNumber(multiply, i, j)) {
                    System.out.println(multiply + " = " + i + " * " + j);
//                    break outer;
                }
            }
        }
    }
}

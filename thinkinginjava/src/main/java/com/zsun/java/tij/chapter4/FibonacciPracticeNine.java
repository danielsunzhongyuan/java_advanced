package com.zsun.java.tij.chapter4;

public class FibonacciPracticeNine {
    public static void main(String[] args) {
        int n;
        try {
            n = Integer.parseInt(args[0]);
            if (n <= 0) {
                return;
            }
        } catch (Exception e) {
            System.out.println(e);
            return;
        }
        switch (n) {
            case 1:
                System.out.println(1);
                break;
            case 2:
            default:
                System.out.println(1);
                System.out.println(1);
                break;
        }

        int a = 1;
        int b = 1;
        int next;
        while (n > 2) {
            next = a + b;
            System.out.println(next);
            a = b;
            b = next;
            n--;
        }
    }
}

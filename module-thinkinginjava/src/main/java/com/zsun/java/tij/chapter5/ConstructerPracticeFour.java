package com.zsun.java.tij.chapter5;

public class ConstructerPracticeFour {
    ConstructerPracticeFour() {
        System.out.println("ConstructerPracticeFour default constructer");
    }

    ConstructerPracticeFour(String a) {
        System.out.println("ConstructerPracticeFour with param: " + a);
    }

    public static void main(String[] args) {
        ConstructerPracticeFour a = new ConstructerPracticeFour();
        ConstructerPracticeFour b = new ConstructerPracticeFour("zzz");
    }
}

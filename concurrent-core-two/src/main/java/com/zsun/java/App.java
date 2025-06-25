package com.zsun.java;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String a = "234";
        int length = a.length();
        System.out.println(length / 2);
        long x = Long.valueOf(a);
        System.out.println(x);
        List<List<String>> y = new ArrayList<>();
        List<String> z = new ArrayList<>();
        z.add("1");
        z.add("2");
        y.add(z);
    }
}

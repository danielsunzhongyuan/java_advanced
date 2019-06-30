package com.zsun.java.tij;

import java.util.Calendar;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, -1);
        System.out.println(calendar.get(Calendar.HOUR));
    }
}

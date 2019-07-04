package com.zsun.java.tij.chapter2;

/**
 * Created by zsun
 *
 * @author zsun
 */
public class ShowProperties {
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
}

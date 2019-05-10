package com.zsun.java.corejava9;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        App a = new App();
        a.readFirstLineFromFile("sdf");
    }

    private String readFirstLineFromFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (Exception e) {
            System.out.println("error" + e.toString());
        }
        return "";
    }
}

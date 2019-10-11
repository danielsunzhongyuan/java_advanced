package com.zsun.java.corejava9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Hello world!
 */
public class App {
    public Pattern pattern = Pattern.compile(".*//.+:\\d+/(.*)?");

    public static void main(String[] args) {
        double x = 0.5;
        int y = (int) (x * 100);
        System.out.println(y);
        App a = new App();
//        a.readFirstLineFromFile("/tmp/sdf");

        List<Double> test = new ArrayList<>();
        test.add(0.5);
        test.add(0.5);
        double sum = 0.0;
        for (int i = 0; i < 1000000; i++) {
            sum += test.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
        }
        System.out.println(sum);

        float f = 0L;
        f = 10 / 333 * 100;
        System.out.println("f: " + String.valueOf(f));

        System.out.println("##########");
        String[] aaa = new String[]{"23", "32"};
        try {
            System.out.println(aaa[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
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

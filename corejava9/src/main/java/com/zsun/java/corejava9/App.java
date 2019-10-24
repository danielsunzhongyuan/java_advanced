package com.zsun.java.corejava9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

        System.out.println("##########");

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        try {
            Date parseDate = sdf.parse("20191015020304");
            System.out.println(parseDate);
        } catch (ParseException e) {
            System.out.println(e);
        }
        // StringBuffer 是线程安全，比StringBuilder就慢一点点
        testStringBuilderAndStringBuffer();
    }

    private String readFirstLineFromFile(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        } catch (Exception e) {
            System.out.println("error" + e.toString());
        }
        return "";
    }

    private static void testStringBuilderAndStringBuffer() {
        //String
        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 50000; i++) {
            str += i;
        }
        System.out.println("sdf:" + str);
        long endTime = System.currentTimeMillis();
        System.out.println("String类型操作耗时" + (endTime - startTime) + "毫秒");

        //StringBuffer
        startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 50000; i++) {
            stringBuffer.append(i);
        }
        System.out.println("sdf" + stringBuffer.toString());
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer类型操作耗时" + (endTime - startTime) + "毫秒");

        //StringBuffer
        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 50000; i++) {
            stringBuilder.append(i);
        }
        System.out.println("sdf" + stringBuilder.toString());
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder类型操作耗时" + (endTime - startTime) + "毫秒");
    }
}

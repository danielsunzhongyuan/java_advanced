package com.zsun.java.tij.chapter4;

import java.util.Random;

public class SwitchPracticeEight {
    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());
        int i;
        outer:
        while (true) {
            i = random.nextInt(10);
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("less than 5: " + i);
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    System.out.println("larger than 4: " + i);
                    break;
                case 9:
                    System.out.println("magic 9");
                    break outer;
                default:
                    System.out.println("sdfsdf: " + i);
            }
        }
    }
}

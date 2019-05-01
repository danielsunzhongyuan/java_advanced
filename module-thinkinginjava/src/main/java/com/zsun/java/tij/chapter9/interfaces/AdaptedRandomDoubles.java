package com.zsun.java.tij.chapter9.interfaces;

import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * Created by zsun.
 * DateTime: 2019/05/01 18:46
 */
public class AdaptedRandomDoubles extends RandomDoubles implements Readable {
    private int count;

    public AdaptedRandomDoubles(int count) {
        this.count = count;
    }

    public int read(CharBuffer cb) {
        if (count-- == 0) {
            return -1;
        }
        String result = Double.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(new AdaptedRandomDoubles(7))) {
            while (s.hasNextDouble()) {
                System.out.println(s.nextDouble() + " ");
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e.toString());
        }
    }
}

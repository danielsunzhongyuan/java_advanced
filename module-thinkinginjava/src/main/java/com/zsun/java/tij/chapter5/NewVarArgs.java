package com.zsun.java.tij.chapter5;

public class NewVarArgs {
    static void printArray(Object... args) {
        for (Object object : args) {
            System.out.println(object + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Integer[47], new Float(3.4), new Double(1.11));
        printArray(47, 3.14F, 11111.11);
        printArray(new A(), new A(), new A());

        printArray((Object[]) new Integer[]{1, 2, 3, 4});
        printArray();

        for (String arg : args) {
            System.out.print(arg + " ");
        }
        System.out.println();
    }
}

class A {
}

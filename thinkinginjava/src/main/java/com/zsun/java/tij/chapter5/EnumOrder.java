package com.zsun.java.tij.chapter5;

enum Spiciness {
    NOT,
    MILD,
    MEDIUM,
    HOT,
    FLAMING,
}

public class EnumOrder {
    public static void main(String[] args) {
        Spiciness howHot = Spiciness.MEDIUM;
        System.out.println(howHot);

        for (Spiciness s : Spiciness.values()) {
            System.out.println(s + ", ordinal " + s.ordinal());
        }

        switch (howHot) {
            case NOT:
                System.out.println("not spicy at all.");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("a little spicy.");
                break;
            case HOT:
            case FLAMING:
                System.out.println("too hot.");
                break;
            default:
                System.out.println("not sure.");
        }
    }
}

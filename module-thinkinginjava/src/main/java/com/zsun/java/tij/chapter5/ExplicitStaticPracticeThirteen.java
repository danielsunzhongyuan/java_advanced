package com.zsun.java.tij.chapter5;

public class ExplicitStaticPracticeThirteen {
    static Cups cups1 = new Cups();
    static Cups cups2 = new Cups();

    public static void main(String[] args) {
        System.out.println("Inside main():");
    }
}

class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;

    static {
        cup1 = new Cup(1);
    }

    Cups() {
        System.out.println("Cups()");
    }
}

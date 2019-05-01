package com.zsun.java.tij.chapter7;

/**
 * Created by zsun.
 * DateTime: 2019/05/01 17:44
 */
public class CartoonPracticeFour {
    public static void main(String[] args) {
        Cartoon c = new Cartoon();
    }
}

class Art {
    Art() {
        System.out.println("Art constructor()");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor()");
    }
}

class Cartoon extends Drawing {
//    Cartoon() {
//        System.out.println("Cartoon constructor()");
//    }
}

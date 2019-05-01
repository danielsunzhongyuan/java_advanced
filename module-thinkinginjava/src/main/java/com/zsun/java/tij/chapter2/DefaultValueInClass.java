package com.zsun.java.tij.chapter2;

class DefaultValueInClass {
    Y y;
    int a;
    boolean b;
    double c;
    float d;
    char e;

    public static void main(String[] args) {
        /*
            int a default value:0
            boolean b default value:false
            double c default value:0.0
            float d default value:0.0
            char e default value:
            Y y default value:null
         */
        DefaultValueInClass x = new DefaultValueInClass();
        System.out.println("int a default value:" + x.a);
        System.out.println("boolean b default value:" + x.b);
        System.out.println("double c default value:" + x.c);
        System.out.println("float d default value:" + x.d);
        System.out.println("char e default value:" + x.e);
        System.out.println("Y y default value:" + x.y);
    }
}

class Y {
}

package com.zsun.java.tij.chapter9.interfaces.interfaceprocessor;

/**
 * Created by zsun.
 * DateTime: 2019/05/01 18:42
 */
public class Apply {
    public static void process(Processor p, Object s) {
        System.out.println("Using processor " + p.name());
        System.out.println(p.process(s));
    }
}

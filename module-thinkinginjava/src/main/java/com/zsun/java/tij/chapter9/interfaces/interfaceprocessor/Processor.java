package com.zsun.java.tij.chapter9.interfaces.interfaceprocessor;

/**
 * Created by zsun.
 * DateTime: 2019/05/01 18:38
 */
public interface Processor {
    String name();

    Object process(Object input);
}

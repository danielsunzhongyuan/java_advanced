package com.zsun.java.tij.chapter9.interfaces.filters;

/**
 * Created by zsun.
 * DateTime: 2019/05/01 18:34
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) {
        return input;
    }
}

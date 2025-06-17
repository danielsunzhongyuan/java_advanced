package com.zsun.java.tij.chapter9.interfaces.filters;

/**
 * Created by zsun.
 * DateTime: 2019/05/01 18:34
 */
public class Waveform {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Waveform{" +
            "id=" + id +
            '}';
    }
}

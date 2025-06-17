package com.zsun.java.tij.chapter9.interfaces.filters;

/**
 * Created by zsun.
 * DateTime: 2019/05/01 18:36
 */
public class HighPass extends Filter {
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}

package com.zsun.java.tij.chapter9.interfaces.filters;

/**
 * Created by zsun.
 * DateTime: 2019/05/01 18:37
 */
public class LowPass extends Filter {
    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}

package com.zsun.java.tij.chapter9.interfaces.filters;

/**
 * Created by zsun.
 * DateTime: 2019/05/01 18:33
 */
public class BandPass extends Filter {
    double lowCutoff;
    double highCutoff;

    public BandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        return input;
    }
}

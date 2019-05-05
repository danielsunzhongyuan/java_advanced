package com.zsun.java.tij.chapter10.innerclasses;

/**
 * Created by zsun.
 * DateTime: 2019/05/05 13:09
 */
public class Parcel7 {
    public Contents contents() {
        return new Contents() {
            private int i = 11;

            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 p = new Parcel7();
        Contents c = p.contents();
    }
}

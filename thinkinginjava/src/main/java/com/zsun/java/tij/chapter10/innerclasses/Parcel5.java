package com.zsun.java.tij.chapter10.innerclasses;

/**
 * Created by zsun.
 * DateTime: 2019/05/04 20:39
 */
public class Parcel5 {
    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }
}

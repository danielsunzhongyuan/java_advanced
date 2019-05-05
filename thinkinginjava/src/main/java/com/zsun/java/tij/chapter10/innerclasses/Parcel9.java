package com.zsun.java.tij.chapter10.innerclasses;

/**
 * Created by zsun.
 * DateTime: 2019/05/05 13:18
 */
public class Parcel9 {
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p = new Parcel9();
        Destination d = p.destination("Tasmania");
        System.out.println(d.readLabel());
    }
}

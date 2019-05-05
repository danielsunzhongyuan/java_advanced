package com.zsun.java.tij.chapter10.innerclasses;

/**
 * Created by zsun.
 * DateTime: 2019/05/05 13:15
 */
public class Parcel8 {
    public Wrapping wrapping(int x) {
        return new Wrapping(x) {
            public int value() {
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Wrapping w = p.wrapping(10);
        System.out.println(w.value());
    }
}

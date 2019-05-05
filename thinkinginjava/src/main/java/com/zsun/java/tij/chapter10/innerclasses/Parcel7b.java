package com.zsun.java.tij.chapter10.innerclasses;

/**
 * Created by zsun.
 * DateTime: 2019/05/05 13:11
 */
public class Parcel7b {
    class MyContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    public Contents contents() {
        return new MyContents();
    }

    public static void main(String[] args) {
        Parcel7b p = new Parcel7b();
        Contents c = p.contents();
    }
}

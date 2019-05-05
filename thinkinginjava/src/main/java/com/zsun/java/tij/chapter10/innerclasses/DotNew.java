package com.zsun.java.tij.chapter10.innerclasses;

/**
 * Created by zsun.
 * DateTime: 2019/05/04 19:36
 */
public class DotNew {
    public class Inner {
    }

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}

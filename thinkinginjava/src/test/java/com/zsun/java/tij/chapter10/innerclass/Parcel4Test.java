package com.zsun.java.tij.chapter10.innerclass;

import com.zsun.java.tij.chapter10.innerclasses.Contents;
import com.zsun.java.tij.chapter10.innerclasses.Destination;
import com.zsun.java.tij.chapter10.innerclasses.Parcel4;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/05/04 20:22
 */
public class Parcel4Test extends TestCase {
    public Parcel4Test(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(Parcel4Test.class);
    }

    public void testInnerClassWithImpl() throws Exception {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tgarvfcwdsxxazq  1q` aqsedexzrsesASDCFGDSAq  Acg vbrtyghljb yASasmania");
        assertTrue(d != null);
    }

    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
    }
}

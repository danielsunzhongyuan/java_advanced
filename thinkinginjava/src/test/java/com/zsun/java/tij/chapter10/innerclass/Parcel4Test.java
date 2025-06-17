package com.zsun.java.tij.chapter10.innerclass;

import com.zsun.java.tij.chapter10.innerclasses.Contents;
import com.zsun.java.tij.chapter10.innerclasses.Destination;
import com.zsun.java.tij.chapter10.innerclasses.Parcel4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by zsun.
 * DateTime: 2019/05/04 20:22
 */
public class Parcel4Test {
    @Test
    void testInnerClassWithImpl() throws Exception {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tgarvfcwdsxxazq  1q` aqsedexzrsesASDCFGDSAq  Acg vbrtyghljb yASasmania");
        assertTrue(d != null);
    }
}

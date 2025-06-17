package com.zsun.java.tij.chapter10.innerclass;

import com.zsun.java.tij.chapter10.innerclasses.Destination;
import com.zsun.java.tij.chapter10.innerclasses.Parcel5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by zsun.
 * DateTime: 2019/05/04 20:41
 */
public class Parcel5Test {
    @Test
    void testLocalInnerClass() throws Exception {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
        assertTrue(d != null);
    }
}

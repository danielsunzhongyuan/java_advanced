package com.zsun.java.tij.chapter10.innerclass;

import com.zsun.java.tij.chapter10.innerclasses.Destination;
import com.zsun.java.tij.chapter10.innerclasses.Parcel5;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/05/04 20:41
 */
public class Parcel5Test extends TestCase {
    public Parcel5Test(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(Parcel5Test.class);
    }

    public void testLocalInnerClass() throws Exception {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
        assertTrue(d != null);
    }
}

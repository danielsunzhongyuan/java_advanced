package com.zsun.java.tij.chapter10.innerclass;

import com.zsun.java.tij.chapter10.innerclasses.Parcel6;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/05/05 13:06
 */
public class Parcel6Test extends TestCase {
    public Parcel6Test(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(Parcel6Test.class);
    }

    public void testInnerClassInAnyRegion() throws Exception {
        Parcel6 p = new Parcel6();
        p.track();
    }
}

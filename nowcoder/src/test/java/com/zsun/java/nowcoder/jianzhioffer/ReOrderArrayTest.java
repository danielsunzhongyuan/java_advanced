package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 22:46
 */
public class ReOrderArrayTest extends TestCase {
    public ReOrderArrayTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(ReOrderArrayTest.class);
    }

    public void testReOrderArray1() {
        ReOrderArray r = new ReOrderArray();
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        r.reOrderArray(a);
        Assert.assertArrayEquals(new int[]{1, 3, 5, 7, 2, 4, 6}, a);
    }

    public void testReOrderArray2() {
        ReOrderArray r = new ReOrderArray();
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        r.reOrderArray2(a);
        Assert.assertArrayEquals(new int[]{1, 3, 5, 7, 2, 4, 6}, a);
    }

    public void testReOrderArray3() {
        ReOrderArray r = new ReOrderArray();
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        r.reOrderArray3(a);
        Assert.assertArrayEquals(new int[]{1, 7, 3, 5, 4, 6, 2}, a);
    }
}

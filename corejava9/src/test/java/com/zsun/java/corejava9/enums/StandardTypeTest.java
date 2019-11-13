package com.zsun.java.corejava9.enums;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author : zsun
 * @date : 2019/11/12 10:30
 */
public class StandardTypeTest extends TestCase {
    public StandardTypeTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(StandardTypeTest.class);
    }

    public void testAll() {
        StandardType all = StandardType.ALL;
        System.out.println(all.getLabel());
        System.out.println(all.getValue());
        System.out.println(all.ordinal());
        assertEquals(0, all.ordinal());
    }

    @org.junit.Test
    public void getLabel() {
    }

    @org.junit.Test
    public void getValue() {
    }

    @org.junit.Test
    public void testToString() {
    }
}

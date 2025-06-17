package com.zsun.java.corejava9.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author : zsun
 * @date : 2019/11/12 10:30
 */
public class StandardTypeTest {

    @Test
    public void testAll() {
        StandardType all = StandardType.ALL;
        System.out.println(all.getLabel());
        System.out.println(all.getValue());
        System.out.println(all.ordinal());
        assertEquals(0, all.ordinal());
    }

    @Test
    public void getLabel() {
    }

    @Test
    public void getValue() {
    }

    @Test
    public void testToString() {
    }
}

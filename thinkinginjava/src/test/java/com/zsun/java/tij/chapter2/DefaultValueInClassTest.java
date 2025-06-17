package com.zsun.java.tij.chapter2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Created by zsun.
 * DateTime: 2019/07/04 10:21
 *
 * @author zsun
 */
public class DefaultValueInClassTest {
    @Test
    public void test() {
        DefaultValueInClass defaultValueInClass = new DefaultValueInClass();
        assertEquals(0, defaultValueInClass.a);
        assertFalse(defaultValueInClass.b);
        assertEquals(0.0, defaultValueInClass.c);
        assertEquals(0.0, defaultValueInClass.d, 0.0001f);
        assertEquals(0x00, defaultValueInClass.e);
        assertNull(defaultValueInClass.y);
    }
}

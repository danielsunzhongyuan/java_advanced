package com.zsun.java.tij.chapter2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/07/04 10:21
 *
 * @author zsun
 */
public class DefaultValueInClassTest extends TestCase {
    public DefaultValueInClassTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(DefaultValueInClassTest.class);
    }

    public void test() {
        DefaultValueInClass defaultValueInClass = new DefaultValueInClass();
        assertEquals("int a default value should be 0", 0, defaultValueInClass.a);
        assertFalse("boolean b default value should be false", defaultValueInClass.b);
        assertEquals("double c default value should be 0.0", 0.0, defaultValueInClass.c);
        assertEquals("float d default value should be 0.0", 0.0, defaultValueInClass.d, 0.0001f);
        assertEquals("char e default value should be 0x00", 0x00, defaultValueInClass.e);
        assertNull("Class Y default value should be null", defaultValueInClass.y);
    }
}

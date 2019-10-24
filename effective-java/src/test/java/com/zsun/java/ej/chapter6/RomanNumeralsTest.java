package com.zsun.java.ej.chapter6;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/10/24 19:57
 *
 * @author zsun
 */
public class RomanNumeralsTest extends TestCase {
    public RomanNumeralsTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(RomanNumeralsTest.class);
    }

    public void testEmpty() {
        assertFalse("空值不符合罗马数字", RomanNumerals.isRomanNumeral(null));
        assertFalse("空值不符合罗马数字", RomanNumerals.isRomanNumeral(""));
    }

    public void testNormal() {
        assertTrue(RomanNumerals.isRomanNumeral("I"));
        assertTrue(RomanNumerals.isRomanNumeral("II"));
        assertTrue(RomanNumerals.isRomanNumeral("III"));
        assertTrue(RomanNumerals.isRomanNumeral("IV"));
        assertTrue(RomanNumerals.isRomanNumeral("V"));
        assertTrue(RomanNumerals.isRomanNumeral("VI"));
        assertTrue(RomanNumerals.isRomanNumeral("VII"));
        assertTrue(RomanNumerals.isRomanNumeral("VIII"));
        assertTrue(RomanNumerals.isRomanNumeral("IX"));
        assertTrue(RomanNumerals.isRomanNumeral("X"));
    }

    public void testFail() {
        assertFalse(RomanNumerals.isRomanNumeral("IIII"));
        assertFalse(RomanNumerals.isRomanNumeral("ABC"));
        assertFalse(RomanNumerals.isRomanNumeral("VIIII"));
        assertFalse(RomanNumerals.isRomanNumeral("IIX"));
    }
}

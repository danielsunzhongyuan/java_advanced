package com.zsun.java.ej.chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by zsun.
 * DateTime: 2019/10/24 19:57
 *
 * @author zsun
 */
public class RomanNumeralsTest {
    @Test
    public void testEmpty() {
        assertFalse(RomanNumerals.isRomanNumeral(null));
        assertFalse(RomanNumerals.isRomanNumeral(""));
    }

    @Test
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

    @Test
    public void testFail() {
        assertFalse(RomanNumerals.isRomanNumeral("IIII"));
        assertFalse(RomanNumerals.isRomanNumeral("ABC"));
        assertFalse(RomanNumerals.isRomanNumeral("VIIII"));
        assertFalse(RomanNumerals.isRomanNumeral("IIX"));
    }
}

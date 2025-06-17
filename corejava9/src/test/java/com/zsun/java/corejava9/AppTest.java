package com.zsun.java.corejava9;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testApp() {
        App a = new App();
        String s = "jdbc:oracle:thin:@//172.22.1.85:1521/orc";
        Matcher matcher = a.pattern.matcher(s);
        assertTrue(matcher.find());

        s = "jdbc:oracle:thin:@172.22.1.85:1521/orc";
        matcher = a.pattern.matcher(s);
        assertFalse(matcher.find());

        System.out.println("sss");
    }
}

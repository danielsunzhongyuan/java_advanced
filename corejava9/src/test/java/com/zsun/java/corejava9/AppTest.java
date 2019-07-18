package com.zsun.java.corejava9;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.regex.Matcher;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
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

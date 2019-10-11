package com.zsun.java.utils;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

/**
 * Created by sunzhongyuan.
 * DateTime: 2019/07/26 15:31
 *
 * @author sunzhongyuan
 */
public class StringUtilsTest extends TestCase {
    public StringUtilsTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(StringUtilsTest.class);
    }

    public void testSplitVersion() {
        String version = "1.2.3";
        Assert.assertArrayEquals(new String[]{version}, StringUtils.splitVersion(version, 1));

        Assert.assertArrayEquals(new String[]{"1", "2.3"}, StringUtils.splitVersion(version, 2));
    }
}

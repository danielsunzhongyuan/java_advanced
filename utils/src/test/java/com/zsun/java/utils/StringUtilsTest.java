package com.zsun.java.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Created by sunzhongyuan.
 * DateTime: 2019/07/26 15:31
 *
 * @author sunzhongyuan
 */
public class StringUtilsTest {
    @Test
    public void testSplitVersion() {
        String version = "1.2.3";
        assertArrayEquals(new String[]{version}, StringUtils.splitVersion(version, 1));

        assertArrayEquals(new String[]{"1", "2.3"}, StringUtils.splitVersion(version, 2));
    }
}

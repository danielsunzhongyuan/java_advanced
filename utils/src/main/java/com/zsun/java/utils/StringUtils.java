package com.zsun.java.utils;

/**
 * Created by sunzhongyuan.
 * DateTime: 2019/07/26 15:29
 *
 * @author sunzhongyuan
 */
public class StringUtils {
    public static String[] splitVersion(String version, int number) {
        if (number <= 1) {
            return new String[]{version};
        }
        return version.split("\\.", 2);
    }
}

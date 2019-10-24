package com.zsun.java.ej.chapter6;

import java.util.regex.Pattern;

/**
 * Created by zsun.
 * DateTime: 2019/10/24 19:54
 *
 * @author zsun
 */
public class RomanNumerals {
    /**
     * Pattern 是不变且可以重复使用的
     * 这比直接使用 s.matches("pattern") 更好
     */
    private static final Pattern ROMAN = Pattern.compile(
        "^(?=.)M*(C[MD]|D?C{0,3})"
            + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$"
    );

    public static boolean isRomanNumeral(String s) {
        return s != null && !"".equals(s) && ROMAN.matcher(s).matches();
    }
}

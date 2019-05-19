package com.zsun.java.nowcoder.jianzhioffer;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 14:57
 */
public class ReplaceWhitespaceWithPercent20 {
    public String replaceSpace(StringBuffer str) {
        int length = str.length();
        if (length <= 0) {
            return "";
        }
        StringBuffer ret = new StringBuffer(length);
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                ret.append("%20");
            } else {
                ret.append(str.charAt(i));
            }
        }
        return ret.toString();
    }
}

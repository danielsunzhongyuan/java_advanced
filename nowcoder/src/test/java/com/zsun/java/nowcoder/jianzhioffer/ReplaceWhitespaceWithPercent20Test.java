package com.zsun.java.nowcoder.jianzhioffer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 16:28
 */
public class ReplaceWhitespaceWithPercent20Test {
    private ReplaceWhitespaceWithPercent20 solution = new ReplaceWhitespaceWithPercent20();

    @Test
    public void testReplace() {
        StringBuffer str = new StringBuffer("asd sdf afs");
        assertEquals("asd%20sdf%20afs", solution.replaceSpace(str));
    }

    @Test
    public void testNull() {
        StringBuffer str = new StringBuffer();
        assertEquals("", solution.replaceSpace(str));
    }
}

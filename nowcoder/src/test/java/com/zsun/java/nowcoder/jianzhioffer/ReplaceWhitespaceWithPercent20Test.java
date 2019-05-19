package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 16:28
 */
public class ReplaceWhitespaceWithPercent20Test extends TestCase {
    public ReplaceWhitespaceWithPercent20Test(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(ReplaceWhitespaceWithPercent20Test.class);
    }

    public void testReplace() {
        StringBuffer str = new StringBuffer("asd sdf afs");
        ReplaceWhitespaceWithPercent20 r = new ReplaceWhitespaceWithPercent20();
        assertTrue("should be \"asd%20sdf%20afs\"", "asd%20sdf%20afs".equals(r.replaceSpace(str)));
    }
}

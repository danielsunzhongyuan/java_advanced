package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 17:04
 */
public class PrintLinkListTest extends TestCase {
    public PrintLinkListTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(PrintLinkListTest.class);
    }

    public void testPrintFromTailToHead() {
        ListNode header = new ListNode(1);
        assertTrue("should be 1", new PrintLinkList()
            .printListFromTailToHead(header).get(0) == 1);
    }
}

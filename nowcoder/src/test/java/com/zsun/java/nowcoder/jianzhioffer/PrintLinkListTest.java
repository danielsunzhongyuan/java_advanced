package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 17:04
 */
public class PrintLinkListTest extends TestCase {
    private PrintLinkList solution = new PrintLinkList();

    public PrintLinkListTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(PrintLinkListTest.class);
    }

    public void testPrintFromTailToHead() {
        ListNode header = new ListNode(1);
        assertTrue("should be 1", solution.printListFromTailToHead(header).get(0) == 1);
    }

    public void testNull() {
        ListNode header = null;
        assertEquals(0, solution.printListFromTailToHead(header).size());
    }
}

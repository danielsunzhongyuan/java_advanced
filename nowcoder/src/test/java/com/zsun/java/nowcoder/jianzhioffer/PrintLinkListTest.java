package com.zsun.java.nowcoder.jianzhioffer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by zsun.
 * DateTime: 2019/05/19 17:04
 */
public class PrintLinkListTest {
    private PrintLinkList solution = new PrintLinkList();

    @Test
    public void testPrintFromTailToHead() {
        ListNode header = new ListNode(1);
        assertEquals(1, (int) solution.printListFromTailToHead(header).get(0));
    }

    @Test
    public void testNull() {
        ListNode header = null;
        assertEquals(0, solution.printListFromTailToHead(header).size());
    }
}

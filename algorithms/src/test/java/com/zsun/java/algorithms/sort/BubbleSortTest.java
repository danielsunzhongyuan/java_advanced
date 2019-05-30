package com.zsun.java.algorithms.sort;

import junit.framework.Test;
import junit.framework.TestSuite;

public class BubbleSortTest extends SortTest {
    private BubbleSort sorter = new BubbleSort();

    public BubbleSortTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(BubbleSortTest.class);
    }

    public void test() {
        run(sorter);
    }
}

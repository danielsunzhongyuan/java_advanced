package com.zsun.java.algorithms.sort;

import junit.framework.Test;
import junit.framework.TestSuite;

public class SelectSortTest extends SortTest {
    private SelectSort sorter = new SelectSort();

    public SelectSortTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(SelectSortTest.class);
    }

    public void test() {
        run(sorter);
    }
}

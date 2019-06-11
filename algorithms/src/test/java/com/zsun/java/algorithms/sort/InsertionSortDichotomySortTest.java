package com.zsun.java.algorithms.sort;

import junit.framework.Test;
import junit.framework.TestSuite;

public class InsertionSortDichotomySortTest extends SortTest {
    private InsertionSortDichotomySort sorter = new InsertionSortDichotomySort();

    public InsertionSortDichotomySortTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(InsertionSortDichotomySortTest.class);
    }

    public void test() {
        run(sorter);
    }
}

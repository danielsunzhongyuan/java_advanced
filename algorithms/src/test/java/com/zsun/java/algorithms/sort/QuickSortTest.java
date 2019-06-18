package com.zsun.java.algorithms.sort;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/06/18 20:21
 *
 * @author zsun
 */
public class QuickSortTest extends SortTest {
    private Sort sorter = new QuickSort();

    public QuickSortTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(QuickSortTest.class);
    }

    public void test() {
        run(sorter);
    }
}

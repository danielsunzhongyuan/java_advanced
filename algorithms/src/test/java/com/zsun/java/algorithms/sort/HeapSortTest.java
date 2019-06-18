package com.zsun.java.algorithms.sort;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/06/13 20:21
 *
 * @author zsun
 */
public class HeapSortTest extends SortTest {
    private HeapSort sorter = new HeapSort();

    public HeapSortTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(HeapSortTest.class);
    }

    public void test() {
        run(sorter);
    }
}

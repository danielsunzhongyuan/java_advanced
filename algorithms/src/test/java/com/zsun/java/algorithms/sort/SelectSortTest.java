package com.zsun.java.algorithms.sort;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/05/23 00:37
 *
 * @author zsun
 */
public class SelectSortTest extends SortTest {
    private Sort sorter = new SelectSort();

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

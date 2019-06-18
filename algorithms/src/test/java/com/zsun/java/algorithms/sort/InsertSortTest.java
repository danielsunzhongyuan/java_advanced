package com.zsun.java.algorithms.sort;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/05/23 00:37
 *
 * @author zsun
 */
public class InsertSortTest extends SortTest {
    private Sort sorter = new InsertSort();

    public InsertSortTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(InsertSortTest.class);
    }

    public void test() {
        run(sorter);
    }
}

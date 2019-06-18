package com.zsun.java.algorithms.sort;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/06/13 20:21
 *
 * @author zsun
 */
public class ShellSortTest extends SortTest {
    private Sort sorter = new ShellSort();

    public ShellSortTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(ShellSortTest.class);
    }

    public void test() {
        run(sorter);
    }
}

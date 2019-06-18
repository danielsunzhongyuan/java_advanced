package com.zsun.java.algorithms.sort;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/06/18 19:31
 *
 * @author zsun
 */
public class MergeSortRecursionTest extends SortTest {
    private Sort sorter = new MergeSortRecursion();

    public MergeSortRecursionTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(MergeSortRecursionTest.class);
    }

    public void test() {
        run(sorter);
    }
}

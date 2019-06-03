package com.zsun.java.algorithms.sort;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/05/23 00:37
 *
 * @author zsun
 */
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

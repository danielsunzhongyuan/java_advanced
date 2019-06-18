package com.zsun.java.algorithms.sort;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/06/18 19:31
 *
 * @author zsun
 */
public class MergeSortIterationTest extends SortTest {
    private MergeSortIteration sorter = new MergeSortIteration();

    public MergeSortIterationTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(MergeSortIterationTest.class);
    }

    public void test() {
        run(sorter);
    }
}

package com.zsun.java.algorithms.sort;

import org.junit.jupiter.api.Test;

/**
 * Created by zsun.
 * DateTime: 2019/06/18 19:31
 *
 * @author zsun
 */
public class MergeSortIterationTest extends SortTest {
    private Sort sorter = new MergeSortIteration();

    @Test
    public void test() {
        run(sorter);
    }
}

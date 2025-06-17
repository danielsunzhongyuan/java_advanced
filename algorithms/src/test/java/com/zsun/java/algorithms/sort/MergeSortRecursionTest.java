package com.zsun.java.algorithms.sort;

import org.junit.jupiter.api.Test;

/**
 * Created by zsun.
 * DateTime: 2019/06/18 19:31
 *
 * @author zsun
 */
public class MergeSortRecursionTest extends SortTest {
    private Sort sorter = new MergeSortRecursion();

    @Test
    public void test() {
        run(sorter);
    }
}

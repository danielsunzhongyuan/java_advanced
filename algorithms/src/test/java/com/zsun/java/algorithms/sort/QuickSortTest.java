package com.zsun.java.algorithms.sort;

import org.junit.jupiter.api.Test;

/**
 * Created by zsun.
 * DateTime: 2019/06/18 20:21
 *
 * @author zsun
 */
public class QuickSortTest extends SortTest {
    private Sort sorter = new QuickSort();

    @Test
    public void test() {
        run(sorter);
    }
}

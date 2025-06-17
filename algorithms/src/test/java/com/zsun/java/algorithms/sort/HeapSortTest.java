package com.zsun.java.algorithms.sort;

import org.junit.jupiter.api.Test;

/**
 * Created by zsun.
 * DateTime: 2019/06/13 20:21
 *
 * @author zsun
 */
public class HeapSortTest extends SortTest {
    private Sort sorter = new HeapSort();

    @Test
    public void test() {
        run(sorter);
    }
}

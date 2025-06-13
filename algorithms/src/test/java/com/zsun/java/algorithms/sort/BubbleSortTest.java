package com.zsun.java.algorithms.sort;

import org.junit.jupiter.api.Test;

/**
 * Created by zsun.
 * DateTime: 2019/05/23 00:37
 *
 * @author zsun
 */
public class BubbleSortTest extends SortTest {
    private Sort sorter = new BubbleSort();

    @Test
    public void test() {
        run(sorter);
    }
}

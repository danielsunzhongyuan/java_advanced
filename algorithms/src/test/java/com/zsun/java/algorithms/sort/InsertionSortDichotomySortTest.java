package com.zsun.java.algorithms.sort;

import org.junit.jupiter.api.Test;

public class InsertionSortDichotomySortTest extends SortTest {
    private Sort sorter = new InsertionSortDichotomySort();

    @Test
    public void test() {
        run(sorter);
    }
}

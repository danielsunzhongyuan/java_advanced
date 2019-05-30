package com.zsun.java.algorithms.sort;

import junit.framework.Test;
import junit.framework.TestSuite;

public class CocktailSortTest extends SortTest {
    private CocktailSort sorter = new CocktailSort();

    public CocktailSortTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(CocktailSortTest.class);
    }

    public void test() {
        run(sorter);
    }
}

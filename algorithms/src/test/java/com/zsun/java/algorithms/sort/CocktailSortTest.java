package com.zsun.java.algorithms.sort;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Created by zsun.
 * DateTime: 2019/05/23 00:37
 *
 * @author zsun
 */
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

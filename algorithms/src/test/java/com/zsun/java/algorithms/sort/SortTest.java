package com.zsun.java.algorithms.sort;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortTest {
    private Sort sorter;

    private Comparator<Integer> comparator = new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 < o2 ? -1 : (o1 > o2 ? 1 : 0);
        }
    };

    private Comparator<String> comparatorString = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    };

    /**
     * an empty test is necessary
     */
    public void test() {
        assertTrue(true);
    }

    protected void run(Sort sorter) {
        this.sorter = sorter;
        tNull();
        tEmpty();
        tOneElement();
        tTwoElements();
        tThreeElements();
        tFourElements();
        tSorted();
        tSortedReverse();
        tRandom();
        tString();
    }

    private void tNull() {
        Integer[] array = null;
        sorter.sort(array, comparator);
        assertNull(array);
    }

    private void tEmpty() {
        Integer[] array = new Integer[]{};
        sorter.sort(array, comparator);
        assertEquals(0, array.length);
    }

    private void tOneElement() {
        Integer[] array = new Integer[]{1};
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1}, array);
    }

    private void tTwoElements() {
        Integer[] array = new Integer[]{2, 1};
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2}, array);
    }

    private void tThreeElements() {
        Integer[] array = new Integer[]{2, 1, -3};
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{-3, 1, 2}, array);
    }

    private void tFourElements() {
        Integer[] array = new Integer[]{2, 1, -3, 0, 89};
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{-3, 0, 1, 2, 89}, array);
    }

    private void tSorted() {
        Integer[] array = new Integer[]{1, 2, 3, 4, 5};
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array);
    }

    private void tSortedReverse() {
        Integer[] array = new Integer[]{10, 9, 8, 7, 6};
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{6, 7, 8, 9, 10}, array);
    }

    private void tRandom() {
        Integer[] array = new Integer[]{34, 13, 24, 3, 23, 23, 435, 45, 42, 233, -1, 2, -10};
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{-10, -1, 2, 3, 13, 23, 23, 24, 34, 42, 45, 233, 435},
            array);

        array = new Integer[]{9, 2, 4, 1, 3, 2, 5, 7, 6, 9};
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 2, 3, 4, 5, 6, 7, 9, 9}, array);
    }

    private void tString() {
        String[] array = new String[]{"oiu", "ower", "xcv", "abcd", "abd", "dfs", "abc", "dfklsajkls"};
        sorter.sort(array, comparatorString);
        assertArrayEquals(new String[]{"abc", "abcd", "abd", "dfklsajkls", "dfs", "oiu", "ower", "xcv"}, array);
    }
}

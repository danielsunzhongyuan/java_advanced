package com.zsun.java.algorithms.sort;

import java.util.Comparator;

/**
 * Created by zsun.
 * DateTime: 2019/05/23 00:32
 *
 * @author zsun
 */
public interface Sort<T> {
    /**
     * 对数组进行排序，并修改原数组
     *
     * @param array      待排序的数组
     * @param comparator 用于比较的方法
     */
    void sort(T[] array, Comparator<T> comparator);

    /*
     * 对链表进行排序，并修改原链表
     *
     * @param list       待排序的链表
     * @param comparator 用于比较的方法
     * void sort(List<T> list, Comparator<T> comparator);
     */
}

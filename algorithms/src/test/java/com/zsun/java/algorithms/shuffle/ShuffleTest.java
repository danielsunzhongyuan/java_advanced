package com.zsun.java.algorithms.shuffle;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author : zsun
 * @date : 2020/01/14 19:06
 */
public class ShuffleTest extends TestCase {
    private SelectFromCurrent shuffle1 = new SelectFromCurrent();
    private SelectFromBeginning shuffle2 = new SelectFromBeginning();

    public ShuffleTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(ShuffleTest.class);
    }

    public void testShuffle1() {
        System.out.println("从当前位置到最后选一个，然后交换");
        final int n = 7;
        int[] a = new int[n];
        int[][] metrix = new int[n][n];
        for (int i = 0; i < 7000000; i++) {
            for (int k = 0; k < n; k++) {
                a[k] = k;
            }
            shuffle1.shuffle(a);
            for (int j = 0; j < n; j++) {
                metrix[j][a[j]]++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(metrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void testShuffle2() {
        System.out.println("从头到最后选一个，然后交换");
        final int n = 7;
        int[] a = new int[n];
        int[][] matrix = new int[n][n];
        for (int i = 0; i < 7000000; i++) {
            for (int k = 0; k < n; k++) {
                a[k] = k;
            }
            shuffle2.shuffle(a);
            for (int j = 0; j < n; j++) {
                matrix[j][a[j]]++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

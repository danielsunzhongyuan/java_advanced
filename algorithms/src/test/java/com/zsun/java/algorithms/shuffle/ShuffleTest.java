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
        int N = 7;
        int[] a = new int[N];
        int[][] metrix = new int[N][N];
        for (int i = 0; i < 7000000; i++) {
            for (int k = 0; k < N; k++) {
                a[k] = k;
            }
            shuffle1.shuffle(a);
            for (int j = 0; j < N; j++) {
                metrix[j][a[j]]++;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(metrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void testShuffle2() {
        System.out.println("从头到最后选一个，然后交换");
        int N = 7;
        int[] a = new int[N];
        int[][] metrix = new int[N][N];
        for (int i = 0; i < 7000000; i++) {
            for (int k = 0; k < N; k++) {
                a[k] = k;
            }
            shuffle2.shuffle(a);
            for (int j = 0; j < N; j++) {
                metrix[j][a[j]]++;
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(metrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

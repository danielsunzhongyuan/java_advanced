package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

/**
 * Created by zsun.
 * DateTime: 2019/05/20 20:19
 */
public class PrintMatrixClockwiseTest extends TestCase {
    private PrintMatrixClockwise solution;

    public PrintMatrixClockwiseTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(PrintMatrixClockwiseTest.class);
    }

    @Override
    protected void setUp() throws Exception {
        solution = new PrintMatrixClockwise();
    }

    public void testEmpty() {
        Assert.assertArrayEquals(new Integer[]{},
            solution.printMatrix(null).toArray());

        Assert.assertArrayEquals(new Integer[]{},
            solution.printMatrix(new int[][]{}).toArray());

        int[] x = new int[]{};
        Assert.assertArrayEquals(new Integer[]{},
            solution.printMatrix(new int[][]{x}).toArray());
    }

    public void testNormal() {
        int[][] matrix = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10},
            solution.printMatrix(matrix).toArray());
    }

    public void testOneColumn() {
        int[][] matrix = new int[][]{
            {1}, {2}, {3}, {4}, {5}
        };
        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5},
            solution.printMatrix(matrix).toArray());
    }

    public void testOneRow() {
        int[][] matrix = new int[][]{
            {1, 2, 3, 4, 5}
        };
        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4, 5},
            solution.printMatrix(matrix).toArray());
    }
}

package com.zsun.java.nowcoder.jianzhioffer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;

/**
 * Created by qzou.
 * DateTime: 2019-07-03 00:49
 *
 * @author qzou
 */
public class GetLeastKNumbersTest extends TestCase {
    private GetLeastKNumbers solution = new GetLeastKNumbers();

    public GetLeastKNumbersTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(GetLeastKNumbersTest.class);
    }

    public void testInvalid() {
        Assert.assertArrayEquals(new Integer[]{}, solution.findKNumbers(null, 0).toArray());
        Assert.assertArrayEquals(new Integer[]{}, solution.findKNumbers(new int[]{}, 0).toArray());
        int[] array = new int[]{4, 1, 3, 2};
        Assert.assertArrayEquals(new Integer[]{}, solution.findKNumbers(array, 0).toArray());
        Assert.assertArrayEquals(new Integer[]{}, solution.findKNumbers(array, 5).toArray());
    }

    public void testNormal() {
        int[] array = new int[]{4, 1, 3, 2};
        Assert.assertArrayEquals(new Integer[]{1}, solution.findKNumbers(array, 1).toArray());
        Assert.assertArrayEquals(new Integer[]{1, 2}, solution.findKNumbers(array, 2).toArray());
        Assert.assertArrayEquals(new Integer[]{1, 2, 3}, solution.findKNumbers(array, 3).toArray());
        Assert.assertArrayEquals(new Integer[]{1, 2, 3, 4}, solution.findKNumbers(array, 4).toArray());
    }
}

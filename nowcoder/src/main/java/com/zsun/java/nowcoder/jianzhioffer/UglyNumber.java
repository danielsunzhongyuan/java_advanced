package com.zsun.java.nowcoder.jianzhioffer;

/**
 * Created by sunzhongyuan.
 * DateTime: 2019/07/18 19:28
 *
 * @author sunzhongyuan
 */
public class UglyNumber {
    public int findNthUglyNumber(int n) {
        if (n <= 0) {
            return 0;
        }
        int indexTwo = 0;
        int indexThree = 0;
        int indexFive = 0;

        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;
        for (int i = 1; i < n; i++) {
            uglyNumbers[i] = Math.min(uglyNumbers[indexTwo] * 2,
                Math.min(uglyNumbers[indexThree] * 3, uglyNumbers[indexFive] * 5));
            if (uglyNumbers[i] == uglyNumbers[indexTwo] * 2) {
                indexTwo++;
            }
            if (uglyNumbers[i] == uglyNumbers[indexThree] * 3) {
                indexThree++;
            }
            if (uglyNumbers[i] == uglyNumbers[indexFive] * 5) {
                indexFive++;
            }
        }
        return uglyNumbers[n - 1];
    }
}

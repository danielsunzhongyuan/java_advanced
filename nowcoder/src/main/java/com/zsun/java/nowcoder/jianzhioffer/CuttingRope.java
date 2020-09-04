package com.zsun.java.nowcoder.jianzhioffer;

/**
 * @author : zsun
 * @date : 2020/09/04 20:20
 */
public class CuttingRope {
    //    public int cut(int n) {
//        int[] dp = new int[n + 1];
//        for (int i = 0; i < n + 1; i++) {
//            dp[i] = 1;
//        }
//        for (int i = 2; i < n + 1; i++) {
//            for (int j = 1; j < i / 2 + 1; j++) {
//                dp[i] = Math.max(dp[i], Math.max(j, dp[j]) * Math.max((i - j), dp[i - j]));
//            }
//        }
//        return dp[n];
//    }

//    public int cut(int n) {
//        if (n < 4) {
//            return n - 1;
//        }
//        int result = 1;
//        while (n > 4) {
//            result *= 3;
//            n -= 3;
//        }
//        return result * n;
//    }

    public int cut(int n) {
        if (n < 4) {
            return n - 1;
        }
        int result = 1;
        int power = n / 3;
        int remainder = n % 3;
        if (remainder == 0) {
            return (int) Math.pow(3, power);
        } else if (remainder == 1) {
            return (int) Math.pow(3, power - 1) * 4;
        }
        return (int) Math.pow(3, power) * 2;
    }

    public static void main(String[] args) {
        CuttingRope cuttingRope = new CuttingRope();
        for (int i = 1; i < 13; i++) {
            System.out.println(cuttingRope.cut(i));
        }
    }
}

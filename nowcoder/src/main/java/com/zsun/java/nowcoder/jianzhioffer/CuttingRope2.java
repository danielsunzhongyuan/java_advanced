package com.zsun.java.nowcoder.jianzhioffer;

/**
 * @author : zsun
 * @date : 2020/09/04 20:58
 */
public class CuttingRope2 {
    public int cut(int n) {
        if (n < 4) {
            return n - 1;
        }
        int p = n / 3;
        int remainder = n % 3;
        if (remainder == 0) {
            return (int) (power(3, p, 1000000007));
        } else if (remainder == 1) {
            return (int) (power(3, p - 1, 1000000007) * 4 % 1000000007);
        }
        return (int) (power(3, p, 1000000007) * 2 % 1000000007);
    }

    private double power(int base, int power, int modulus) {
        if (power == 0) {
            return 1;
        }
        if (power == 1) {
            return base % modulus;
        }
        if (base > modulus) {
            base %= modulus;
        }
        if (power % 2 == 0) {
            return power(base * base, power / 2, modulus);
        } else {
            return (power(base * base, power / 2, modulus) * base) % modulus;
        }
    }

    public static void main(String[] args) {
        CuttingRope2 cuttingRope = new CuttingRope2();
        for (int i = 1; i < 121; i++) {
            System.out.println(i + " " + cuttingRope.cut(i));
        }
    }
}

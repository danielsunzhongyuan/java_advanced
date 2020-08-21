package com.zsun.java.algorithms.arithmetic;

/**
 * @author : zsun
 * @date : 2020/08/21 11:18
 */
public class FastPower {
    /**
     * @param base  底数
     * @param power 幂次
     * @return 后两位数
     */
    public static long calculate(long base, long power) throws Exception {
        if (power < 0) {
            throw new Exception("power should not less than zero");
        }
        if (power == 0) {
            if (base == 0) {
                throw new Exception("base & power can not be zero at the same time");
            }
            return 1;
        } else if (power == 1) {
            return base % 100;
        }
        if (base > 100) {
            base = base % 100;
        }
        if (power % 2 == 0) {
            return calculate(base * base, power / 2);
        } else {
            return (calculate(base * base, power / 2) * base) % 100;
        }
    }

    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        System.out.println(FastPower.calculate(20200819L, 2020081920200819L));
        long end = System.currentTimeMillis();
        System.out.println("using " + (end - start) + " ms");
    }
}

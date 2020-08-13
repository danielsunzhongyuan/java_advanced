package com.zsun.java.nowcoder.questions;

/**
 * @author : zsun
 * @date : 2020/08/13 21:34
 *
 * 集合 ss 中有整数 1 到 n，牛牛想从中挑几个整数组成一个新的集合。
 *
 * 现在牛妹给牛牛加了 m 个限制 ，每个限制包含两个整数 u 和 v (u!=v)，且 u 和 v 不能同时出现在新集合中 。
 *
 * 请问牛牛能组成的新集合多少种。
 *
 * 可以选 0 个数
 *
 * 输入
 * 第一个参数为 n。
 *
 * 第二个参数为 m。
 *
 * 第三个参数为 m 对 (u, v) 。
 *
 * 1 < n <= 20, 1 <= m <= 400, 1 <= u,v <= n
 *
 * 返回
 *
 * 一个整数，即新集合的种类数。
 *
 * 示例1
 * 输入
 * 3,2,[(1,2),(2,3)]
 * 输出
 * 5
 * 说明
 * 当 n = 3 时，共有 8 个子集，当加上限制 (1, 2), (2, 3) 后，合法的子集有 [], [1], [2], [3], [1, 3] 共 5 个
 */
public class QuestionThree {
    public int solve (int n, int m, Point[] limit) {
        // write code here

    }
}

class Point {
    int x;
    int y;
}

package com.zsun.java.nowcoder.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author : zsun
 * @date : 2020/08/13 21:34
 * <p>
 * 集合 s 中有整数 1 到 n，牛牛想从中挑几个整数组成一个新的集合。
 * <p>
 * 现在牛妹给牛牛加了 m 个限制 ，每个限制包含两个整数 u 和 v (u!=v)，且 u 和 v 不能同时出现在新集合中 。
 * <p>
 * 请问牛牛能组成的新集合多少种。
 * <p>
 * 可以选 0 个数
 * <p>
 * 输入
 * 第一个参数为 n。
 * <p>
 * 第二个参数为 m。
 * <p>
 * 第三个参数为 m 对 (u, v) 。
 * <p>
 * 1 < n <= 20, 1 <= m <= 400, 1 <= u,v <= n
 * <p>
 * 返回
 * <p>
 * 一个整数，即新集合的种类数。
 * <p>
 * 示例1
 * 输入
 * 3,2,[(1,2),(2,3)]
 * 输出
 * 5
 * 说明
 * 当 n = 3 时，共有 8 个子集，当加上限制 (1, 2), (2, 3) 后，合法的子集有 [], [1], [2], [3], [1, 3] 共 5 个
 */
public class QuestionThree {
    public int solve(int n, int m, Point[] limit) {
        // write code here
        Map<Integer, Set<Integer>> notPermitted = initNotPermitted(limit);
        System.out.println(notPermitted);
        List<List<Integer>> newCollection = new ArrayList<>();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = i + 1;
        }
        List<Integer> path = new LinkedList<>();
        dp(newCollection, path, s, 0, notPermitted);
        System.out.println(newCollection);
        return newCollection.size();
    }

    private void dp(List<List<Integer>> newCollection, List<Integer> path, int[] s, int start, Map<Integer, Set<Integer>> notPermitted) {
        if (path.isEmpty()) {
            newCollection.add(new ArrayList<>());
        } else {
            List<Integer> tmp = new ArrayList<>();
            path.forEach(k -> {
                tmp.add(k);
            });
            newCollection.add(tmp);
        }

        Set<Integer> currentTotalNotPermitted = new HashSet<>();
        path.forEach(k -> {
            if (notPermitted.get(k) != null) {
                currentTotalNotPermitted.addAll(notPermitted.get(k));
            }
        });
        for (int i = start; i < s.length; i++) {
            if (path.contains(s[i]) || currentTotalNotPermitted.contains(s[i])) {
                continue;
            }

            path.add(s[i]);
            dp(newCollection, path, s, i + 1, notPermitted);
            path.remove(path.size() - 1);
        }
    }

    private Map<Integer, Set<Integer>> initNotPermitted(Point[] limit) {
        Map<Integer, Set<Integer>> result = new HashMap<>();
        for (Point point : limit) {
            if (result.containsKey(point.x)) {
                result.get(point.x).add(point.y);
            } else {
                Set<Integer> tmp = new HashSet<>();
                tmp.add(point.y);
                result.put(point.x, tmp);
            }

            if (result.containsKey(point.y)) {
                result.get(point.y).add(point.x);
            } else {
                Set<Integer> tmp = new HashSet<>();
                tmp.add(point.x);
                result.put(point.y, tmp);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        QuestionThree questionThree = new QuestionThree();
        Point p1 = new Point(2, 1);
        Point p2 = new Point(3, 2);
        Point[] limits = new Point[]{p1, p2};
        System.out.println(questionThree.solve(3, 3, limits));
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

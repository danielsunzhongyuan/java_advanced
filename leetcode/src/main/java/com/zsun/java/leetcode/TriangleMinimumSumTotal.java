package com.zsun.java.leetcode;

import java.util.ArrayList;
import java.util.List;

public class TriangleMinimumSumTotal {
    public static void main(String[] args) {
        List<List<Integer>> a = new ArrayList<>(4);
        List<Integer> a1 = new ArrayList<>();
        a1.add(2);

        List<Integer> a2 = new ArrayList<>();
        a2.add(3);
        a2.add(4);

        List<Integer> a3 = new ArrayList<>();
        a3.add(6);
        a3.add(5);
        a3.add(7);

        List<Integer> a4 = new ArrayList<>();
        a4.add(4);
        a4.add(1);
        a4.add(8);
        a4.add(3);

        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(a4);

        System.out.println(new TriangleMinimumSumTotal().minimumTotal(a));
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        if (n == 1) {
            return triangle.get(0).get(0);
        }

        if (n == 2) {
            return triangle.get(0).get(0) + Math.min(triangle.get(1).get(0), triangle.get(1).get(1));
        }

        int[] sums = new int[n];
        sums[0] = triangle.get(0).get(0);
        for (int i = 1; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                if (j == 0) {
                    sums[0] += triangle.get(i).get(0);
                } else if (j == i) {
                    sums[j] = sums[j - 1] + triangle.get(i).get(j);
                } else {
                    sums[j] = triangle.get(i).get(j) + Math.min(sums[j], sums[j - 1]);
                }
            }
        }

        int result = sums[0];
        for (int i = 1; i < n; i++) {
            if (result > sums[i]) {
                result = sums[i];
            }
        }
        return result;
    }
}

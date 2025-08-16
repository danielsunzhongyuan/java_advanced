package com.zsun.java.leetcode;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] a = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int i = removeDuplicates.removeDuplicates2(a);
        System.out.println(i);
        for (int i1 : a) {
            System.out.print(i1 + ", ");
        }
        System.out.println("");

        a = new int[]{1, 2};
        i = removeDuplicates.removeDuplicates2(a);
        System.out.println(i);
        for (int i1 : a) {
            System.out.print(i1 + ", ");
        }
        System.out.println("");
    }

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return n;
        }

        int count = 1;
        int tmp = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] != tmp) {
                count++;
                tmp = nums[i];
            }
        }
        tmp = nums[0];
        int j = 1;
        for (int i = 1; i < count; i++) {
            while (j < n && nums[j] == tmp) {
                j++;
            }
            if (j == n) {
                break;
            }
            nums[i] = nums[j];
            tmp = nums[j];
        }

        return count;
    }

    public int removeDuplicates2(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return n;
        }

        int i = 1;
        int j = 2;
        while (i < n && j < n) {
            while (i < n && nums[i] > nums[i - 1]) {
                i++;
                j++;
            }
            if (i == n) {
                break;
            }
            while (j < n && nums[j] <= nums[j - 1]) {
                j++;
            }
            if (j == n) {
                break;
            }
            nums[i] = nums[j];
            i++;
            j++;
        }
        return i;
    }
}

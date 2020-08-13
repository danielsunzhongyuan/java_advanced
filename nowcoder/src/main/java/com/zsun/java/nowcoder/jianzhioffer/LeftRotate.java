package com.zsun.java.nowcoder.jianzhioffer;

/**
 * @author : zsun
 * @date : 2020/08/13 21:01
 */
public class LeftRotate {
    public String leftRotateString(String str, int n) {
        int length = str.length();
        if (length <= 0 || n < 0) {
            return "";
        }
        n = n % length;
        return str.substring(n, length) + str.substring(0, n);
    }

    public static void main(String[] args) {
        String a = "abcXYZdef";
        LeftRotate leftRotate = new LeftRotate();
        System.out.println(leftRotate.leftRotateString(a, 0));
        System.out.println(leftRotate.leftRotateString(a, 3));
        System.out.println(leftRotate.leftRotateString(a, 8));
        System.out.println(leftRotate.leftRotateString(a, 9));
        System.out.println(leftRotate.leftRotateString(a, 10));
    }
}

package com.zsun.java.nowcoder.jianzhioffer;

import java.util.Stack;

/**
 * Created by zsun.
 * DateTime: 2019/05/22 23:31
 *
 * @author zsun
 */
public class IsPushOrder {
    public boolean right(int[] pushA, int[] popA) {
        Stack<Integer> s = new Stack<>();

        int length = pushA.length;
        if (length <= 0) {
            return true;
        }
        int i = 0;
        int j = 0;
        s.push(pushA[i++]);
        while (j < length) {
            while (s.peek() != popA[j] && i < length) {
                s.push(pushA[i++]);
            }
            while (j < length && !s.empty() && s.peek() == popA[j]) {
                s.pop();
                j++;
            }

            if (i == length) {
                break;
            }
        }
        return s.empty();
    }
}

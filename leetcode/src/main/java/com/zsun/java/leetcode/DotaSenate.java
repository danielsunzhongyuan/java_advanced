package com.zsun.java.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by qzou at 2020-04-02 22:18
 *
 * @author qzou
 */
public class DotaSenate {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiants = new LinkedList<>();
        Queue<Integer> dires = new LinkedList<>();
        int length = senate.length();
        for (int i = 0; i < length; i++) {
            if (senate.charAt(i) == 'R') {
                radiants.add(i);
            } else {
                dires.add(i);
            }
        }

        while (!radiants.isEmpty() && !dires.isEmpty()) {
            int radiantIndex = radiants.poll();
            int direIndex = dires.poll();
            if (radiantIndex < direIndex) {
                radiants.offer(radiantIndex + length);
            } else {
                dires.offer(direIndex + length);
            }
        }
        return radiants.isEmpty() ? "Dire" : "Radiant";
    }
}

package com.zsun.java.tij.chapter21;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by zsun.
 * DateTime: 2019/07/05 10:13
 *
 * @author zsun
 */
public class LiftOffTest {

    @Test
    public void test() {
        LiftOff launch = new LiftOff();
        launch.run();
        String[] results = launch.getResults();
        Assertions.assertArrayEquals(new String[]{
            "#0(LiftOff!).", "#0(1).", "#0(2).", "#0(3).", "#0(4).",
            "#0(5).", "#0(6).", "#0(7).", "#0(8).", "#0(9).",
        }, results);
    }

    @Test
    public void testDefaultCountDown() {
        LiftOff launch = new LiftOff(0);
        launch.run();
        String[] results = launch.getResults();
        Assertions.assertArrayEquals(new String[]{
            "#0(LiftOff!).", "#0(1).", "#0(2).", "#0(3).", "#0(4).",
            "#0(5).", "#0(6).", "#0(7).", "#0(8).", "#0(9).",
        }, results);
    }

    @Test
    public void testParameteredConstructer() {
        LiftOff launch = new LiftOff(3);
        launch.run();
        String[] results = launch.getResults();
        Assertions.assertArrayEquals(new String[]{
            "#0(LiftOff!).", "#0(1).", "#0(2).",
        }, results);
    }

    @Test
    public void testBasicThreads() throws Exception {
        LiftOff launch = new LiftOff(1);
        Thread t = new Thread(launch);
        try {
            t.start();
            t.join();
            String[] results = launch.getResults();
            Assertions.assertArrayEquals(new String[]{"#0(LiftOff!)."}, results);
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }
}

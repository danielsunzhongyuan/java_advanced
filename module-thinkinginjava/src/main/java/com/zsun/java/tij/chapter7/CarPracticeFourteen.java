package com.zsun.java.tij.chapter7;

/**
 * Created by zsun.
 * DateTime: 2019/05/01 17:38
 */
public class CarPracticeFourteen {
    public Engine engine = new Engine();
    public Wheel[] wheels = new Wheel[4];
    public Door left = new Door();
    public Door right = new Door();

    public CarPracticeFourteen() {
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        CarPracticeFourteen car = new CarPracticeFourteen();
        car.left.window.rollup();
        car.wheels[0].inflate(72);
        car.engine.service();
    }
}

class Engine {
    public void start() {
    }

    public void rev() {
    }

    public void service() {
        System.out.println("engine service");
    }

    public void stop() {
    }
}

class Wheel {
    public void inflate(int psi) {
    }
}

class Window {
    public void rollup() {
    }

    public void rolldown() {
    }
}

class Door {
    public Window window = new Window();

    public void open() {
    }

    public void close() {
    }
}

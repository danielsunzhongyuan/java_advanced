package com.zsun.java.tij.chapter10.innerclasses;

/**
 * Created by zsun.
 * DateTime: 2019/05/05 21:21
 */
public class Games {
    public static void playGame(GameFactory factory) {
        Game s = factory.getGame();
        while (s.move()) {
            System.out.println("move");
        }
    }

    public static void main(String[] args) {
        playGame(Checkers.gameFactory);
        playGame(Chess.gameFactory);
    }
}

interface Game {
    boolean move();
}

interface GameFactory {
    Game getGame();
}

class Checkers implements Game {
    private int moves = 0;
    private static final int MOVES = 3;

    private Checkers() {
    }

    @Override
    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory gameFactory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Checkers();
        }
    };
}

class Chess implements Game {
    private int moves = 0;
    private static final int MOVES = 4;

    private Chess() {
    }

    @Override
    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory gameFactory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Chess();
        }
    };
}

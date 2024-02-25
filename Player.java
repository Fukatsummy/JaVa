package game;

import java.util.concurrent.locks.ReentrantLock;

public class Player implements Runnable {
    private String name;
    private Dice dice;
    private int score;
    private ReentrantLock lock;

    public Player(String name, Dice dice) {
        this.name = name;
        this.dice = dice;
        this.score = 0;
        this.lock = new ReentrantLock();
    }

    @Override
    public void run() {
        lock.lock();
        try {
            for (int i = 0; i < 10; i++) {
                int roll = dice.roll();
                System.out.println(name + " выбросил " + roll);
                score += roll;
            }
        } finally {
            lock.unlock();
        }
    }

    public int getScore() {
        return score;
    }
}

package game;

import java.util.Random;

public class Dice {

	private Random random;

    public Dice() {
        this.random = new Random();
    }

    public synchronized int roll() {
        int low = 1;
        int high = 6;
        return (random.nextInt(high - low)) + low;
    }
}

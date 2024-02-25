package game;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Game {

	public static void main(String[] args) {
        // Создаем кубик
		Dice dice = new Dice();

        // Создаем игроков
        Player player1 = new Player("Игрок 1", dice);
        Player player2 = new Player("Игрок 2", dice);

        // Создаем пул потоков
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Запускаем игроков в разных потоках
        executor.execute(player1);
        executor.execute(player2);

        // Ожидаем завершения всех потоков
        executor.shutdown();
        while (!executor.isTerminated()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Игрок 1 набрал " + player1.getScore() + " очков");
        System.out.println("Игрок 2 набрал " + player2.getScore() + " очков");
    }
}

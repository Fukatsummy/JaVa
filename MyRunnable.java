package threads;

public class MyRunnable implements Runnable {
	public void run() {
		System.out.println("Этот код выполняется в отдельном  потоке");
	}
	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable);
		thread.start();

	}
}
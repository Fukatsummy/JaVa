package threads;

public class Main {

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		System.out.println("Этот код выполняется в основном  потоке");
		thread.start();

	}

}
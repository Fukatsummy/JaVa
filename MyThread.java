package threads;

public class MyThread extends Thread{
	public void run() {
		System.out.println("Этот код выполняется в отдельном потоке");
	}

}
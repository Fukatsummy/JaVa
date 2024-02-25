package threads;

import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SincHcroenizedExample {

private static int sharedVariable = 0;
	
	public static synchronized void incrementVariable() {
		sharedVariable++;
	}
	public static synchronized int rFactorial(int n) {
	    if(n==0) {
	    	return 1;
	    }else {
	    	return n * rFactorial(n-1);
	    }
	}
	public static synchronized int lFactorial(int n) {
	    int result = 1;
	    for(int i =1; i<=n; i++) {
	    	result *=i;
	    }
	    return result;
	}
	public static synchronized int throwDice() {
		int low = 1;
		int high = 6;
		Random random = new Random();
		return (random.nextInt(high - low))+low;
	}
	public static void main(String[] args) {
	Thread thread1 = new Thread(()-> {
//			for(int i =0;i<1000; i++) {
//				System.out.println(Thread.currentThread().getName());
//				incrementVariable();
//			}
		System.out.println(rFactorial(20)+"Рекурсия");
		});
	
		Thread thread2 = new Thread(()-> {
//			for(int i =0;i<1000; i++) {
//				incrementVariable();
//			}
			System.out.println(lFactorial(20)+"Цикл");
		});
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Значение переменной после увеличения "+sharedVariable);
		// Создаем пул потоков
//		ExecutorService executor = Executors.newFixedThreadPool(3);
//		for(int i = 0; i<5; i++) {
//			executor.execute(()->{
//				synchronized (SincHcroenizedExample.class) {
//					sharedVariable++;
//					System.out.println("Значение переменной после увеличения "+Thread.currentThread().getName());
//				}});
//		}
//		executor.shutdown();
//		System.out.println("Значение переменной после увеличения "+sharedVariable);
//		Thread.sleep(5000);

		//Game dice
		
	}
}

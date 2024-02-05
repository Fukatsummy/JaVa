package mainpackage;

import java.util.Scanner;

public class Hello {

	//public static void main(String[] args) {
		// System.out.println("Hello world!");
	//}
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите ваше имя:");
		String name = scanner.nextLine();
	    System.out.println("Введите возраст");
	 int age = scanner.nextInt();
	 
	 //if (age >= 18)
	//	{
	//		System.out.println(name + " " + "Вы совершеннолетний");
	//	}
	// else
	//	{
	//		System.out.println(name + " " + "Вы несовершеннолетний");
	//	}
	 System.out.print((age>=18)? "совершеннолетний" : "несовершеннолетний");
}
}

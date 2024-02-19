package FilesExample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        try(BufferedReader reader = new BufferedReader(new FileReader("file"))){
//        	
//        	String line;
//        	while((line = reader.readLine()) !=null) {
//        		System.out.println(line);
//        	}
//        }
//        catch(IOException e) {
//        	System.out.println("no file");
//        	e.printStackTrace();
//        }
	
//        
//        try(BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
//        	writer.write("0\n");
//        	writer.write("1\n");
//        	writer.write("2\n");
//        	writer.write("3\n");
//        }
//        catch (IOException e) {
//        	System.out.println("error");
//        	e.printStackTrace();
//        }
//        System.out.println("Добавлено");
//		
//		try {
//			File file = new File("output.txt");
//			Scanner scanner = new Scanner(file);
//			int sum = 0;
//			
//			while (scanner.hasNextInt()) {
//				sum += scanner.nextInt();
//			}
//			System.out.println("Сумма чисел из файла = " + sum);
//			scanner.close();
//		} catch(FileNotFoundException e) {
//			System.out.println("Файл не найден");
//			e.printStackTrace();
//		}
		
//		File source = new File("file.txt");
//		File destination = new File("output.txt");
//		try(FileInputStream fis = new FileInputStream(source);
//				FileOutputStream fos = new FileOutputStream(destination)){
//			byte[] buffer = new byte[1024];
//			int length;
//			while((length = fis.read(buffer))>0) {
//				fos.write(buffer,0,length);
//			}
//			System.out.println("Файл скопирован");
//		}catch(IOException e) {
//			System.out.println("Ошибка при копировании");
//			e.printStackTrace();
//		}
		
//		try {
//		File word = new File("file.txt");
//		Scanner scanner = new Scanner(word);
//		int wordCount =0;
//		while(scanner.hasNext()) {
//			scanner.next();
//			wordCount++;
//		}
//		System.out.println("Количество слов в файле: " + wordCount);
//		scanner.close();
//		}catch(FileNotFoundException e) {
//			System.out.println("Ошибка");
//			e.printStackTrace();
//		}
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println("Длина строки: " + line.length());
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

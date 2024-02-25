package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
//		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
//		List<Integer> evenNumbers = numbers.stream()
//											.filter(n -> n%2 == 0 )
//											.collect(Collectors.toList());
//	for (Integer num : evenNumbers)	
//	System.out.println(num);	
	
//	List<String> words = Arrays.asList("apple","banana","avocado","orange","bluberry");
//	
//	List<String> filteredWords = words.stream()
//									.filter(word -> word.startsWith("b"))
//									.limit(1)
//									.collect(Collectors.toList());
//	
//	
//	for (String word : filteredWords)	
//		System.out.println(word);
//	
		
//		List<String> data = Arrays.asList("apple","1","2","orange","13");
//		List<Integer> numOnly = data.stream()
//								.filter(str  -> str.matches("\\d+"))
//								.map(Integer::parseInt)
//								.collect(Collectors.toList());
//		System.out.println(numOnly);
		
		
//		List<String> names = new ArrayList<>();
//		names.add("Alfa");
//		names.add("Bravo");
//		names.add("Charlie");
//		names.add("Alfa");
//		
//		List<Integer> lengths =  names.stream()
//								.map(String::length)
//								.collect(Collectors.toList());
//		
//		System.out.println(lengths);
		
		List<String> strings = Arrays.asList("java","python","C--","Hello world","hkjgyug kjgu");
		List<String> filteredStrings = strings.stream()
				.filter(s->s.length()>4)
				.map(String::toUpperCase)  // Преобразование строки в верхний регистр
				.collect(Collectors.toList());
		System.out.println(filteredStrings);
		
		
		List<String> data = Arrays.asList("apple","1","2","orange","13");
		List<String> found = data.stream()
				.filter(word -> word.equals("orange"))// поиск по слову
				.collect(Collectors.toList());
		System.out.println(data);
		System.out.println(found);
	}
			
}

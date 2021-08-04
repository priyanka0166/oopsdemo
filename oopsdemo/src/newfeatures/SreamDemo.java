package newfeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SreamDemo {

	public static void main(String[] args) {
		List<String> city = Arrays.asList("Delhi","Dhanbad","Mumbai","Dehradun","Bengaluru");
		
		// sorting elements using streams
		city.stream().sorted().forEach(System.out::println);
		
		System.out.println();
		// Operation by creating a stream
		city.stream().filter(s -> s.startsWith("D")).map(String :: toUpperCase).sorted().forEach(System.out :: println);
		
		List<String> bcity = city.stream().filter(s->s.startsWith("D"))
							.map(String::toUpperCase)
							.collect(Collectors.toList());
		System.out.println(bcity);
		
		System.out.println();
		// print list using lambda expression
		bcity.forEach(c-> System.out.println(c));
		
		System.out.println("\nNumbers from 1-9");
		// display nos. from 1-9 with streams -- range
		IntStream.range(1, 10).forEach(i -> System.out.println(i));
		
		System.out.println("\nNumbers from 1-10");
		// display nos. from 1-10 with streams -- rangeClosed
		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		
		// sum of array elements using streams
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = Arrays.stream(num).reduce(0, (a,b) -> a+b);
		System.out.println("\nSum of an array: "+sum);
		
	}

}

package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Sorted {
	public static void main(String[] args) {

		// Creating a list of integers
		// 1
		List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

		System.out.println("The sorted stream is : ");

		list.stream().sorted().forEach(System.out::println);
		
		// 2
		Random random = new Random();
		random.ints().limit(10).sorted().forEach(System.out::println);

	}

}
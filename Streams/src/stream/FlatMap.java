package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {
	public static void main(String[] args) {

		// Creating a List of Strings
		List<String> list = Arrays.asList("vishnu", "sai");

		list.stream().flatMap(str -> Stream.of(str.charAt(2))).forEach(System.out::println);
	}
}

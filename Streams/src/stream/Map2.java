package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Map2 {

	public static void main(String[] args) {
		List<Integer> intLst = Arrays.asList(1, 2, 3, 4);

		List<Integer> newLst = new ArrayList<Integer>();

		for (int i : intLst) {
			newLst.add(i - 2);
		}

		System.out.println(newLst);

	}

}

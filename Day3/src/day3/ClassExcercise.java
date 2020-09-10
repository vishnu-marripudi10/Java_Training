package day3;

import java.util.Scanner;

public class ClassExcercise {
	public int max(int[] array) {
		int max = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public int min(int[] array) {
		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	void show() {
		Scanner sc = new Scanner(System.in);
		int tempValue;

		System.out.println("Enter number of array elements : ");
		int size = sc.nextInt();

		int[] numArray = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("Enter element : ");
			numArray[i] = sc.nextInt();
		}
		System.out.println("You have entered : ");
		for (int i = 0; i < size - 1; i++) {
			System.out.print(numArray[i] + ",");
		}
		System.out.println(numArray[numArray.length - 1]);

		for (int i = 0; i < numArray.length; i++) {
			for (int j = i + 1; j < numArray.length; j++) {

				if (numArray[i] > numArray[j]) {
					tempValue = numArray[i];
					numArray[i] = numArray[j];
					numArray[j] = tempValue;
				}
			}
		}

		System.out.println("Final array after the sorting : ");
		for (int i = 0; i < size - 1; i++) {
			System.out.print(numArray[i] + ",");
		}
		System.out.println(numArray[numArray.length - 1]);

	}
  
}

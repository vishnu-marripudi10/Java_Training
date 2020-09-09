package day1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Sample {
	static int a, b, c, d;
	private static Scanner in;
	private Scanner scan;
	private Scanner input;
	private Scanner input1;
	private Scanner sc;

	void display() {

		// 1. Write a Java program to print the result of the following operations.

		a = -5 + 8 * 6;
		b = (55 + 9) % 9;
		c = 20 + -3 * 5 / 8;
		d = 5 + 15 / 3 * 2 - 8 % 3;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);

		// 2. Write a Java program to print the sum (addition), multiply, subtract,
		// divide and remainder of two numbers.

		System.out.println(a + " + " + b + " = " + (a + b));

		System.out.println(a + " - " + b + " = " + (a - b));

		System.out.println(c + " x " + d + " = " + (c * d));

		System.out.println(c + " / " + d + " = " + (c / d));

		System.out.println(c + " % " + d + " = " + (c % d));

		// 3. Write a Java program that takes three numbers as input to calculate and
		// print the average of the numbers.
		int average;
		in = new Scanner(System.in);
		System.out.print("Input the first number: ");
		int x = in.nextInt();
		System.out.print("Input the second number: ");
		int y = in.nextInt();
		System.out.print("Input the third number: ");
		int z = in.nextInt();
		average = (x + y + z) / 3;
		System.out.print("The average value is " + average + "\n");

		// 4. Write a Java program to swap two variables.

		int temp;
		System.out.println("Before swapping : x, y = " + x + ", " + +y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("After swapping : x, y = " + x + ", " + +y + "\n");

		// 5. Write a java program, which will take a number variable and check whether
		// the number is prime or not.

		int num, i, count = 0;
		scan = new Scanner(System.in);

		System.out.print("Enter a Number : ");
		num = scan.nextInt();

		for (i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.print("This is a Prime Number" + "\n");
		} else {
			System.out.print("This is not a Prime Number" + "\n");
		}

		// 6. Write a Java program to print the ascii value of a given character.

		int chr = 'Z';
		System.out.println("The ASCII value of Z is :" + chr);
	}

	// 7. Write a Java program which iterates the integers from 1 to 100. For
	// multiples of three print "Fizz" instead of the number and print "Buzz" for
	// the multiples of five. When number is divided by both three and five, print
	// "fizz buzz".
	void show() {
		int n = 100;

		for (int j = 1; j < n; j++) {
			if (j % 15 == 0)
				System.out.print("FizzBuzz" + " ");

			else if (j % 5 == 0)
				System.out.print("Buzz" + " ");

			else if (j % 3 == 0)
				System.out.print("Fizz" + " ");
			else
				System.out.print(j + " ");

		}

		// 8. Write a program to read a number and calculate the sum of odd digits
		// (values) present in the given number.
		System.out.print("\n" + "Input the number: ");
		input = new Scanner(System.in);
		int W = input.nextInt();

		int summ = 0;
		while (W > 0) {
			int remm = n % 10;
			if (remm % 2 != 0) {
				summ = summ + remm;
			}
			W = W / 10;
		}

		if (summ % 2 == 0) {
			System.out.println("Sum of odd digits is even");
		} else {
			System.out.println("Sum of odd digits is odd");
		}

		// 9. Write a program to read a number, calculate the sum of squares of even
		// digits (values) present in the given number.
		System.out.print("\n" + "Input the number: ");
		input1 = new Scanner(System.in);
		int v = input1.nextInt();
		int n1 = 0, n2 = 0;
		while (v != 0) {
			n1 = v % 10;
			if ((n1 % 2) == 0)
				n2 += n1 * n1;
			v /= 10;
		}
		System.out.println(n2);
		
		//10. Write a Program which finds the longest word from a sentence. Your program should read a sentence as input from user and return the longest word. In case there are two words of maximum length return the word which comes first in the sentence.
		System.out.print("\n" + "Enter the sentence: ");
		sc = new Scanner(System.in);
		String s1= sc.nextLine();
		System.out.println(lengthiestString(s1));
		}
		public static String lengthiestString(String s1) {
		int max=0;
		String s2=new String();
		StringTokenizer t=new StringTokenizer(s1," ");
		while(t.hasMoreTokens()){
		String s3=t.nextToken();
		int n=s3.length();
		if(n>max){
		max=n;
		s2=s3;}
		}
		return s2;
	}
}

package day1;

import java.util.Scanner;

public class Sample2 {
	private Scanner in;
	private Scanner in2;
	private Scanner sc;

    //1. Write a Java method to find the smallest number among three numbers.
	void run() {
		in2 = new Scanner(System.in);
		System.out.print("Input the first number: ");
		double a = in2.nextDouble();
		System.out.print("Input the Second number: ");
		double b = in2.nextDouble();
		System.out.print("Input the third number: ");
		double c = in2.nextDouble();
		System.out.print("The smallest value is " + smallest(a, b, c) + "\n");
	}

	public static double smallest(double a, double b, double c) {
		return Math.min(Math.min(a, b), c);
	}

    //2. Write a Java method to display the middle character of a string. 
	void run1() {

		in = new Scanner(System.in);
		System.out.print("Input a string: ");
		String str = in.nextLine();
		System.out.print("The middle character in the string: " + middle(str) + "\n");
	}

	public static String middle(String str) {
		int position;
		int length;
		if (str.length() % 2 == 0) {
			position = str.length() / 2 - 1;
			length = 2;
		} else {
			position = str.length() / 2;
			length = 1;
		}
		return str.substring(position, position + length);
	}

	// 3. Write a Java method to count all vowels in a string.
	void run2() {
		int count = 0;
		System.out.println("Enter a sentence :");
		sc = new Scanner(System.in);
		String sentence = sc.nextLine();

		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
				count++;
			}
		}
		System.out.println("Number of vowels in the given sentence is " + count);
	}

	// 4. Write a program to create a room class, the attributes of this class is
	// roomno, roomtype, roomarea and ACmachine. In this class the member functions
	// are setdata and displaydata.
	int roomNo;
	String roomType;
	double roomArea;
	String acMachine;

	public int getRoomNo() {
		return roomNo;
	}

	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public double getRoomArea() {
		return roomArea;
	}

	public void setRoomArea(double roomArea) {
		this.roomArea = roomArea;
	}

	public String getAcMachine() {
		return acMachine;
	}

	public void setAcMachine(String acMachine) {
		this.acMachine = acMachine;
	}

}

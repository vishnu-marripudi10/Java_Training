package day3;

import java.util.Scanner;

public class Day3 {

	// 1. 1. Write a Java program to convert all the characters in a string to
	// lowercase.

	void display() {
		String str = "The Quick BroWn FoX!";

		// Convert the above string to all lowercase.
		String lowerStr = str.toLowerCase();

		// Display the two strings for comparison.
		System.out.println("Original String: " + str);
		System.out.println("String in lowercase: " + lowerStr);
	}

	// 2. Write a Java program to replace all the 'd' occurrence characters with ‘h’
	// characters in each string.

	void run() {
		String str = "dddddddddddddddddd";

		// Replace all the 'd' characters with 'h' characters.
		String new_str = str.replace('d', 'h');

		System.out.println("Original string: " + str);
		System.out.println("New String: " + new_str);
	}

	// 3. write a Java program to sort an integer array of 10 elements in ascending.

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
	
	//4. write a Java program to search for an element of an integer array of 10 elements.
	
	void show2() {
		Scanner sc = new Scanner(System.in);
		 
	     int i,n,search,flag=0;
	 System.out.println("Enter the number of elements:") ;
	 n = sc.nextInt();
	 int[] a = new int[n];
	 
	     System.out.println("Enter the elements") ;
	     for(i=0;i<n;i++)
	     {
	         a[i] = sc.nextInt();
	     }
	 
	 System.out.println("Enter the element to be seached");
	 search = sc.nextInt();
	    
	     /*Perform search operation*/
	     for(i=0;i<n;i++)
	     {
	         if(a[i]==search)
	         {
	             System.out.println("Element "+search+" found at "+i+" position");
	             flag=1;
	             break;
	         }
	     }
	     if(flag==0)
	     {
	         System.out.println("Element "+search+" not found");
	     }
	}
	
	
	//5.	Accept a string, and two indices(integers), and print the substring consisting of all characters inclusive range 
	
	void run2() {
		String str = "University";
        System.out.println(str.substring(4, 7));
	}
	
	//6.	Given a string , print ‘Yes’ if it is a palindrome, print ‘No’ otherwise. 
	
	void display2() {
		String str, rev = "";
	      Scanner sc = new Scanner(System.in);
	 
	      System.out.println("Enter a string:");
	      str = sc.nextLine();
	 
	      int length = str.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         rev = rev + str.charAt(i);
	 
	      if (str.equals(rev))
	         System.out.println("Yes");
	      else
	         System.out.println("No");
	}
	
//9. 9.	Write a program to read a string and a character, and reverse the string and convert it in a format such that each character is separated by the given character. Print the final string.
	
	void run3() {
			Scanner sc = new Scanner(System.in);
			String s1 = sc.nextLine();
			reShape(s1);
			}
			public static String reShape(String s) {
			 
			StringBuffer sb = new StringBuffer(s);
			StringBuffer sb2 = new StringBuffer();
			String s2 = sb.reverse().toString();
			for (int i = 0; i < s2.length(); i++) {
			sb2.append(s2.charAt(i));
			sb2.append("-");
			}
			sb2.deleteCharAt(sb2.length() - 1);
			System.out.println(sb2.toString());
			return sb2.toString();
			}
	

}

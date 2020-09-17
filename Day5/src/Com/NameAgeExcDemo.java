//4. Exceoption
package Com;

import java.util.Scanner;

class AgeNegativeException extends Exception {

	public AgeNegativeException(String msg) {

		super(msg);
	}
}

public class NameAgeExcDemo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter ur name :: ");
		String name = s.nextLine();
		System.out.print("Enter ur age :: ");
		int age = s.nextInt();

		try {
			if (age < 19)
				throw new AgeNegativeException("Age must be greater than 19");
			else
				System.out.println("Valid age !!!");
		} catch (AgeNegativeException a) {
			System.out.println("CustomException: InvalidAgeRangeException");
			System.out.println(a.getMessage());
		}
	}

}
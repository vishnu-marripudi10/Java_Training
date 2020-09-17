//2. Try Divison
package Com;

import java.util.Scanner;

public class Try {

	public static void main(String[] args) {

		try {
			Scanner scan = new Scanner(System.in);
			int input1 = scan.nextInt();
			int input2 = scan.nextInt();
			scan.close();
			System.out.println(divideInput(input1, input2));
		} catch (Exception e) {
			System.out.println("java.util.InputMismatchException");
		}

	}

	public static int divideInput(int input1, int input2) {
		int sum;
		sum = input1 / input2;
		return sum;
	}
}
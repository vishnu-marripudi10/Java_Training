//5. Runrate
package Com;

import java.io.*;

public class RunRate {
	public static BufferedReader q = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		int runrate;
		System.out.print("Enter Score: ");
		String num1 = q.readLine();
		int n1 = Integer.parseInt(num1);

		System.out.print("Enter Overs: ");
		String num2 = q.readLine();
		int n2 = Integer.parseInt(num2);

		if (n2 == 0) {
			System.out.println("Arithmetic_Exception");
		} else if (n1 != 0 && n2 != 0) {

			runrate = n1 / n2;
			System.out.println("Run Rate = " + runrate);

		} else if (n1 == 0) {
			System.out.println("Run rate is 0");

		} else {
			System.out.println("Invalid");
		}

	}
}
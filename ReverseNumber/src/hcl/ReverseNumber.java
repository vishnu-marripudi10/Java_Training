package hcl;
import java.util.Scanner;
public class ReverseNumber {
	private static Scanner sc;

	public static void main(String[] args) {

		int num, reversed = 0, OriginalNumber;
        sc = new Scanner(System.in);
		
		System.out.println("\n Please Enter any Number you want to Reverse : ");
	    num = sc.nextInt();
	    OriginalNumber = num;
	    while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
	
	if(OriginalNumber == reversed) {
		
		System.out.println("Given Number is Palandrome");
		
	}
	else {
		System.out.println("Given Number is Not Palandrome");
	}

}
}



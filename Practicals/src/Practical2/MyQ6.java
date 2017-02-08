package Practical2;

import java.util.Scanner;

public class MyQ6 {

	public static void main(String[] args) {
		// user input
		System.out.print("\nPlease enter some number in the range [0, 15]: ");
		Scanner input = new Scanner(System.in);
		int theInt = input.nextInt();
		input.close();
		
		if (theInt < 0 || theInt > 15) {
			System.out.println("You must enter a number in the range [0, 15].");
		} else {
			String hexOut = Integer.toHexString(theInt);
			System.out.printf("\nThe hex number of decimal input %d is %s", theInt, hexOut);
		}

	}

}

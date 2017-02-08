package Practical2;

import java.util.Scanner;

public class MyQ5 {
	public static void main(String args[]) {
		// Read an ASCII code
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an ASCII code: ");
		int code = input.nextInt();
		
		// Check the code is valid and display results
		if (code >= 0 && code < 128)
			System.out.println("The character for ASCII code " + code + " is " + (char)code);
		else
			System.out.println("Valid ASCII codes are between 0 and 127 inclusive");
		
		// Read a character and display its Unicode (in decimal)
	    System.out.print("Enter a character: ");
	    char ch = input.next().charAt(0);
	    System.out.println("The Unicode for the character " + ch + " is " + (int)ch);
	}
}
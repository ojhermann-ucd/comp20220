package Practical2;

// imports
import java.util.Scanner;

public class MyQ4 {

	public static void main(String[] args) {
		// create Scanner class
		Scanner input = new Scanner(System.in);
		
		// user input
		System.out.print("Enter the length of r: ");
		double rLength = input.nextDouble();
		input.close();
		
		// calculated inputs
		if (rLength < 0) {
			System.out.println("The value of r must be greater than zero.");
		} else {
			double sLength = 2 * rLength * Math.sin(Math.PI / 5);
			double area = (5 * sLength * sLength)  / (4 * Math.tan(Math.PI / 5));
			System.out.println("The area of the pentagon is " + area);
		}

	}

}

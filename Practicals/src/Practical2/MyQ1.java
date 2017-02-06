/*
 * Purpose: find real roots of quadratic equation
 * Author: ojh
 * Created: 2017 02 06
 * Outline
 * 	User inputs: aInput, bInput, cInput
 * 	Calculate: theDiscriminant, theDivisor
 * if theDiscriminat < 0 ? "no real roots": if zero, then -b/2a else two roots
 */

package Practical2;

//imports
import java.util.Scanner;

public class MyQ1 {

	public static void main(String[] args) {
		// create Scanner object
		Scanner input = new Scanner(System.in);
		
		// user inputs
		System.out.print("Enter the values for a, b, and c: ");
		double aInput = input.nextDouble();
		double bInput = input.nextDouble();
		double cInput = input.nextDouble();
		input.close();
		
		// calculations
		double theDiscriminant = (bInput * bInput) - (4 * aInput * cInput);
		
		double theDivisor = 2 * aInput;
		
		double root1 = (bInput * -1) + theDiscriminant;
		root1 /= theDivisor;
		
		double root2 = (bInput * -1) - theDiscriminant;
		root2 /= theDivisor;
		
		// conditional
		if (theDiscriminant < 0) {
			System.out.println("There are no real roots.");
		} else if (theDiscriminant == 0) {
			System.out.println("The root is " + root1);
		} else {
			theDiscriminant = Math.sqrt(theDiscriminant);
			System.out.println("The first root is " + root1);
			System.out.println("The second root is " + root2);
		}

	}

}

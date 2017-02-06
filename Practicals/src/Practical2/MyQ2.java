/*
 * Purpose: compute the perimeter of a triangle
 * Author: ojh
 * Create: 2017 02 06
 * Outline
 * 	User inputs: aSide, bSide, cSide
 * 	Checks: a + b > c, a + c > b, and b + c > a
 * 	if Checks, then return a + b + c; else return not valid
 */

package Practical2;

// imports
import java.util.Scanner;

public class MyQ2 {

	public static void main(String[] args) {
		// create Scanner object
		Scanner input = new Scanner(System.in);
		
		// user inputs
		System.out.print("Enter the lengths of the three sides: ");
		double aSide = input.nextDouble();
		double bSide = input.nextDouble();
		double cSide = input.nextDouble();
		input.close();
		
		// calculated inputs
		double abTogether = aSide + bSide;
		double acTogether = aSide + cSide;
		double bcTogether = bSide + cSide;
		double theSum = aSide + bSide +cSide;
		
		// checks
		boolean theCondition = (abTogether > cSide) && (acTogether > bSide) && (bcTogether > aSide);
		
		// output
		if (theCondition) {
			System.out.println("The perimeter of the triangle is " + theSum);
		} else {
			System.out.println("This is not a valid triangle.");
		}

	}

}

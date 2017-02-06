/*
 * Purpose: see if two points are inside of a rectangle centered at (0,0)
 * Author: ojh
 * Create: 2017 02 06
 * Outline
 * 	User inputs: boundaryWidth, boundaryHeight; testX, testY
 * 	Calculated inputs: abs(boundaryWidth), abs(boundaryHeight), abs(testX), abs(testY)
 * 	Test: testX < boundaryWidth/2 and testY < boundaryHeight/2 
 */

package Practical2;

// imports
import java.util.Scanner;

public class MyQ3 {

	public static void main(String[] args) {
		// create Scanner object
		Scanner input = new Scanner(System.in);
		
		// user inputs
		System.out.print("Enter the width and heigh of the rectangle centered around (0, 0): ");
		double boundaryWidth = input.nextDouble();
		boundaryWidth = Math.abs(boundaryWidth) / 2;
		double boundaryHeight = input.nextDouble();
		boundaryHeight = Math.abs(boundaryHeight) / 2;
		
		System.out.print("Enter the (x, y) coordinates of the point to be tested: ");
		double testX = input.nextDouble();
		testX = Math.abs(testX);
		double testY = input.nextDouble();
		testY = Math.abs(testY);
		
		// close the Scanner object
		input.close();
		
		// the output
		boolean theCondition = (testX < boundaryWidth) && (testY < boundaryHeight);
		String theOutput = (theCondition) ? "Inside" : "Outside";
		System.out.println(theOutput);

	}

}

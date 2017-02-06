import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
	
		//create Scanner object
		Scanner input = new Scanner(System.in);
		
		//input the numbers
		System.out.println("Enter a, b, and c for the quadratic equation.");
		double aInput = input.nextDouble();
		double bInput = input.nextDouble();
		double cInput = input.nextDouble();
		
		//discriminant
		double theDiscriminant = bInput * bInput - (4 * aInput * cInput);
		theDiscriminant = Math.sqrt(theDiscriminant);
		
		//roots
		double root1 = bInput * -1;
		double root2 = root1;
		
		//conditional
		if (theDiscriminant == 0) {
			root1 /= (2 * aInput);
			System.out.println("The root is " + root1);
		}
		
		else if (theDiscriminant > 0) {
			root1 += theDiscriminant;
			root1 /= (2 * aInput);
			System.out.println("One root is " + root1);
			
			root2 -= theDiscriminant;
			root2 /= (2 * aInput);
			System.out.println("The other root is " + root2);
		}
		
		else {
			System.out.println("There is no real root.");
		}

	}

}

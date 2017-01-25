package demo;

public class ComputeArea {
/*
 This program computes the area of a circle. 
 */
	public static void main(String[] args) {
		double radius; //Declare radius
		double area; //Declare area
		
		//Assign radius
		radius = 20;
		
		//Compute area
		area = radius * radius * 3.14159;
		
		//Display results
		System.out.println("The area for the circle of radious " + radius + " is " + area);

	}

}

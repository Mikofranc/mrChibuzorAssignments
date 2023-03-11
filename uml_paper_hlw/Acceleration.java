import java.util.Scanner;

public class Acceleration{

//write a program that prompts the user to eneter the starting velocity vo in meters/second the ending velocity v1 in meter/second and the time span in t in seconds and display the average acceleration.

	public static void main(String[] args){
	
	
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter v0");
		
		double velocityOne = userInput.nextDouble();
		
		System.out.println("Enter v1");
		
		double velocityTwo = userInput.nextDouble();
		
		System.out.println("Enter t");
		
		double time = userInput.nextDouble();
		
		double total = ((velocityTwo-velocityOne) / time);
		
		System.out.println("The average acceleration is "+total);
		
	
	
	
	}


}

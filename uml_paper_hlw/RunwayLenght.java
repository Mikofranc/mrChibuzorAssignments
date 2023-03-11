import java.util.Scanner;

public class RunwayLenght{

//write a program that prompts the user to enter v in meter/seconds (m/s) and the acceleration in (m/s)2, display the minimum run way lenght.

	public static void main(String[] args){
	
	
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter speed and acceleration:");
		
		double v = userInput.nextDouble();
		double a = userInput.nextDouble();
	
		double velocity = (v*v);
		double acceleration = (2*a);
		
		double lenght = velocity/acceleration;
	
		System.out.println("The minimum runway lenght for this airplane is "+lenght);
	
	}



}

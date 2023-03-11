import java.util.Scanner;

public class CalculatingEnergy{

//write a program that calculates the energy needed to heat water from an initial temprature to a final temprature. your program should prompt the user to enter the amount of water in kilograms and the initial and final tempratures of the water. formular: Q=M*(finalTemprature-initialtemprature)*4184

	public static void main(String[] args){

		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the amount of water in Kilograms:");
		
		double weight = userInput.nextDouble();
		
		System.out.println("Enter the initial temprature:");
		
		double initialTemprature = userInput.nextDouble();
		
		System.out.println("Enter the final temprature:s");
		
		double finalTemprature = userInput.nextDouble();
		
		double subtract = (finalTemprature - initialTemprature);
		
		double formular = 4184;
		
		double totalCalculation = (weight*subtract*formular);
		
		System.out.println("The energy needed is : "+totalCalculation);
		


	}



}

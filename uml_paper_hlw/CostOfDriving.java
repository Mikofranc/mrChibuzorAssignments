import java.util.Scanner;

public class CostOfDriving{

//write a program that prompts the user to enter the distance to drive the fuel efficiency of the cr in miles per gallon and the price per gallon and display the cost of the trip. here is a sample run.

	public static void main(String[] args){
	
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the driving distance");
		double distance = userInput.nextDouble();
		
		System.out.println("Enter miles per gallon");
		double milePerGallon = userInput.nextDouble();
		
		System.out.println("Enter price per gallon");
		double pricePerGallon = userInput.nextDouble();
		
		
		double totalSum = ((distance*pricePerGallon)/milePerGallon);
		
		System.out.println("The cost of driving is "+ totalSum);
	
	}


}

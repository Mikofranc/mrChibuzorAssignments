import java.util.Scanner;

public class Bmi{

//body mass index can be measured of health on weight. it can be calclated by taking your weight in kilograms and dividing by the square of your height in meters. write a program that prompts the user to enter a weight in pounds and weight in incheas and display the BML. Note that one pounf is 0.45359237 kilograms and one inch is 0.0254 meters.

	public static void main(String[] args){
	
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds:");
		
		double weight = userInput.nextDouble();
		
		System.out.println("Enter height in inches:");
		
		double height = userInput.nextDouble();
		
		double poundKg = 0.45359237;
		
		double inchMeter = 0.0254;
		
		double totalWeight = (weight*poundKg);
		
		double initialHeight = (height*inchMeter);
		
		double totalHeight = (initialHeight*initialHeight);
		
		double sumTotal = (totalWeight/totalHeight);
		
		System.out.println("BMI: "+ sumTotal ys);
		



	}

}

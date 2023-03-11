import java.util.Scanner;

public class PoundKilogram{

//write a program that converts pound to kilogram. the program prompts the user to eneter a number in pound, convert it to kilogram and display the result, one pound is 0.454 kilograms.

	public static void main(String[] args){
	
		double kg = 0.454;
	
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter number in pounds:");
		
		double poundInput = userInput.nextDouble();
		
		double result = (kg*poundInput);
		
		System.out.println(poundInput+ "pound is "+ result +"kilograms");
	
	
	
	
	}


}

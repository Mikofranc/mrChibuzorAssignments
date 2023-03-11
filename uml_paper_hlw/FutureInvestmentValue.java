import java.util.Scanner;

public class FutureInvestmentValue{

// write a program that reads in investment amount, annual interest rate and number of years and displays the future investment value.

	public static void main(String[] args){
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the investment amount:");
		double investment = userInput.nextDouble();
		
		System.out.println("Enter annual interest rate in percentage:");
		double interestRate = userInput.nextDouble();

		System.out.println("Enter number of years:");
		double years = userInput.nextDouble();

		double total =investment+ Math.pow((1+interestRate/100),years);
		System.out.println("Accumulated value is $"+(Math.round(total*100.0)/100.0));







	}

}

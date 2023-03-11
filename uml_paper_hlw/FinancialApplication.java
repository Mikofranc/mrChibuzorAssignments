import java.util.Scanner;

public class FinancialApplication{

//write a program that reads the balance and the annual percentage interest and displays the interest for the next month.

	public static void main(String[] args){

		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter balance");
		double balance =userInput.nextDouble();

		System.out.println("Enter interest rate");
		double interest =userInput.nextDouble();

		double total =balance * (interest/1200);

		System.out.println("The interest is "+total);


	}

}

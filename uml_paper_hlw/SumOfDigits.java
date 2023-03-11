import java.util.Scanner;

public class SumOfDigits{

// write a program that reads an integar between 0 and 1000 and adds all the digits in the integer.

	public static void main(String[] args){

		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 and 1000");
		
		int number =userInput.nextInt();

		int sum = (number%10)+((number/10)%10)+(number/100);

		System.out.println("The sum of didgits is "+sum);


	}

}

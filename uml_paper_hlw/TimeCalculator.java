import java.util.Scanner;

public class TimeCalculator{

//write a program that prompts the user to enter the minutes (e.g 1 billion) and displays the number of years and days for the minutes. for simplicity, assume a year has 365 days.here is a sample run.

	public static void main(String[] args){
	
		System.out.println("Enter minutes");
	
		Scanner userInput = new Scanner(System.in);
		
		int randomNumber = userInput.nextInt();
		
		int minutes = 60;
		
		int days = (minutes*24);
		
		System.out.println(days);
		
		
		
		
		
		
	}
	
}

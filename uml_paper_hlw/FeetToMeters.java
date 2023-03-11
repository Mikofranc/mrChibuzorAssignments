import java.util.Scanner;

public class FeetToMeters{

//write a program that reads numbers, converts it to meters, and display the result. one foot is 0.305 meter.

	public static void main(String[] args){
	
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a value for feet:");
		
		double distance = userInput.nextDouble();
		
		double feet = 0.305;
		
		double total = (distance*feet);
	
		System.out.println(distance+"feet is "+total+"meters");
	
	
	
	
	
	}


}

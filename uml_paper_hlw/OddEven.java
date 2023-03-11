import java.util.Scanner;

public class OddEven{

//write a program that reads as set of integers, and then prints the sum of even and odd integers.

	public static void main(String[] args){
	
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter digit one : ");
		int digit1 = userInput.nextInt();
		System.out.println("Enter digit two: ");
		int digit2 = userInput.nextInt();
		System.out.println("Enter digit three: ");
		int digit3 = userInput.nextInt();
		System.out.println("Enter digit four : ");
		int digit4 = userInput.nextInt();
		int evenNumber = 0;
		int oddNumber = 0;1
		if(digit1 % 2 == 0){
			evenNumber += digit1;
		}
		else {
			oddNumber += digit1;
		}
		if(digit2 % 2 == 0){
			evenNumber += digit2;
		}
		else {
			oddNumber += digit2;
		}
		if(digit3 % 2 == 0){
			evenNumber += digit3;
		}
		else {
			oddNumber += digit3;
		}
		if(digit4 % 2 == 0){
			evenNumber += digit4;
		}
		else {
			oddNumber += digit4;
		}
		
		System.out.println("Even number: "+ evenNumber);
		
		System.out.println("Odd number: "+ oddNumber);
	}
	
}

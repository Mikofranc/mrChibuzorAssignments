import java.util.Scanner;

public class AreaofTriangle{

//write a program that prompts the user to eneter three points (x1,y1), (x2, y2), (x3,y3) of a triangle and display its area.

	public static void main(String[] args){
	
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter three points of a triangle");
		
		double x1 = userInput.nextDouble();
		double y1 = userInput.nextDouble();
		
		double x2 = userInput.nextDouble();
		double y2 = userInput.nextDouble();
		
		double x3 = userInput.nextDouble();
		double y3 = userInput.nextDouble();
	
	
		double sideA = x1 * y1;
		double sideB = x2 * y2;
		double sideC = x3 * y3;
		
		double sum = ((sideA + sideB + sideC) / 2);
		
		double one = ((sum-sideA)*sum);
		double two = ((sum-sideB)*sum);
		double three = ((sum-sideC)*sum);
		
		double area = (one*two*three);
		double sqrtArea = Math.sqrt(area);
		
		System.out.println("The area of the triangle is "+ area);
				
	
	
	
	
	
	
	
	}



}

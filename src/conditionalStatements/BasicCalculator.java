package conditionalStatements;
import java.util.Scanner;

public class BasicCalculator {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	int number1, number2, select;
	
	System.out.println("Enter first value ");
	number1 = input.nextInt();
	
	System.out.println("Enter second value ");
	number2 = input.nextInt();	
		
	System.out.println("1 for Addition ");
	System.out.println("2 for Subtraction ");
	System.out.println("3 for Multiplication");
	System.out.println("4 for Division ");
	
	select = input.nextInt();
	
	if(select == 1) {
		System.out.print(number1 + number2);
	}else if (select == 2) {
		System.out.print(number1 - number2);
	}else if (select == 3) {
		System.out.print(number1 * number2);
	}else if (select == 4) {
		System.out.print(number1 / number2);
	}else {
		System.out.println("Please, enter valid numbers ");
	}
		
		}

}

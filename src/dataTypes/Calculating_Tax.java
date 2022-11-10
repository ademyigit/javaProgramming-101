package dataTypes;
import java.util.Scanner;

public class Calculating_Tax {
public static void main(String[] args) {	
	
System.out.println("Welcome, this program calculates the tax amount of the price you enter. ");

int enteredValue;
Scanner tax = new Scanner(System.in);

System.out.println("Please enter your price ");
enteredValue = tax.nextInt();

System.out.println("I'm calculating...");

int withTax, onlyTax;
withTax = ((enteredValue*18)/100) + enteredValue;
onlyTax = (enteredValue*18)/100;

System.out.println("Without tax : "+ enteredValue) ;
System.out.println("With tax : " + withTax);
System.out.println("Only tax : " + onlyTax);



	
	
	
	
	
	
	
	
	}	
}

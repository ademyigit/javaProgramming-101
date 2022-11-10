package dataTypes;
import java.util.Scanner;
public class BodyMassIndex {
public static void main(String[] args) {

System.out.println("Welcome, I'm here to calculate your BMI ");
System.out.println("Let's get started ! ");

Scanner bmi = new Scanner(System.in);
double weight, height;

// For correct calculation, the unit of weight should be kg 
//and the unit of height should be meters.
System.out.print("Enter your weight : ");
weight = bmi.nextDouble();

System.out.print("Enter your height : ");
height = bmi.nextDouble();

double bmiCalc;
bmiCalc = weight / (height * height);

System.out.print("Your BMI is : " + bmiCalc);

		
		
		
		
		
		
		
		
		
		
	}
}

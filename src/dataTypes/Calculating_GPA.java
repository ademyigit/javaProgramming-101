package dataTypes;
import java.util.Scanner;

public class Calculating_GPA {
public static void main(String[] args) {
	//Practice1 write a program that caltulates the user's GPA.
	
	
	System.out.println("Welcome, this program will calculate your GPA ");
	System.out.println("Firstly enter your grades ");
	
	int math, phys, bio, hist, eng;
	Scanner grade = new Scanner(System.in);
	
	System.out.print("Enter your MATH grade : ");
	math = grade.nextInt();
	
	System.out.println("Thanks, next ");
	
	System.out.print("Enter your PHYS grade : ");
	phys = grade.nextInt();
	
	System.out.println("Thanks, next");
	
	System.out.print("Enter your BIO grade : ");
	bio = grade.nextInt();
	
	System.out.println("Thanks, next");

	System.out.print("Enter your HIST grade : ");
	hist = grade.nextInt();
	
	System.out.println("Thanks, next");

	System.out.print("Enter your ENG grade : ");
	eng = grade.nextInt();
	
	System.out.println("I'm calculating...");
	
	
	int total = (math + phys + bio + hist + eng);
	double result = total / 5.0;
	
	System.out.print("Your average is "+ result);
		
		

	
	
	
	
	
	
	
	
	
	
	
	
	
}
}

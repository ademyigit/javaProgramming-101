package loops;
import java.util.Scanner;
import java.util.zip.ZipEntry;

import javax.swing.plaf.InputMapUIResource;

public class SubtractionQuizLoop {
	public static void main(String[] args) {
		final int END_OF_QUESTION = 5;
		int correctCount = 0;
		int count = 0;

		long startTime = System.currentTimeMillis();
		String output = " ";
		
		Scanner input = new Scanner(System.in);
		
		while(count < END_OF_QUESTION) {
			int num1 = (int)(Math.random() * 10);
			int num2 = (int)(Math.random() * 10);
			
		if(num1 < num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
			
		}
			
	System.out.print("What is " + num1 + " - " + num2 + " ? ");
	int answer = input.nextInt();
	
	if(answer == num1-num2) {
		System.out.print("Correct ! ");
		correctCount++;
	}
	else {
		System.out.print("False ! " + num1 + " -  " + num2 + " should be " + (num1-num2) + ", ");
	
	}
	count++;
	output += "\n" + num1 + "-" + num2 + "=" + answer + ((num1 - num2 == answer) ? " correct" : " wrong");
		
	
	



		
		
		}
		
	
	
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		
		System.out.println("Correct count is " + correctCount +"\nTest time is " + testTime / 1000 + " seconds\n" + output);

	
	
	
	
	
	
	
	}

}

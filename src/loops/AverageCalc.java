package loops;
import java.util.Scanner;

import javax.sql.rowset.JoinRowSet;

public class AverageCalc {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

int enteredValue;
int sum = 0;
int counter = -1;
//this program returns the average of numbers from 0 to the number entered, divisible by 3 and 4
	
System.out.print("Enter a value : ");
enteredValue = input.nextInt();

for (int i = 0 ; i<enteredValue ; i++) {
	
if(i%3 == 0 && i%4 == 0) {
	sum += i;
	counter++;
	
}

}

System.out.print(sum/counter);
	
	}
}

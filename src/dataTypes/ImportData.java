package dataTypes;
import java.util.Scanner;


public class ImportData {
public static void main(String[] args) {
	//Learning -- what is scanner, how to get data from users.
	
	Scanner input = new Scanner(System.in);
	int a,b;
	System.out.println("enter A value ");
	a = input.nextInt();
	
	System.out.println("enter B value ");
	b = input.nextInt();
	
	System.out.println("A value = " + a);
	System.out.println("B value = "+ b);

	
}
}

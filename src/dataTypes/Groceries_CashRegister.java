package dataTypes;
import java.util.Scanner;

public class Groceries_CashRegister {
public static void main(String[] args){
 Scanner groceries = new Scanner(System.in);
 
 double pear, apple, tomato, banana, eggplant;

 System.out.println("Hi, Can you enter the weight of the fruits and vegatables you bought ?");
 
 System.out.print("Pear : ");
 pear = groceries.nextDouble();
 
 System.out.print("Apple : ");
 apple = groceries.nextDouble();
 
 System.out.print("Tomato : ");
 tomato = groceries.nextDouble();
 
System.out.print("Banana : ");
banana = groceries.nextDouble();

System.out.print("Eggplant : ");
eggplant = groceries.nextDouble();

double pearPrice, applePrice, tomatoPrice, bananaPrice, eggplantPrice;
pearPrice = 2.15;
applePrice = 3.65;
tomatoPrice = 1.15;
bananaPrice = 0.95;
eggplantPrice = 5.0;

double total ;

total = (pear * pearPrice) + (apple * applePrice) + (tomato * tomatoPrice) + (banana * bananaPrice) + (eggplant * eggplantPrice);
	
System.out.print("Total price : " + total);	
	
	
	
	
	
	
	
	
	
	
	}
}

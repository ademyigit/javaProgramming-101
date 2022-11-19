package arrays;

import java.util.Scanner;

public class UserArchive {

	public static void userList() {
		String userListArray[] = new String[5];
		
		userListArray[0] = ("1- Adem Yiğit");
		userListArray[1] = ("2- Ayça Aydın");
		userListArray[2] = ("3- Semih Göl");
		userListArray[3] = ("4- Batuhan Eyüboğlu");
		userListArray[4] = ("5- Çağan Yılmaz");
	
		for(int i = 0 ; i<userListArray.length ; i++) {
		System.out.println(userListArray[i]);
	}
}

public static void userAgeAvg() {
	int userAgeList[] = new int[5];
	
	userAgeList[0] = 20;
	userAgeList[1] = 19;
	userAgeList[2] = 21;
	userAgeList[3] = 22;
	userAgeList[4] = 22;
	
	double sum = 0;
	double result;
	for(int j = 0; j<userAgeList.length ; j++) {
	sum += userAgeList[j];
		
	}
	result = sum/userAgeList.length;
	
	System.out.println(result);	
	
}

public static int SelectUser(int selection) {
	String userListArray[] = new String[5];
	userListArray[0] = ("Adem Yiğit \n20 \nComputer Engineer \nAtaşehir");
	userListArray[1] = ("Ayça Aydın \n19 \nSoftware Engineer \nBostancı");
	userListArray[2] = ("Semih Göl \n21 \nBack-End Developer \nTuzla");
	userListArray[3] = ("Batuhan Eyüboğlu \n22 \nGame Developer \nPendik");
	userListArray[4] = ("Çağan Yılmaz \n22 \nFront-End Developer \nKartal");
	
	switch (selection) {
	case 1 :
		System.out.print(userListArray[0]);
		break;
	case 2 :
		System.out.print(userListArray[1]);
		break;
	case 3 :
		System.out.print(userListArray[2]);
		break;
	case 4 :
		System.out.print(userListArray[3]);
		break;
	case 5 :
		System.out.print(userListArray[4]);
		break;
	default:
		System.out.print("You made a choice that doesn't exist, try again");
	}
	
	return selection;
}

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Welcome the User Archive ! ");
System.out.println("These are our all users : ");
userList();

System.out.println("Our age average is : " );
userAgeAvg();

System.out.print("Which user would you like information about? 1-5 ");
int selection;
selection = input.nextInt();
SelectUser(selection);
	
	
	
	
	
	
	
	
	
	}
}
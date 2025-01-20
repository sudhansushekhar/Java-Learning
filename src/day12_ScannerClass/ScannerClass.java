package day12_ScannerClass;

import java.util.Scanner;

public class ScannerClass {
	/*Scanner - it is used to get user input from java util package
	 * to use it first create an object of class and then use any of the available methods found in scanner class
	 * Syntax- Scanner sc = new Scanner(System.in);
	 * String name = sc.neXtLine();
	 * 
	 * Scanner class methods to get user input
	 * nextBoolean() - boolean value from user
	 * nextByte() - byte value from user
	 * nextDouble() - double value from user
	 * nextFloat() - float value from user
	 * nextInt() - integer value from user
	 * nextLine() - string value from user
	 * nextLong() -long value from user
	 * nextShort() - short value from user
	 */
	public static void main(String[] args) {
		
		// create object of scanner class
		Scanner sc = new Scanner(System.in);	
		 
		System.out.print("Enter your name :");
		String name = sc.nextLine();
		System.out.println("Name entered is : "+ name);
		
		//enter integer value
		System.out.print("Enter your Roll no :");
		int roll = sc.nextInt();
		System.out.println("Roll number entered is :"+ roll);
		
		// Clear the buffer
        sc.nextLine(); // Consume the leftover newline character
        
		//Multiple input at once
		System.out.print("Enter your city, pin code, phone number & Indian Citizen?(true/false) :");
		String city = sc.nextLine();
		int pCode = sc.nextInt();
		double phone = sc.nextDouble();
		boolean bool = sc.nextBoolean();
		System.out.println("You have entered, '"+city + "' as city");
		System.out.println("You have entered, '"+pCode+ "' as Pin Code");
		System.out.println("You have entered, '"+phone +"' as Phone Number");
		System.out.println("You have entered, '"+bool +"' as Indian Citizen");
		
		sc.close();
	}

}

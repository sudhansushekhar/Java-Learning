package day11_StaticKeyword;

public class StaticMethods {
	// STATIC- it is used for memory management. It can be variables, methods and blocks
	/*
	 * Static methods - belongs to class rather than the object of class
	 * Static methods - can be invoked without the need for creating an instance of a class
	 * Static methods - can access static data member and can change the value of it
	 */
	
	/* RESTRICTION TO USE STATIC METHODS
	 * 1. cannot use non-static data member or call a non-static method directly
	 * 2. this and super cannot be used in static context
	 */

	// class variables
	int roll; // non-static variable - unique
	String studentName; // non-static variable - unique
	static String collegeName = "JHPS"; // static variable because it's common to all as memory allocated only once

	StaticMethods(int rollNo, String stdName){
		roll = rollNo;
		studentName = stdName;
	}
	
	void display() {
		System.out.println(studentName +"," + roll + "," + collegeName);
	}
	
	//static method to change value
	static void changeValue() {
		collegeName = "DAV Public School";
	} 
	public static void main(String[] args) {
		// create object to use non-static variable

		StaticMethods std1 = new StaticMethods(2025001, "Himanshu");
		StaticMethods std2 = new StaticMethods(2025002, "Sudhanshu");
		
		std1.display();
		std2.display();
		changeValue();
		System.out.println("----changed value----");
		std1.display();
		std2.display();
		
	}

}

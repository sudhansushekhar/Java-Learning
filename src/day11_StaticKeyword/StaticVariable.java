package day11_StaticKeyword;

public class StaticVariable {
	// STATIC- it is used for memory management. It can be variables, methods and blocks
	/*
	 * Static variable - gets memory only once during class loading
	 */

	// class variables
	int roll; // non-static variable - unique
	String studentName; // non-static variable - unique
	static String collegeName = "JHPS"; // static variable because it's common to all as memory allocated only once

	public static void main(String[] args) {
		// create object to use non-static variable

		StaticVariable std1 = new StaticVariable();
		std1.roll = 2025001;
		std1.studentName = "Aarushi Singh";

		System.out.println(std1.studentName + "," + std1.roll + "," + std1.collegeName);

		//second object for new records
		StaticVariable std2 = new StaticVariable();
		std2.roll = 2025002;
		std2.studentName = "Laskhit Singh";

		System.out.println(std2.studentName + "," + std2.roll + "," + std2.collegeName);
	}

}

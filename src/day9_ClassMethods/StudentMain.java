package day9_ClassMethods;

public class StudentMain {

	public static void main(String[] args) {
		// Ways to store data into variables

		// 1. Object refrence variable
		/*
		 * Student std = new Student(); std.sid=101; std.sName="Rahul"; std.sGrad = 'A';
		 * 
		 * //call the method to print data std.printdata();
		 */

		// 2. Using method
		/*
		 * Student std = new Student();
		 
		std.setData(102, "Sanaya", 'B');
		std.printdata();
		*/
		
		
		// 3. Using Constructor
		Student std = new Student(102, "Sanaya", 'B');
		std.printdata();
	}

}

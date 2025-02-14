package day8_ClassAndObjects_OOP;

public class StudentMain2 {

	public static void main(String[] args) { // <-- main method
		// create object of class to call the method for employee 1
		Student2 std1 = new Student2();

		// Assign the values to the variables for employee 1
		std1.sid = 101;
		std1.sname = "Sudhanshu";
		std1.grad = 'a';

		// call the method for employee1
		std1.display();

		// create object of class to call the method for employee 2
		Student2 std2 = new Student2();

		// Assign the values to the variables for employee 2
		std2.sid = 102;
		std2.sname = "Himanshu";
		std2.grad = 'b';

		// call the method for employee2
		std2.display();

	}

}

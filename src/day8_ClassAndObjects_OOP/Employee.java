package day8_ClassAndObjects_OOP;

public class Employee {
	// Class contains variables & methods

	// variables
	int eid;
	String ename;
	String ejob;
	int esalary;

	// methods - without parameters and no return type
	void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(ejob);
		System.out.println(esalary);
	}
/*
	public static void main(String[] args) { // <-- main method
		// create object of class to call the method for employee 1
		Employee emp1 = new Employee();

		// Assign the values to the variables for employee 1
		emp1.eid = 101;
		emp1.ename = "Sudhanshu";
		emp1.ejob = "QA";
		emp1.esalary = 10000;

		// call the method for employee1
		emp1.display();

		// create object of class to call the method for employee 2
		Employee emp2 = new Employee();

		// Assign the values to the variables for employee 2
		emp2.eid = 102;
		emp2.ename = "Himanshu";
		emp2.ejob = "Senior QA";
		emp2.esalary = 23000;

		// call the method for employee2
		emp2.display();

	}
	*/

}

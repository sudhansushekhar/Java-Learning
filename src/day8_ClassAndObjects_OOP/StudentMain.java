package day8_ClassAndObjects_OOP;

public class StudentMain {

	public static void main(String[] args) {
		// Ideally methods and main methods doesn't reside in the same class. 
		// we separate them in two class. One with main method and other without main method.
		// common methods will have methods in without main method class
		// Main method class will use those methods to perform action.
		// create object of StudentCommonMethods to call methods from other class without main method
		
		StudentCommonMethods stdMethods = new StudentCommonMethods(); // object created for class without main method
		
		//initialise object and assign data in the methods by using refrence variable of non main class
		stdMethods.insertRecord("Sudhanshu", 30);
		
		//call another method from non main class
		stdMethods.displatInfo();

	}

}

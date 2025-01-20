package day9_ClassMethods;

public class ParameterisedMethods {

	static void printFullName(String firstName, String lastName) {
		System.out.println("Full name is :" + firstName + " " + lastName);
	}
	
	void sumOfNumbers(int a, int b) {
		System.out.println("Sum of two number is :" + (a+b));
	}
	
	public static void main(String[] args) {
		// since method is static no need to create class object
		printFullName("Sudhanshu", "Shekhar");
		
		//create object of non-static class
		ParameterisedMethods pm = new ParameterisedMethods();
		pm.sumOfNumbers(3, 5);
	}
	

	

}

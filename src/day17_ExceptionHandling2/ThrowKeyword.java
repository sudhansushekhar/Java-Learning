package day17_ExceptionHandling2;

public class ThrowKeyword {
	// THROW - used to create a custom error. It is used to throw single exception for a method.
	// Syntax - throw new exception_class("error message")
	
	static void checkAge(int age) {
		if (age<18) {
			throw new ArithmeticException("Access Denied!! Age must be more than 18 years");
		}
		else
			System.out.println("Access granted");
	}
	public static void main(String[] args) {
		// create object to call method
		try {
		checkAge(19);
		}
		catch(ArithmeticException e) {	
			System.out.println("Exception is:"+ e.toString());
		}
		
		System.out.println("-----Code after try-catch-----");
	}

}

package day17_ExceptionHandling2;

import java.io.IOException;

public class ThrowsKeyword {
	// THROWS - indicates what exception type may be thrown by a method. It gives information that there is a chance to occur exception in a method.
	// It is better to do exception handling in the code so that normal flow can be maintained
	
	// Syntax - return_type methodName() throws exception_ClassName
	
	
	static void checkAge(int age) throws ArithmeticException, IOException{
		if (age<18) {
			throw new ArithmeticException("Access Denied!! Age must be more than 18 years");
		}
		else
			System.out.println("Access granted");
	}
	public static void main(String[] args) {
		// create object to call method
		try {
		checkAge(17);
		}
		catch(Exception e) {	
			System.out.println("Exception is:"+ e.toString());
		}
		
		System.out.println("-----Code after try-catch-----");
	}


}

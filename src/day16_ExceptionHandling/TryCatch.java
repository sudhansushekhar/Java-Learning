package day16_ExceptionHandling;

public class TryCatch {
	/*Types of Error
	 * 1. Compile Time Error/ Checked Error
	 * 		a. Syntax error - e.g. in a; in place of int a;
	 * 		b. Semantic error - undeclared variable. e.g. a=b+c; and a,b,c are not declared. Multiple declaration of same variable, datat type mismatch
	 * 			e.g. declared int a; and storing a="name"; i.e. as string
	 * 2. Runtime Error / Unchecked Error(Exception Error) - 
	 * 		Any event that interrupts the normal flow of program execution. Ex- arithematic exception, null pointer exception, divide by zero exception.
	 * 		It is an object which thrown at runtime
	 */
	
	//EXCEPTIONS - Abnormal condition or event that interrupts the execution of program instructions and disrupts the nore flow
	/*
	 * try - used to specify a block where there is chance of exception. 'try' block must be followed by catch or finally. It cannot be used alone. 
	 * catch - It must be preceded by 'try' block. Not used alone. It can be followed by 'finally' block.
	 * finally - used to execute necessary code of the program. It is executed whether exception is handled or not
	 * throw - used to throw exception
	 * throws - used to declare exceptions. It specifies that there might be a chance to occur an exception in the method. It doesn't throw exception.
	 * 			It is always used with method signature.
	 */
	
	// In try-catch-finally blocks, if there is no error in in the 'try' block then 'catch' block will not execute but 'finally' block will execute.
	// In try-catch-finally blocks, if there is error in in the 'try' block then 'catch' block will execute and then 'finally' block will execute.
	public static void main(String[] args) {
		try {
		// Arithematic exception handling
		int result = 100/0; //will throw arithematic exception/ by zero
		System.out.println("Result is :"+result);
		}
		catch(ArithmeticException e) {
			System.out.println(e.toString());
		}
		System.out.println("Line after Arithematic exception in Java"); //this line will not execute if there is exception and try-catch is not used
		
		try {
		// NullPointer exception handling
		String result = null; //will throw nullPointerException
		System.out.println("Length of String is :"+ result.length());
		}
		catch(NullPointerException e) {
			System.out.println(e.toString());
		}
		System.out.println("Line after Null Pointer exception in Java"); //this line will not execute if there is exception and try-catch is not used
		
		try {
		// NumberFormat exception handling
		String result = "name"; 
		int i = Integer.parseInt(result); //will throw NumberFormat Exception
		
		System.out.println("String converted into integer is :"+ i);
		}
		catch(NumberFormatException e) {
			System.out.println(e.toString());
		}
		finally {
		System.out.println("---Line after Number format exception in Java- in finally block---"); //this line will not execute if there is exception and try-catch is not used
		}
		try {
		// ArrayIndex Out of bound exception handling
		int [] a = new int [5];
		a[6] = 23; //will throw Array Out of bound exception
		
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
		finally {
		System.out.println("---Line after ArrayIndex Out of bound exception in Java- in finally block---"); 
		}
		
		//try-finally not executing catch
		try {
		int [] a = new int [5];
		a[3] = 23;
		
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}
		finally {
		System.out.println("---Line in finally block---"); 
			}
	}

}

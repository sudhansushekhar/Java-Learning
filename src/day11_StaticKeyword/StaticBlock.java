package day11_StaticKeyword;

public class StaticBlock {
	//STATIC BLOCK
	/*
	 * used to initialize static data members
	 * static block is invoked before main method during class loading
	 */
	static
	{
		System.out.println("This is a static block");
	}
	public static void main(String[] args) {
		// This main method is static because while calling static method object creation is not required but with non-static it is required
		// And also to prevent extra memory allocation each time, the main method is called and object is created
		System.out.println("This is a main method");
	}

}

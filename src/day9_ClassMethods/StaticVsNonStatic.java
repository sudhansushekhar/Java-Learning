package day9_ClassMethods;

public class StaticVsNonStatic {

	// method without parameter and no return type i.e. void

	static void printMessage() { // modifier- static, return type- void, parameter - no parameter
		// mothod body
		System.out.println("----------Static Method---------");
		System.out.println("This is a static method with no return type and no parameter");
		System.out.println(
				"This method has Static as modifier. Since it's static,  Class Object creation is not required.");
	}

	void displayMessage() { // modifier- non-static, return type- void, parameter - no parameter
		// mothod body
		System.out.println("----------Non-Static Method---------");
		System.out.println("This is a non-static method with no return type and no parameter");
		System.out.println(
				"This method has no modifier so it's non-Static. Since it's non-static, Class Object creation is required.");
	}

	public static void main(String[] args) {
		// Creating object to call the static method is not required
		printMessage();

		// Creating object to call the non-static method is required
		StaticVsNonStatic stv = new StaticVsNonStatic();
		stv.displayMessage();

	}

}

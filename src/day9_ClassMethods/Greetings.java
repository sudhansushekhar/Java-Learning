package day9_ClassMethods;

public class Greetings {
	// No parameter - no return value

	void m1() {
		System.out.println("Hello...This is method with no parameter and with no return value");
	}

	// No parameter - return value

	String m2() {
		return ("This is method with no parameter and with return value");
	}

	// parameter - No return value

	void m3(int a) {
		System.out.println("This is method with parameter and with no return value :" + a);
	}
	// parameter - Return value

	String m4(int a) {
		return("This is method with parameter and with return value :" + a);
	}

}

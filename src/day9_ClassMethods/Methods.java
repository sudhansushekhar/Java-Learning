package day9_ClassMethods;

public class Methods {

	// METHOD - collection of statement to perform a specific task
	// Method has access modifier(public, private, static), return type(string, integer, boolean and void), name and parameter
	// Parameters can be passed in the body statements if defined else it can be left blank because its optional
	// Return Type is not optional its required, if it doesn't return any thing then it is set to void
	
	// method without parameter and no return type i.e. void
	
	static void printMessage() {	//modifier- static, return type- void, parameter - no parameter
		// mothod body
		System.out.println("This is a method with no return type and no parameter");
		System.out.println("This method has Static as modifier. Since it's static, Object creation is not required.");
	}
	
	// Entry point of application
	public static void main(String[] args) {
		// Creating object to call the static method is not required
		
		printMessage();
		
	}

}

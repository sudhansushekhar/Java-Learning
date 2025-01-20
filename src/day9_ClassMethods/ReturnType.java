package day9_ClassMethods;

public class ReturnType {

	// Return type in methods are string and integers because after adding and concatenating
	// we are not printing we're just adding and concatenating
	static String printFullName(String firstName, String lastName) {

		return (firstName + " " + lastName); // method exit here
	}

	int sumOfNumbers(int a, int b) {

		return (a + b); // method exit here
	}
	
	//return type with condition
	static int minOfTwo(int a, int b) {
		if (a<b)
			return a;
		else
			return b;
	}
	
	public static void main(String[] args) {
		// Object Creation to call the static method is not required
		String fullName = printFullName("Sudhanshu", "Shekhar"); // store the value of fullNmae into String
		System.out.println("Full name is :" + fullName);
		
		// print inimum of two numbers
		int minNumber = minOfTwo(1, 3);
		System.out.println("Minimum of two numbers is:" + minNumber);

		// Creating object to call the non-static method is required
		ReturnType rt = new ReturnType();
		int sum = rt.sumOfNumbers(5, 8); // store the value of sum into int
		System.out.println("Sum of two numbers is :" + sum);
		
		
	}

}

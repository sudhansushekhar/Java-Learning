package day7_StringOperations;

public class strings {

	public static void main(String[] args) {
		// String manipulation methods

		// fetching character at any index
		String a = "Sudhanshu";

		// print character at 3rd index
		char ch = a.charAt(3);
		System.out.println("character at index 3 is :" + ch);

		// print length of the string
		int length = a.length();
		System.out.println("No of characters or Length of the string is :" + length);

		// convert string into lowercase
		String lowerCase = a.toLowerCase();
		System.out.println("Lowercase of the string is :" + lowerCase);

		// convert string into uppercase
		String upperCase = a.toUpperCase();
		System.out.println("Lowercase of the string is :" + upperCase);

		// ---------------------------------------------------------------//

		String name = "Hello Java";

		// make the string "Hello Pawa". By replacing 'J' with 'P'
		String newName = name.replace('J', 'P');
		System.out.println(newName);

		// Replace all 'A' with 'I'
		String newName2 = name.replace("a", "I"); // here character is case sensitive
		System.out.println(newName2);

		String newName3 = name.replace("A", "I");
		System.out.println(newName3); // Output: Hello Java (No change due to case sensitivity)

		// Replace "Java" with "Python"
		String newName4 = name.replace("Java", "Python");
		System.out.println(newName4);

		// ------------------------------------------------//
		String str = "Hello Java";
		// print the index if letter J
		int index = str.indexOf('J');
		System.out.println("Index of character 'J' in 'Hello Java' is :" + index);

		// print the substring from index 4
		String subStr = str.substring(4);
		System.out.println("Substring of 'Hello Java' at index 4 is :" + subStr);

		// print the substring from index 4
		String subStr2 = str.substring(2,7);
		System.out.println("Substring of 'Hello Java' at index 2 to 7 is :" + subStr2);

		// print if string is empty
		String b = "";
		System.out.println("Is Empty : " + b.isEmpty()); // Output: TRUE
		System.out.println("Is Empty : " + str.isEmpty()); // Output: FALSE
	}

}

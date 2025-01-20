package day7_StringOperations;

public class StringManipulation {

	public static void main(String[] args) {
		// COntains character
		String name = "Sudhanshu";
		System.out.println("String contains character 'd' :" + name.contains("shu")); // true
		System.out.println("String contains character 'd' :" + name.contains("manu")); // false

		// Trim - trims white space before and after the string

		String codeName = "  Sudhanshu Shekhar    ";
		System.out.println("String before Trim : " + codeName);
		String trimmedName = codeName.trim();
		System.out.println("String after Trim : " + trimmedName);

		// check of starts with
		System.out.println("-------Starts with-----------");

		System.out.println("Does string 'Sudhanshu Shekhar' starts with 'S' :" + trimmedName.startsWith("S")); // true
		System.out.println("Does string 'Sudhanshu Shekhar' starts with 'p' :" + trimmedName.startsWith("P")); // false
		System.out.println("Does string 'Sudhanshu Shekhar' starts with 'Sud' :" + trimmedName.startsWith("Sud")); // true

		// check of starts with
		System.out.println("-------Ends with-----------");
		System.out.println("Does string 'Sudhanshu Shekhar' ends with 'r' :" + trimmedName.endsWith("r")); // true
		System.out.println("Does string 'Sudhanshu Shekhar' ends with 'p' :" + trimmedName.startsWith("P")); // false
		System.out.println("Does string 'Sudhanshu Shekhar' ends with 'shu' :" + trimmedName.startsWith("shu")); // true

		// check substring starts with
		String str = "WelCome";
		System.out.println("-------Starts with string at Index-----------");

		System.out.println("Does 'WelCome' subString has 'Come' at index 3 :" + str.startsWith("Come", 3)); // true
		System.out.println("Does 'WelCome' subString has 'Come' at index 3 :" + str.startsWith("Nome", 3)); // false
		
		//String comparison
		System.out.println("-------Equals of string-----------");
		String str2 = "Home";
		String str3 = "WelCome";
		String str4 = "welCome";
		System.out.println("Is 'WelCome' equal to 'Home' :" + str.equals(str2)); //false
		System.out.println("Is 'WelCome' equal to 'Home' :" + str.equals(str3)); //true

		//check equality of strings with case sensitivity
		System.out.println("Is 'WelCome' equal to 'welCome' without case sensitivity :" + str3.equalsIgnoreCase(str4)); //true
		
		//String concatenation
		String newStr1 = str3 + str2; // WelCome + Home = WelcomeHome
		String newStr2 = str3.concat(str2); // WelCome + Home = WelcomeHome
		String newStr3 = str3 + " " +str2; // WelCome + Home = Welcome Home
		String newStr4 = str3.concat(" ").concat(str2); // WelCome + Home = Welcome Home
		System.out.println(newStr1);
		System.out.println(newStr2);
		System.out.println(newStr3);
		System.out.println(newStr4);
	}

}

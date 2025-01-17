package day2;

public class operators {
//Operators- symbols used to perform operations
	// 1. Arithematic -> +,-,*,/,%,++ and--
	// 2. Relational(comparison) -> ==,!=,>,<,>= and <=
	// 3. Assignment -> =
	// 4. Logical -> &&, ||, !
	// 5. Conditional(Ternary) -> ?:

	public static void main(String[] args) {
		// 1. Arithematic -> +,-,*,%,++ and--

		int a = 10;
		int b = 5;
		System.out.println("----------Arithematic Operators examples-------------");

		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		//increment operator
		System.out.println(a++); //print then increase- O/P: 10
		System.out.println(a);	//O/P: 11
		System.out.println(++a); //increase then print- O/P: 12
		
		//decrement operator
		System.out.println(b--); //print then decrease- O/P: 5
		System.out.println(b);	//O/P: 4
		System.out.println(--b); //decrease then print- O/P: 3
		
		// 2. Relational(comparison) -> ==,!=,>,<,>= and <=  O/P- True or False
		System.out.println("----------Relational Operators examples-------------");
		System.out.println(a==b); //false
		System.out.println(a!=b); //true
		System.out.println(a>b); //true
		System.out.println(a<b); //false
		System.out.println(a>=b); //true
		System.out.println(a<=b); //false
		
		// 3. Assignment -> =  to assign some value
		System.out.println("----------Assignment Operators examples-------------");
		int c=0;
		int d=10;
		//since 'd' has value 10, I can assign 10 to 'c' and make c=10
		System.out.println(c);  //c=0
		System.out.println(c=d); //assigned 'c' is equal to 'd' now O/P 10
		System.out.println(c); //c=10
		
		// 4. Logical -> &&, ||, !
				System.out.println("----------Logical AND Operators examples-------------");
				boolean e = true;
				boolean f = true;
				boolean g = false;
				boolean h = false;
				//AND &&- if both are true then o/p is TRUE else FALSE (any one is FALSE then return FALSE)
				System.out.println(e && f); //TRUE , TRUE = TRUE
				System.out.println(e && g); //TRUE , FALSE = FALSE
				System.out.println(g && e); //FALSE , TRUE = FALSE
				System.out.println(g && h); //FALSE , FALSE = FALSE
				System.out.println("----------Logical OR Operators examples-------------");
				//OR ||- if both are false then o/p is FALSE else TRUE (any one should be TRUE to return TRUE)
				System.out.println(e || f); //TRUE , TRUE = TRUE
				System.out.println(e || g); //TRUE , FALSE = TRUE
				System.out.println(g || e); //FALSE , TRUE = TRUE
				System.out.println(g || h); //FALSE , FALSE = FALSE
				
				//NOT ! - this invert the current value i.e. true to false and false to true
				System.out.println("----------Logical NOT Operators examples-------------");
				System.out.println(!e); // FALSE
				System.out.println(!f); // FALSE
				System.out.println(!g); // TRUE
				System.out.println(!h); // TRUE
				
				// 5. Conditional(Ternary) Operator -> ?:
				System.out.println("----------Conditional/Ternary Operators examples-------------");
				int num1 = 20;
				int num2 = 27;
				
				int minimum =num1<num2?num1:num2;  // if 'num1' is less than 'num2', then o/p is 'num1' otherwise o/p is 'num2'
				System.out.println(minimum);//print 20
				
				int maximum =num1>num2?num1:num2;  // if 'num1' is greater than 'num2', then o/p is 'num1' otherwise o/p is 'num2'
				System.out.println(maximum);//print 27
	}

}

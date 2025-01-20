package day13_Polymorphism;

public class ConstructorOverloading {

	//Constructor Overloading - multiple methods with same name but different parameters or data types
		/*
		 * 1. same name
		 * 2. different number of parameters
		 * 3. If same number of parameter then different data types
		 * Advantage- save memory and increase program readability
		 */
		
	ConstructorOverloading(int a) {  //1 parameter
			System.out.println("First Method :"+a);
		}
		
	ConstructorOverloading(int a, int b) { //2 parameters
			System.out.println("Second Method :"+(a+b));
		}
		
	ConstructorOverloading(double a) { //1 parameter
			System.out.println("Third Method :"+a);
		}
		
	ConstructorOverloading(String a, String b) {  //2 parameters same like second constructor but with different data types
			System.out.println("Fourth Method :"+a+b);
		}
		
	ConstructorOverloading(String a, int b) { //2 parameters same like second constructor but with different data types
			System.out.println("Fifth Method :"+a+b);
		}
		
	ConstructorOverloading(double a, double b) {  //2 parameters different data type like second constructor
			System.out.println("Sixth Method :"+(a+b));
		}
		
		public static void main(String[] args) {
			// create object to call methods
			
			ConstructorOverloading cOverloading1 = new ConstructorOverloading(3); //1 parameter - first constructor will be called
			ConstructorOverloading cOverloading2 = new ConstructorOverloading(3,8); //2 parameters - second constructor will be called - different data type
			ConstructorOverloading cOverloading3 = new ConstructorOverloading("Sudhanshu", "Shekhar"); //2 parameters - fourth constructor will be called
			ConstructorOverloading cOverloading4 = new ConstructorOverloading("Sudhanshu ",3); //2 parameters - fifth constructor will be called
			ConstructorOverloading cOverloading5 = new ConstructorOverloading(3.1,2.6); //2 parameters - sixth constructor will be called because of different data type
			ConstructorOverloading cOverloading6 = new ConstructorOverloading(2.6); //1 parameter - third constructor will be called because of different data type

		}


}

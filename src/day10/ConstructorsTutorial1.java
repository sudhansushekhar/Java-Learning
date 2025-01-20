package day10;

public class ConstructorsTutorial1 {
	// CONSTRUCTORS - special method to initialize objects. The constructor is called when an object of a class is created.
	// It can be used to set initial values for object attributes.
	
	//-------------- Rule to create construcor-----------//
	//1. constructor name must be same as its class name
	//2. constructor must have no explicit return type
	//3. constructor cannot be static abstract, final in java
	
	//Note: we can have private, public, protected or default constructor in Java
	// Syntax- 
	/* class abc(){
	 * 		abc(){
	 * 			constructor body
	 * 			initialize values of the class attribute
	 *	 } constructor exit here
	 * }
	 */
	
	int a; //attribute of class
	ConstructorsTutorial1()	// this is constructor without parameter
	{
		//initialize objects
		a=10; // initialize value of attribute
	}
	
	public static void main(String[] args) {
		// create object of constructor
		ConstructorsTutorial1 ct = new ConstructorsTutorial1(); //this will call constructor same like it call methods
		int b = ct.a;
		System.out.println("Constructor attribute value is:"+b);

	}

}

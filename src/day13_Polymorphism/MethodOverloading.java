package day13_Polymorphism;

public class MethodOverloading {
	//Method Overloading - multiple methods with same name but different parameters or data types
	/*
	 * 1. same name
	 * 2. different number of parameters
	 * 3. If same number of parameter then different data types
	 * Advantage- save memory and increase program readability
	 */
	
	void add(int a, int b) {  //2 parameters
		System.out.println("First Method :"+(a+b));
	}
	
	void add(int a, int b, int c) { //3 parameters
		System.out.println("Second Method :"+(a+b+c));
	}
	
	void add(int a, int b, int c, int d) { //4 parameters
		System.out.println("Third Method :"+(a+b+c+d));
	}
	
	void add(String a, String b) {  //2 parameters same like first method but with different data types
		System.out.println("Fourth Method :"+a+b);
	}
	
	void add(String a, int b) { //2 parameters same like first method but with different data types
		System.out.println("Fifth Method :"+a+b);
	}
	
	void add(double a, double b) {  //2 parameters different data type like first method
		System.out.println("Sixth Method :"+(a+b));
	}
	
	public static void main(String[] args) {
		// create object to call methods
		
		MethodOverloading mOverloading = new MethodOverloading();
		
		mOverloading.add(2,4,9); //3 parameters - second method will be called
		mOverloading.add("Sudhanshu ", 30); //2 parameters - fifth method will be called - different data type
		mOverloading.add("Sudhanshu","Shekhar");//2 parameters - fourth method will be called - different data type
		mOverloading.add(12,4,9,8); //4 parameters - third method will be called
		mOverloading.add(2,9.8);	//2 parameters - sixth method will be called because of different data type
	}

}

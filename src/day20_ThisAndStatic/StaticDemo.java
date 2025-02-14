package day20_ThisAndStatic;

public class StaticDemo {
	
	static int a=10; //static variable
	int b = 20; // non-static variable
	
	static void m1() //static method
	{ 
		System.out.println("This is static method m1");
	}
	
	void m2() //non-static method
	{
		System.out.println("This is non-stastic method m2");
	}
	
	void m3() //non-static method accessing both static and non-static methods and variable directly
	{
		m1();		
		m2();
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public static void main(String[] args) {
		
		// static methods access directly		
		System.out.println(a);
		m1();
		
		//non-static needs object creation
		StaticDemo sd = new StaticDemo();
		System.out.println(sd.b);
		sd.m2();
		
		sd.m3();	// here m3 is in static method

	}

}

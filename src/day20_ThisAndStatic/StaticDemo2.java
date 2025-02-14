package day20_ThisAndStatic;

public class StaticDemo2 {

	static int a = 10; // static variable
	int b = 20; // non-static variable

	static void m1() // static method
	{
		System.out.println("This is static method m1");
	}

	void m2() // non-static method
	{
		System.out.println("This is non-stastic method m2");
	}

	void m3() // non-static method accessing both static and non-static methods and variable directly
	{
		m1();
		m2();
		System.out.println(a);
		System.out.println(b);

	}

}

package day20_ThisAndStatic;

public class StsticDemo2Main {

	public static void main(String[] args) {
		// To access static variable and methods in another class use classname of static variable
		
		System.out.println(StaticDemo2.a);	//classname of static variable declared then method or variable
		StaticDemo2.m1();
		
		//
		StaticDemo2 sd2 = new StaticDemo2();
		System.out.println(sd2.b);
		sd2.m2();
		
		sd2.m3();
	}	

}

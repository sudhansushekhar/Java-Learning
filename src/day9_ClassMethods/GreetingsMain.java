package day9_ClassMethods;

public class GreetingsMain {

	public static void main(String[] args) {
		// object of class Greetings to call methods in it
		
		Greetings gr = new Greetings();
		
		//call the methods
		gr.m1();
		
		String returnedValue = gr.m2();
		System.out.println(returnedValue);
		
		gr.m3(5);
		
		System.out.println(gr.m4(9));
	}

}

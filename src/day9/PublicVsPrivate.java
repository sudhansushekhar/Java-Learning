package day9;

public class PublicVsPrivate {

	// Public - methods and variables can use anywhere in the application
	// Private - methods and variables can be used only in the same class
	// Default OR no modifier declared - methods and variables can be used within the same package e.g. day9 package only
	
	String schoolName = "J.H.P.S"; //this one has default modifier as its not mentioned
	public String cityName = "Gaya"; //this one has public modifier can be used anywhere in the application by creating of this class
	void printMessage(String name) {
		System.out.println("Welcome :"+name);
	}
	
	

}

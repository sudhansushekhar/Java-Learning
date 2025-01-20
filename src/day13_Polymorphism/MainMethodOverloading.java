package day13_Polymorphism;

public class MainMethodOverloading {
	//Main method overloading
	void main(int x) {	// method 1
		System.out.println("first method :"+x);
	}
	
	void main(double x) { // method 3
		System.out.println("second method :"+x);
	}
	
	void main(int x, int y) { // method 3
		System.out.println("third method x :"+x);
		System.out.println("third method y :"+y);
	}
	

	public static void main(String[] args) {
		// main method at entry point of Application will execute first 
		
		MainMethodOverloading mainMethodOverloading = new MainMethodOverloading();
		mainMethodOverloading.main(2.7);	//second method
		mainMethodOverloading.main(5,9);	//third method
		mainMethodOverloading.main(34);		//first method
	}

}

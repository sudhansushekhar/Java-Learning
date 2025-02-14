package day20_ThisAndStatic;

public class ThisKeyWord {
	// class level variable
	int x, y;
	
	// This keyword works same for both constructor and normal methods
	ThisKeyWord(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void setData(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void display() {
		System.out.println("x value is :" + x);
		System.out.println("y value is :" + y);
	}

	public static void main(String[] args) {
		// Object of class
		//ThisKeyWord th = new ThisKeyWord(); // for using normal methods
//		th.x = 30;
//		th.y = 45;
		
		ThisKeyWord th = new ThisKeyWord(24,56); // for using constructor
		th.display();

	}

}

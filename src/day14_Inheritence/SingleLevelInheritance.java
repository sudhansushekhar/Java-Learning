package day14_Inheritence;
//INHERITENCE - it is used for code re-usability. 'Extends' keyword is used in order to apply inheritance

// Java doesn't support multiple and hybrid inheritance. To achieve this we use interface

class parentClassOne { //parent class
	int a;
	void display() {
		System.out.println("This is class one value :" + a);
	}
}

class classTwo extends parentClassOne { //Extends will allow to use parent class methods in child class
	int b;
	void print() {
		System.out.println("This is class two value :" + b);
	}
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		// create object of class to access its methods
		
		parentClassOne pc = new parentClassOne();
		pc.a = 13;
		pc.display();
		
		//child class object
		classTwo ct = new classTwo();
		ct.b = 23; //classTwo variable defined
		ct.print(); //classTwo method called
		ct.a = 17; //parentClassOne variable defined in classTwo
		ct.display(); //parentClassOne method called using classTwo

	}

}

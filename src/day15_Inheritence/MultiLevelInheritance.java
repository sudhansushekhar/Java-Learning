package day15_Inheritence;
//INHERITENCE - it is used for code re-usability. 'Extends' keyword is used in order to apply inheritance

//Java doesn't support multiple and hybrid inheritance. To achieve this we use interface

class parentClassA { //parent class
	int a;
	void display() {
		System.out.println("This is class one value :" + a);
	}
}

class childClassOfParentA extends parentClassA { //Extends will allow to use parent class methods in child class
	int b;
	void print() {
		System.out.println("This is class two value :" + b);
	}
}

class childClassThree extends childClassOfParentA{ //Extends will allow to use parent class classTwo methods in child class
	int c;
	void view() {
		System.out.println("This is class three value :" + c);
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// create object of class to access its methods
		
		parentClassA pc = new parentClassA();
		System.out.println("-----parentClassA------");
		pc.a = 13;
		pc.display();
		
		//child class object
		childClassOfParentA ct = new childClassOfParentA();
		System.out.println("-----childClassOfParentA------");
		ct.b = 23; //childClassOfParentA variable defined
		ct.print(); //childClassOfParentA method called
		ct.a = 17; //parentClassA variable defined in classTwo
		ct.display(); //parentClassA method called using classTwo
		
		//child class object of 
		childClassThree th = new childClassThree();
		System.out.println("-----childClassThree------");
		th.c = 43; //childClassThree variable defined
		th.view(); //childClassThree method called
		th.b = 35; //childClassOfParentA variable defined in childClassThree
		th.print(); //childClassOfParentA method called using childClassThree
		th.a = 80; //parentClassA variable defined in childClassThree
		th.display(); //parentClassA method called using childClassThree
		

	}

}

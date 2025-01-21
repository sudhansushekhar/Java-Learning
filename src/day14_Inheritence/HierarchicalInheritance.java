package day14_Inheritence;
//INHERITENCE - it is used for code re-usability. 'Extends' keyword is used in order to apply inheritance

//Java doesn't support multiple and hybrid inheritance. To achieve this we use interface

class parentClass { //parent class
	int a;
	void display() {
		System.out.println("This is parent class value :" + a);
	}
}

class childClassA  extends parentClass{ //Extends will allow to use parentClass methods in childClassA
	int b;
	void print() {
		System.out.println("This is child class one value :" + b);
	}
}

class childClassB extends parentClass{ //Extends will allow to use parentClass methods in childClassB
	int c;
	void view() {
		System.out.println("This is child class two value :" + c);
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// create object of class to access its methods
		
		parentClass pc = new parentClass();
		System.out.println("-----parentClass------");
		pc.a = 13;
		pc.display();
		
		//childClassA object
		childClassA ct = new childClassA();
		System.out.println("-----childClassA------");
		ct.b = 23; //childClassA variable defined
		ct.print(); //childClassA method called
		
		ct.a = 17; //parentClass variable defined in childClassA
		ct.display(); //parentClass method called using childClassA
		
		//child class object of 
		childClassB th = new childClassB();
		System.out.println("-----childClassB------");
		th.c = 43; //childClassB variable defined
		th.view(); //childClassB method called

		th.a = 80; //parentClass variable defined in childClassB
		th.display(); //parentClass method called using childClassB
		

	}

}

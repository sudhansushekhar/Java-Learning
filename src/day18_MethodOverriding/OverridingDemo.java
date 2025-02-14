package day18_MethodOverriding;

class Bank {
	double roi() 
	{
		return 0;	//value assigned in parent class
	}
}

class Icici extends Bank {
	double roi() 
	{
		return 2.3; //value changed in child class i.e overridden
	}
}

class SBI extends Bank {
	double roi()
	{
		return 5; //value changed in child class i.e overridden
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
		// object of class
		
		Icici ic = new Icici();
		System.out.println(ic.roi());

	}

}

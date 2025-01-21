package day15_MethodOverriding;

//OverLoading - compile time polymorphism, same method with different parameters, different data types
//Overriding - runtime polymorphism, exactly same method in both parent and child with different body
/* RULES
 * 1. same method name as in parent class
 * 2. same method parameters and same data type as in parent class
 * 3. method declared as 'final' cannot be overridden
 * 4. method declared as 'static' cannot be overridden
 * 5. access cannot be more restrictive than the overridden method's access level
 */

class parentBank{
	double getRateOfInterest() {
		return 0.0;
	}
}

//child class 1
class axisBank extends parentBank{
	double getRateOfInterest() { //method overridden : method definition is same as parent class but with different body
		return 4.5;
	}
}
//child class 2
class iciciBank extends parentBank{
	double getRateOfInterest() { //method overridden : method definition is same as parent class but with different body
		return 3.7;
	}
}

//child class 3
class sbiBank extends parentBank{
	double getRateOfInterest() { //method overridden : method definition is same as parent class but with different body
		return 2.3;
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// class object to call method
		parentBank bank = new parentBank();
		axisBank axis = new axisBank();
		iciciBank icici = new iciciBank();
		sbiBank sbi = new sbiBank();
		
		System.out.println("Rate of interest for parent bank :"+bank.getRateOfInterest());
		System.out.println("Rate of interest for axis bank :"+axis.getRateOfInterest());
		System.out.println("Rate of interest for icici bank :"+icici.getRateOfInterest());
		System.out.println("Rate of interest for sbi bank :"+sbi.getRateOfInterest());
	}

}

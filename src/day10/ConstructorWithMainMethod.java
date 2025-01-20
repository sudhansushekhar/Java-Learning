package day10;

public class ConstructorWithMainMethod {

	public static void main(String[] args) {
		// create object of constructor
		ConstructorWithoutMainMethod ct = new ConstructorWithoutMainMethod("Glanza",2022); //this will call constructor same like it call methods
				
				System.out.println("Car is:"+ ct.car + ", and its manufacture year is:"+ct.year);

	}

}

package day11_StaticKeyword;

public class RollCounter {
	//int count = 0; // non-static, memory will be allocated everytime when object of class is created
	static int count =0; // memory will be allocated only once 
	
	RollCounter(){ //non parameterized constructor
		count++; //increment by one each time, retain its value
		System.out.println(count);
	}
	public static void main(String[] args) {
		// create obj of class
		
		RollCounter rc1 = new RollCounter();
		RollCounter rc2 = new RollCounter();
		RollCounter rc3 = new RollCounter();


	}

}

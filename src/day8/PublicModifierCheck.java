package day8;

import day10.ConstructorWithoutMainMethod;
import day9.PublicVsPrivate;

public class PublicModifierCheck {

	public static void main(String[] args) {
		// check for methods
		PublicVsPrivate pubPvt = new PublicVsPrivate(); // class object is created to access the public variable

		System.out.println("City is :"+pubPvt.cityName);

		// check for constructor
		// create object of constructor
		ConstructorWithoutMainMethod ct = new ConstructorWithoutMainMethod("Baleno", 2024); // this will call constructor same like it call methods

		System.out.println("Car is:" + ct.car + ", and its manufacture year is:" + ct.year); // make variable also as public
	}

}

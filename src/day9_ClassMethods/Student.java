package day9_ClassMethods;

public class Student {
//class level variables
	int sid;
	String sName;
	char sGrad;
	
	//method to print data
	void printdata() {
		System.out.println("Student ID :"+sid);
		System.out.println("Student name :"+sName);
		System.out.println("Student grade :"+sGrad);
	}
	
	void setData(int id, String name, char grad) {
		sid=id;
		sName =name;
		sGrad = grad;
	}
	//constructor - method to initialise variables and has same name of class name
	//It never return any value not even 'void'. It can have parameters but not code logic like loops, assertions etc.
	//It is automatically invoked at the time object creation
	//Here is the example
	Student(int id1, String name1, char grad1) {
		sid=id1;
		sName =name1;
		sGrad = grad1;
	}
}

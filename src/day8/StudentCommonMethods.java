package day8;

public class StudentCommonMethods {

	//Instance variables - declare outside main method
	String name;
	int age;
	
	//methods - set of instructions. Created outside main method
	void insertRecord(String stdName, int stdAge) {
		name = stdName;
		age = stdAge;
	}
	
	//method to display information
	void displatInfo() {
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
	}
	
}

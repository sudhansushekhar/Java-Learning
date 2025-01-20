package day8_ClassAndObjects_OOP;

public class OOPS_part2 {

	//Instance variables - declare outside main method
	String name;
	int age;
	
	//methods - set of instructions. Created outside main method
	void insertRecord(String stdName, int stdAge) {
		name = stdName;
		age = stdAge;
	}
	
	//method to display infor
	void displatInfo() {
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
	}
	//method to insert record
	
	
	public static void main(String[] args) {
		// create object of the class using new keyword, so that variables can be passed or assigned
		// class name, refrence variable, new keyword and class name
		OOPS_part2 std1 = new OOPS_part2();
				
		//with the help of class refrence variable we can now store data to objects within the method as method is parameterised.
		std1.insertRecord("Sudhanshu", 30);
		
		//after assigning data to refrence variable we can display the information using the methods created outside main method to perform action
		std1.displatInfo(); //data will be assigned to the method that is called and will execute the code inside the method called
	}

}

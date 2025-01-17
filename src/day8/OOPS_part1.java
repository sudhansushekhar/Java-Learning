package day8;

public class OOPS_part1 {

	//Instance variables - declare outside main method
	String name;
	int age;
	
	//methods - set of instructions. Created outside main method
	void displatInfo() {
		System.out.println("Name :" + name);
		System.out.println("Age :" + age);
	}
	//above method is not returning anything so the return tuype is void. If it returns string or integer then return type should have been string or int
	
	public static void main(String[] args) {
		// create object of the class using new keyword, so that variables can be passed or assigned
		// class name, refrence variable, new keyword and class name
		OOPS_part1 std1 = new OOPS_part1();
		
		
		//with the help of class refrence variable we can now store data to objects.
		std1.name = "Sudhanshu";
		std1.age = 30;
		
		//after assigning data to refrence variable we can display the information using the methods created outside main method to perform action
		std1.displatInfo(); //data will be assigned to the method that is called and will execute the code inside the method called
	}

}

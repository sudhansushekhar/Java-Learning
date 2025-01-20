package day4_Loops;

public class doWhileLoop {

	public static void main(String[] args) {
		//Do will execute atleast once everytime even if condition is FALSE
		 int a = 0;
		 //print value from 0-10
		 do {
			 System.out.println("Starting of while loop with value of 'a' :"+a);
			 a++;
		 }
		 while(a<=10);
		 System.out.println("Now the value of 'a' is " + a + " which is more than expected so loop breaks.");
	}

}

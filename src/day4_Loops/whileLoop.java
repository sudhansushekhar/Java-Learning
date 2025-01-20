package day4_Loops;

public class whileLoop {

	public static void main(String[] args) {
		//While will only run if condition is TRUE
		 int a = 0;
		 //print value from 0-10
		 while(a<=10) {
			 System.out.println("value of 'a' :" + a);
			 a++;
		 }
		 System.out.println("Now the value of 'a' is " + a + " which is more than expected so loop breaks.");
	}

}

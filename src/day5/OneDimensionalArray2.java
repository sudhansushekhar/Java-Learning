package day5;

public class OneDimensionalArray2 {

	public static void main(String[] args) {
		// ARRAYS- Is an object used to store multiple values in a single variable with
		// sama data types

		// Declare and instantiate
		int[] age = {20,31,23,25,34}; // here array length is 5 and can be added more in this 
		

		// print size of an array
		System.out.println("Number of elements in array is:" + age.length);

		// print any item of an array
		System.out.println("Elements in array at number 3 is:" + age[2]);
		
		//print all values of an array 
				System.out.println("All elements in array are:" );
				for(int i=0;i<age.length;i++) {
					System.out.println(age[i]);
				}
				
				System.out.println("----FOR EACH loop-----");
				//we can also use for-each loop
				for(int i:age) {
					System.out.println(i);
				}
	}

}

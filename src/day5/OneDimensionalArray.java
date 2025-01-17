package day5;

public class OneDimensionalArray {

	public static void main(String[] args) {
		// ARRAYS- Is an object used to store multiple values in a single variable with
		// sama data types

		// Declare and instantiate
		int[] age = new int[5]; // here array length is 5 already defined
		//adding values in the array
		age[0] = 20;
		age[1] = 31;
		age[2] = 23;
		age[3] = 25;
		age[4] = 34;

		// print size of an array
		System.out.println("Number of elements in array is:" + age.length);

		// print any item of an array
		System.out.println("Elements in array at number 3 is:" + age[2]);
		
		//print all values of an array 
				System.out.println("All elements in array are:" );
				for(int i=0;i<age.length;i++) {
					System.out.println(age[i]);
				}
	}

}

package day6;

public class TwoDimensionalArray2 {

	public static void main(String[] args) {
		// 2D array can also be used like this
		
		int age[][] = {{23,32},{13,46},{36,57}};//curley braces denotes rows
		
		
		System.out.println("Number of rows :" + age.length);

		System.out.println("Number of columns :" + age[0].length); //any row length gives column length
		
		//print value of a specific column
		System.out.println(age[2][0]);
		
		System.out.println("----Print all values using for loop----");
		//print all values of each row and column
		for(int i=0;i<age.length;i++) {
			for(int j=0;j<age[0].length;j++) {
				System.out.println(age[i][j]);
			}
		}
		//Update value in any column
		age[1][0] = 27; //replace 13 with 27 at second row first column
		System.out.println("Printing after updating value :" + age[1][0]);
		
		
	//---------------------------------------------------------------------------//	
		
		//second for-each loop
		int age2[][] = {{23,32},{13,46},{36,57}};
		System.out.println("----Print all values using for-each loop----");
		
		for(int[] row:age2) {
			for(int col:row) {
				System.out.println(col);
			}
		}
	}

}

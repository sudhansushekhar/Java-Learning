package day6;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// Two DImensional array are in rows and column form
		int[][] age = new int[3][2]; // 3 rows and two column

		age[0][0] = 23; // row 0, col 0
		age[0][1] = 32; // row 0, col 1

		age[1][0] = 13; // row 1, col 0
		age[1][1] = 46; // row 1, col 1

		age[2][0] = 36; // row 2, col 0
		age[2][1] = 57; // row 2, col 1

		System.out.println("Number of rows :" + age.length);

		System.out.println("Number of columns :" + age[0].length); //any row length gives column length
		
		//print value of a specific column
		System.out.println(age[1][0]);
	}

}

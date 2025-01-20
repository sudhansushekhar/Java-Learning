package day4_Loops;

public class breakContinueInForLoop {

	public static void main(String[] args) {
		// BREAK is used to terminate the loop if condition is met in for loop
		for (int i = 0; i <= 10; i++) {
			if(i==5) {
				System.out.println("Breaking the loop when condition met i.e. 'i' is equal to "+i);
				break;
			}
			System.out.println("value of 'i' is :" + i);
		}
		
		System.out.println("--------CONTINUE code2 starts from here---------");
		// CONTINUE is used to continue the loop if condition is met in for loop & continue skips the code within the continue block
				for (int i = 11; i <= 25; i++) {					
					if(i==23) 					
						continue;
					System.out.println("value of 'i' is :" + i); //23 will not be printed as i=23
					
					
				}
				System.out.println("-------CONTINUE code2 starts from here---------");
				for (int i = 11; i <= 25; i++) {					
					if(i>=23) 					
						continue;
					System.out.println("value of 'i' is :" + i); //23,24,25 will not be printed because 23,24,25 > i
					
					
				}
	}

}

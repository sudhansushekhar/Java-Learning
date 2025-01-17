package day3;

public class ladderIfElse {

	public static void main(String[] args) {
		int day = 9;
		
		if (day==1) {
			System.out.println("Day number represents Monday");
		}else if (day==2) {
			System.out.println("Day number represents Tuesday");
		}else if (day==3) {
			System.out.println("Day number represents Wednesday");
		}else if (day==4) {
			System.out.println("Day number represents Thursday");
		}else if (day==5) {
			System.out.println("Day number represents Friday");
		}else if (day==6) {
			System.out.println("Day number represents Saturday");
		}else if (day==7) {
			System.out.println("Day number represents Sunday");
		}else
			System.out.println("Day number is out of week days count");
	}
}

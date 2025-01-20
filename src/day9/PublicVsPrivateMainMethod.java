package day9;

public class PublicVsPrivateMainMethod {

	public static void main(String[] args) {
		//create object of PublicVsPrivate class to acces methods of it because PublicVsPrivate class doesn't have main method
		PublicVsPrivate pubPvt = new PublicVsPrivate();
		
		pubPvt.printMessage("Sudhanshu");
		System.out.println(pubPvt.schoolName);
		System.out.println(pubPvt.cityName);
	}
}

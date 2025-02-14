package day14_Encapsulation;

public class AccountMain {

	public static void main(String[] args) {
		// object of account class
		
		Account ac = new Account();
		
		 /* This is not valid as error is 'Variable' is not visible because the variable is 'Private'
		ac.accNo = 457654565;
		ac.name = "Sudhanshu";
		ac.amount = 34460;
		*/
		
		//After setting values in set we can get it here through object of class
		ac.setAccNo(765677665);
		ac.setName("Sudhanshu");
		ac.setAmount(56435);

		System.out.println("Account No set is :"+ac.getAccNo());	
		System.out.println("Account holder name set is :"+ac.getName());
		System.out.println("Amount in Account No set is :"+ac.getAmount());
	}

}

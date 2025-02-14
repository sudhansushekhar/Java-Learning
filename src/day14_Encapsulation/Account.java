package day14_Encapsulation;
	/* ENCAPSULATION - Wrapping of data/variables and methods into single class
	 * We cannot directly access the variables through object in another class
	 * Variables should always have access modifier as 'Private'
	 * For every private variable there there should be two methods (set - assign the data to variable & get - reads/fetch the data from variable)
	 * We should access these private variables only through getter/setter methods in other class 
	 */
public class Account {
	//Variables
	private int accNo;
	private String name;
	private double amount;
	
	//set and get methods of the private variables
	// Since local variable name in method is same as class variable name, we use 'this' keyword to differentiate
	public int getAccNo() 
	{
		return accNo;	
	}
	
	public void setAccNo(int accNo)
	{
		this.accNo = accNo; //'this' keyword says that variable associated with this keyword is a class variable
	}
	
	//set and get methods of the private variables
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	//set and get methods of the private variables
	public double getAmount()
	{
		return amount;
	}
	
	public void setAmount(double amount) 
	{
		this.amount = amount;
	}
	
	
	
}

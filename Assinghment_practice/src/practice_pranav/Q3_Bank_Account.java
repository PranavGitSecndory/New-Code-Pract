//Q3: Create a BankAccount class with private balance. Provide deposit(), withdraw(), and getBalance() methods
//Encapsulation


package practice_pranav;
class Bank_blance{
	private double Balance;	
	
	public Bank_blance(double blance)
	{
		Balance=blance;
	}
	
	public void Deposite(double Amount)
	{
		if(Amount>0 )
		{
			Balance+=Amount;
			System.out.println("Deposite : "+Amount);
		}
		else
		{
			System.out.println("Enter valid ammount");
		}	
	}
	public void Withdrawal(double Amount)
	{
		if(Amount<=Balance && Amount >0)
		{
			Balance-=Amount;
			System.out.println("withdraol ammount :"+Amount);
		}
		else
		{
			System.out.println("insufficiant balance");
		}
	}

	public double getBalance() {
		return Balance;
	}


	
		
	
}
public class Q3_Bank_Account {
public static void main(String[] args)
{
	Bank_blance Balance =new Bank_blance(10000);
	System.out.println("total blance is : "+Balance.getBalance());
	Balance.Deposite(5000.40);
	System.out.println("total blance is : "+Balance.getBalance());
	Balance.Withdrawal(15000);
	System.out.println("total blance is : "+Balance.getBalance());
}
}

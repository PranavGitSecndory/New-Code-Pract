//Demonstrate the usage of synchronized keyword with a
//simple bank withdrawal scenario.
package Test_15;

import java.util.Scanner;

public class Q7  extends Thread {
	int balance;
	int withAmount;
	public Q7(int balance, int withAmount)
	{
	this.balance=balance;
	this.withAmount= withAmount;
	}
		public synchronized void bank()
		{
			if(balance>=withAmount)
			{
				balance-=withAmount;
				System.out.println("amount withdall succesful");
				System.out.println("Remain balance is = "+balance);
			}
			else
			{
				System.out.println("invalid amount plzz check balance");
			}
		}
	
	public void run()
	{
		bank();
	}
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("enter bank amoount");
	int balance=sc.nextInt();
	System.out.println("enter witdowl ammount");
	int withAmount =sc.nextInt();
	
	Q7 ob=new Q7(balance,withAmount);
	ob.start();
}
}

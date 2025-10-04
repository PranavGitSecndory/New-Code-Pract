//7. Implement a banking system where deposit and
//withdrawal operations are synchronized 
//using a synchronized block. 
package syncronization;
import java.util.Scanner;
class Banking 
{
	int balance ;
	int deposit ;
	int withdrawal;
	
	Scanner sc = new Scanner(System.in);
	
	public void diposit_w() 
	{
		
		
		System.out.println("Enter the amount balance");
		this.balance = sc.nextInt();
		
		System.out.println("Enter 1 for deposit and 2 for withdrawal");
		int num = sc.nextInt();
		
		if (num == 1)
		{
			deposit();
		}
		else if (num == 2)
		{
			withdrawal();
		}
		else
		{
			System.out.println("Invalid number...");
		}
	}
	
	public void deposit()
	{
		synchronized (this) {
			
			System.out.println("Enter the amount of deposit");
			this.deposit = sc.nextInt();
			
			if (this.deposit > 0)
			{
				System.out.println("Succesfully amount deposit..");
				int depositbalance = this.deposit+this.balance;
				System.out.println("Amount is now :"+depositbalance);
			}
			else
			{
				System.out.println("deposit min amount");
			}
		}
	}
	
	public void withdrawal()
	{
		synchronized (this) {
			
			System.out.println("Enter the amount of withdrawal");
			this.withdrawal = sc.nextInt();
			
			if (balance >= this.withdrawal)
			{
				System.out.println("Succesfully amount withdrawal ");
				int withdrawalbal = balance - withdrawal;
				System.out.println("Amount is now :"+withdrawalbal);
			}
			else
			{
				System.out.println("Enter the amount valid and less than your balance");
			}
			
		}
	}
}

public class Blog_Q7 extends Thread {
	Banking ob=new Banking();
	public void run()
	{
		ob.diposit_w();
	}
	
	public static void main(String[] args) {
		Blog_Q7 obj = new Blog_Q7();
		obj.start();
	}


	
}

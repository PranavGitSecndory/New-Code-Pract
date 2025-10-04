//2. Write a program where a ZeroBalanceException is 
//thrown when the account balance is zero.  
package Custom_Exeption;

import java.util.Scanner;

class ZeroBlance extends Exception
{
	ZeroBlance(String s)
	{
		super(s);
	}
}
public class Q2 {
	static void balance(int a) throws ZeroBlance
	{
		if(a<=0)
		{
			throw new ZeroBlance("Account balance is zero");
		}
		else
		{
			System.out.println("balance is not zero");
		}
	}
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			int a=sc.nextInt();
			balance(a);
		} catch (Exception e) {
		System.out.println(e);
		e.printStackTrace();
		}
	}
}


package Poly_overridingpractice;
	class bankaccount
	{
		void deposite()
		{
			System.out.println("money deposite");
		}
		void withdraw()
		{
			System.out.println("mony withdrawa");
		}
	}
	class savingaccont extends bankaccount
	{
		void withdraw()
		{
			System.out.println("mony withdrawa from saving account");
		}
	}
	class chackingaccount extends bankaccount
	{
		void withdraw()
		{
			System.out.println("mony withdrawa from checking account");
		}
	}
public class Bank_account {
		public static void main(String args [])
		{
			bankaccount ob;
			ob=new bankaccount();
			ob.withdraw();
			ob=new savingaccont();
			ob.withdraw();
			ob=new chackingaccount();
			ob.withdraw();
			
		}
}

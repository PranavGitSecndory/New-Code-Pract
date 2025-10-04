package noreturn.noarg.pkg;
import java.util.Scanner;
public class Noriturntypewithargs 
{
	 public void addition(int a,int b)
	 {
		 System.out.println("addition method");
		 System.out.println("addition="+(a+b));
	 }
	 public void printing(String s)
	 {
		 System.out.println(s);
	
	 }
	 
	 public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 Noriturntypewithargs ob=new Noriturntypewithargs();
		 
		 System.out.println("enter the values");
		 int a=sc.nextInt();
		 int b=sc.nextInt();
		ob.addition(a,b);
		ob.printing("nick");
	 }
	 
}

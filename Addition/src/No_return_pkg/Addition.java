package No_return_pkg;
import java.util.Scanner;
public class Addition {
	public void add(int d,int c)//void is no return type with argument
	{
		
		System.out.println(d+c);
	}
	public void sub(int a,int b)
	{
		
		System.out.println(a-b);
	}
	public void mult(int a,int b)//create the method no return type eith argumrnt
	{
		
		System.out.println(a*b);
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in); //put value by usser 
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		
		Addition ob=new Addition();//create objject
		ob.add(a,b);	//call the object with metthod
		ob.sub(a,b);
		ob.mult(a,b);
				
	}

}

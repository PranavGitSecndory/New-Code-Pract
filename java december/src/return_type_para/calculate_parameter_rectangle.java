package return_type_para;
import java.util.Scanner;
public class calculate_parameter_rectangle {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		calculate_parameter_rectangle ob=new calculate_parameter_rectangle();
		
		System.out.println("enter the length");
		int  l=sc.nextInt();
		System.out.println("enter the breadth");
		int m=sc.nextInt();
		
		int k=ob.calculate(l,m);
		System.out.println("parameter of rectangle is = "+k);
	}
	int calculate(int l, int m)
	{
		return 2*(l+m);
	}
	
}

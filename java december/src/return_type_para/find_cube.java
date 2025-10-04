package return_type_para;
import java.util.Scanner;
public class find_cube {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		find_cube ob=new find_cube();
		
		System.out.println("enter the number");
		int n=sc.nextInt();
		int k=ob.find(n);
		System.out.println("cube of this numbe is = "+k);
	}
	int find(int a)
	{
		a=a*a*a;
		return a;
	}
}

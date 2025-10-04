package return_type_para;
import java.util.Scanner;
public class calculare_cucumferance {
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		calculare_cucumferance ob=new calculare_cucumferance();
		
		System.out.println("enter radius");
		int n=sc.nextInt();
		double k=ob.check(n);
		System.out.println(k);
	}
	double check(int a)
	{
		return 2 * 3.14 * a;
	}
}

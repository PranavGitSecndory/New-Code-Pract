package return_type_para;

public class print_reverse {
	public static void main(String arg[])
	{
		print_reverse ob=new print_reverse();
		int d =ob.reverse(1234);
		System.out.println(d);
	}
	int reverse(int a)
	{
	int temp=0;
		for(int i=a; i!=0; i=i/10)
		{
			int rev=i%10;
			temp=temp*10+rev;
		}
		return temp;
	}

}

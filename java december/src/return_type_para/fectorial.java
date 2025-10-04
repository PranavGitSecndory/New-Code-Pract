package return_type_para;

public class fectorial {
	public static void main(String arg[])
	{
		fectorial ob=new fectorial();
		int k=ob.fact(5);
		System.out.println(k);
	}
	int fact(int a)
	{
		int fact=1;
		for(int i=2; i<=a; i++)
		{
			
			fact=fact*i;
		}
		return fact;
	}
}

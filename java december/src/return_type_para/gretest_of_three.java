package return_type_para;

public class gretest_of_three {
	public static void main(String arg[])
	{
		gretest_of_three ob=new gretest_of_three();
		int k=ob.gretter(20,10,40);
		System.out.println("gretest number is = "+k);
	}
	int gretter(int a,int b, int c)
	{
		if(a>b && a>c)
		{
			return a;
		}
		else if(b>a && b>c)
		{
			return b;
		}
		else
		{
			return c;
		}
	
	}
}

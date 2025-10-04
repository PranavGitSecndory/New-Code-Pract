package return_type_para;

public class checknumber {
	public static void main(String arg[])
	{
		checknumber ob=new checknumber();
		String k=ob.check(-1);
		System.out.println(k);
	}
	String check(int a)
	{
		if(a>0)
		{
			return "number is positive";
		}
		else if(a<0)
		{
			return "thr number is negative";
		}
		else
		{
			return "the number is zero";
		}
	}
}

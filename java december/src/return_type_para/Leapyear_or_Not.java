package return_type_para;

public class Leapyear_or_Not {
	public static void main(String arg[])
	{
		Leapyear_or_Not ob=new Leapyear_or_Not();
		String k=ob.Leapyear_or_Not(2025);
		System.out.println(k);
	}
	String Leapyear_or_Not(int a)
	{
		if(a%4==0)
		{
			return "leap year";
		}
		else
		{
			return "not leap year";
		}
	}

}

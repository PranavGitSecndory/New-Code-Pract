package returnt.nopara.pkg;

public class greter_now {
	public static void main(String args[])
	{
		greter_now ob=new greter_now();
		String l=ob.greter();
		System.out.println(l);
		
	}
	public String greter()
	{
		String s1,s2;
		s1="a is a greter";
		s2="b is a greter";
		int a=10; int b=20;
		if(a>b)
			return s1;
		else 
			return s2;
	}
	
}

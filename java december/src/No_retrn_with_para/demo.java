package No_retrn_with_para;

public class demo {
	public static void main(String[]arg)
	{
		demo ob=new demo();
		ob.add(100,200);
		ob.print(1000,"sagar",'N',123.345);
	}
	
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("addition is"+ c);
	}

	
	void print(int a,String s, char ch, double d)
	{
		System.out.println("a ="+a);
		System.out.println("String ="+s);
		System.out.println("char ="+ch);
		System.out.println("double ="+d);
	}
}

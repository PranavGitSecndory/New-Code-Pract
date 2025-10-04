package return_type_para;

public class return_type_demo {
	
	int add()
	{
		int a=10;int b=200;
		int c=a+b;
		return c;
	}
	public static void main(String[]arg)
	{
		return_type_demo ob=new return_type_demo();
		int k=ob.add();
		System.out.println(k);
	}
}

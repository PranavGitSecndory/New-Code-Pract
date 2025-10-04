package Practice;

public class polynaturalnum {
	void natural(int a,int b)
	{
		System.out.println("print natural number");
		for(int i=a; i<=b; i++)
		{
			System.out.println(i+"");
		}
	}
	void natural(float f,float f1)
	{
		System.out.println("print Float number");
		for(float i=f; i<=f1; i++)
		{
			System.out.println(i+"");
		}
	}
	void natural(char a)
	{
		System.out.println("print  char a to z");
		for(char i='A'; i<='Z'; i++)
		{
			System.out.print(i+"");
		}
	}
		public static void main(String args[])
		{
			polynaturalnum ob=new polynaturalnum();
			ob.natural(10,20);
			ob.natural(10.0f,20.0f);
			ob.natural('a');
		
	}
}

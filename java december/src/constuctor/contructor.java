package constuctor;

public class contructor {
	public static void main(String arg[])
	{
		contructor ob=new contructor();
		contructor ob1=new contructor("nick");
		contructor ob2=new contructor(200,123242424,'A' );	
	}
	
	public contructor()
	{
		System.out.println("non para con");
	}
	public contructor(String s)
	{
		System.out.println("string para con");
	}
	public contructor(int a, long l, char c)
	{
		System.out.println("int para con");
	}
}






/*  
 {
		contructor ob =new contructor(200, "nick");
	}
	public contructor(int a,String s)
	{
		System.out.println("call constroctor values is "+a+" " +s) ;
	}
 */
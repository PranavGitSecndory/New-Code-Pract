package keywords;

public class Keyword_this//invoke current constructor
{
	Keyword_this()//constructor calling by another constructor
	{
		this(10);
		System.out.println("non para const");
	}
	Keyword_this(int a)
	{
		this("nick");
		System.out.println("int para const");
	}
	Keyword_this(String s)
	{
		
		System.out.println("String para const");
	}
	
	public static void main(String arg[])
	{
		Keyword_this ob=new Keyword_this();//call constructor in useing this key words
		System.out.println("dj Nick");
	}
	
}


/*
 void m1()//class method instance veriable
	//using this keyword to call another method in that method
	{
		m2();//auto call this keywords
		System.out.println("this is Nick 1");
	}
	void m2()//in that we call the m3 method using this key word
	{
		this.m3();
		System.out.println("this is nick 2");
	}
	void m3()
	{
		System.out.println("this is Nick 3");
	}
	public static void main(String arg[])
	{
		Keyword_this ob=new Keyword_this();
		ob.m1();	//call the one method and all method call in that use this keyword
		System.out.println("Dj nick ('_')");
	}
 */


/*
 
 int a; ///current class instance method
	void inti()
	{
		int a=100;
		this.a=a;//intitlize value to using this to instance variable
	}
	void print()
	{
		System.out.println(a);
	}
	public static void main(String arg[])
	{
		Keyword_this ob=new Keyword_this();
		ob.inti();
		ob.print();
	}
 
 */
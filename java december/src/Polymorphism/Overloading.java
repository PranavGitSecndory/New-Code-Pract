package Polymorphism;

public class Overloading { //in the same class
	void print ()		//in that same method should be same  
	{
		System.out.println("non para method");
	}
	void print (int a)	//parameter should be differant
	{
		System.out.println("int para method");
	}
	void print(String s)  //parameter number diff
	{
		System.out.println("String para method");
	}
	float print(int a,String s)	//sequance also diff
	{
		System.out.println("int and string para method");
	return 1;
	}
	void print(String s ,int a)
	{
		System.out.println("Strind and int para method");
	}
	public static void main(String arg[])
	{
		Overloading ob=new Overloading();//class call for all method
		ob.print();
		ob.print(10);//method call iin same class
		ob.print("nick");
		float k=ob.print(10,"nick");
		System.out.println(k);
		ob.print("nick",10);
	}
}

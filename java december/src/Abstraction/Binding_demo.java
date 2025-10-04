package Abstraction;
//class p1
//{
//	void print() //late binding not use static in abstraction
//	{
//		System.out.println("parent call");
//	}
//}
//class p2 extends p1
//{
//	void print()
//	{
//		System.out.println("child call");
//	}
//}
class p1
{
	static void print() //early  binding use static in abstraction
	{
		System.out.println("parent call");
	}
}
class p2 extends p1
{
	static void print()
	{
		System.out.println("child call");
	}
}
public class Binding_demo {
public static void main(String[] args) {
	p1 ob=new p2();//up casting
	ob.print();
}
}

/*8. Create a base class Employee with a constructor initializing name
   and salary. Create a subclass Manager that calls the parent
    class constructor using super and adds an additional bonus 
    attribute.  
*/
package keywords;
class employ
{
	String s;int a;
	public employ(String s,int a)
	{
		this.s=s;
		this.a=a;
	}
	void dis()
	{
		System.out.println("name = "+s);
		System.out.println("salary = "+a);
	}
}
class Manger extends employ
{
	int b;
	Manger(String s,int a,int b)
	{
		super(s,a);
		this.b=b;
	}
	void dis()
	{
		super.dis();
		System.out.println("bonus = "+b);
	}
	
}
public class Super_with_constructor 
{
	public static void main(String[] args)
{
	Manger ob=new Manger("Nick",10000,5000);
	ob.dis();
}
}


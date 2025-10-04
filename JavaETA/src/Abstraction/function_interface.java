package Abstraction;
@FunctionalInterface
interface custominterface
{
	abstract void display();
	default void disp1()
	{
		System.out.println("this default method");
	}
	default void disp2()
	{
		System.out.println("this default method");
	}
	static void disp3()
	{
		System.out.println("this default method");
	}
	
}
public class function_interface implements custominterface
{
	@Override
	public void display()
	{
		System.out.println("this abstract method");
	}
	public static void main(String[] args) {
		function_interface ob =new function_interface();
		ob.display();
		
		custominterface.disp3();
	}
}

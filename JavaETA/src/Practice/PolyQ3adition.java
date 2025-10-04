package Practice;

public class PolyQ3adition {
	void addition(String name)
	{
		
	
		System.out.println("first name="+name);
	}
	void addition(String lname, String name, int a)
	{
		
		System.out.println("\nlast name="+lname+"\nage is="+a+"\nfist name ="+name);
	}
	public static void main(String args[])
	{
		PolyQ3adition ob=new PolyQ3adition();
		ob.addition("abc");
		ob.addition("xyz","abc",100);
	}	
}

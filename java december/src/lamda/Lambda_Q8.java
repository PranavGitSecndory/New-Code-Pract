//8. Calculate Factorial: Write a lambda expression
//that takes an integer and returns its factorial.
package lamda;
interface facto
{
	public int fac(int a);
}

public class Lambda_Q8 {
public static void main(String[] args) {
	facto ob=(a)->
	{
		int f=1;
		for(int i=a; i>0; i--)
		{
			f*=i;
		}
		return f;
	};
	
	int a=5;
	int result =ob.fac(a);
	System.out.println("factoril is : "+result);
}
}

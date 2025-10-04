//6. Find Maximum of Two Numbers: Create a lambda 
//expression that takes two integers and returns the maximum of the two.
package lamda;
interface Number 
{
	public int fmax(int a, int b);
}
public class lamda_Q6 {
public static void main(String[] args) {
	Number ob =(a,b)->
	{
		if(a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	};
	int max=ob.fmax(20, 40);
	System.out.println("maximum of two is : "+max);
}
}

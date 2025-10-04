//6. Throw IllegalStateException if withdrawal amount exceeds balance.  
package Exception;

public class Throw_Q6 {
	static void Question6()
	{
		double b =4000.0;
		double a=5000.0;
		if(a>b)
		{
			throw new IllegalStateException("fund not avaliable");
		}
		System.out.println("balance is = "+ (b-a));
	}
public static void main(String[] args) {
	Question6();
}
}

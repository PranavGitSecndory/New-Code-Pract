//3. Throw IllegalArgumentException if age is negative.  
package Exception;

public class throw_Q3 {
	static void Question3()
	{
		int age=0;
		if(age<=0)
		{
			throw new IllegalArgumentException("age is not legal");
		}
		System.out.println(age);
	}
public static void main(String[] args) {
	Question3();
}
}

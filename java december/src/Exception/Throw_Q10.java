//10. Throw SecurityException for unauthorized access.
package Exception;

public class Throw_Q10 {
	public static void main(String[] args)
	{
		 String a ="nick";

			      if (a.equals(a))
			      {
			          throw new SecurityException("Admin privileges required");
			      }
			      System.out.println("Access granted");
	}
}

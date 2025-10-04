//9. Check if Palindrome: Create a lambda expression 
//that takes a string and returns true if it is a palindrome,
//otherwise false.
package lamda;
interface pallendrome
{
	public boolean
	
	
	pallen(String s);
}
public class Lambda_Q9 {
public static void main(String[] args) {
	pallendrome ob=(s)->
	{
		 String k="";
		 for(int i=s.length()-1; i>=0; i--)
		 {
			 k+=s.charAt(i);
		 }
		 if(s.equals(k))
		 {
			return true;
		 }
		 else
		 {
			return false;
		 }
		 
		 
	};
	String s="madam";
	boolean result =ob.pallen(s);
	System.out.println("pallendrome is : "+result);
	
	
	
}
}

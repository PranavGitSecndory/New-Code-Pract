//Check if Two Strings are Isomorphic
//   Problem Description:  
//   Write a Java program to check if two strings are isomorphic 
//	 using a HashMap. Two strings are isomorphic if the 
//	 characters in one string can be replaced to get the other string.
//
//   Input: Two strings.  
//   Output: true or false.
//
//   Example:
//   - Input: "foo", "bar"
//   - Output: false
//
//   - Input: "egg", "add"
//   - Output: true


package Thread_with_Exeption;
import java.util.HashMap;
class Isomorphic implements Runnable
{
	public void print()
	{
		String s1= "foo";
		String s2="bar";
		boolean isIsomorphic = true;

	        if (s1.length() != s2.length()) 
	        {
	            isIsomorphic = false;
	        } else
	        {
	            HashMap<Character, Character> map = new HashMap<>();

	            for (int i = 0; i < s1.length(); i++)
	            {
	                char c1 = s1.charAt(i);
	                char c2 = s2.charAt(i);

	                if (map.containsKey(c1)) 
	                {
	                    if (map.get(c1) != c2) 
	                    {
	                        isIsomorphic = false;
	                        break;
	                    }
	                } 
	                else 
	                {
	                    if (map.containsValue(c2))
	                    {
	                        isIsomorphic = false;
	                        break;
	                    }
	                    map.put(c1, c2);
	                }
	            }
	        }
	        System.out.println("the two String is isomorphic? = " + isIsomorphic);
	    }
		public void run()
		{
			print();
		}
}
public class Thread_interface_Q1 {
	public static void main(String[] args) {
		Isomorphic th =new Isomorphic();
		Thread ob=new Thread(th);
		ob.start();
	}
	
	
			
}

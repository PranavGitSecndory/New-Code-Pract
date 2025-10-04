//5.Count how many times each digit appears in a number.
//Input: 122333 → Output: 1:1, 2:2, 3:3
package Test_14;

public class Q5 {
	String input = "1223333";
	public void display()
	{
		for (int i=0;i < input.length();i++)
		{
			 char current = input.charAt(i);
		        int count = 0;

		        
		        boolean alreadyCounted = false;
		        
		        for (int k = 0; k < i; k++) 
		        {
		            if (input.charAt(k) == current) 
		            {
		                alreadyCounted = true;
		                break;
		            }
		        }
		        
		        if (alreadyCounted) continue;

		        for (int j = 0; j < input.length(); j++) 
		        {
		            if (input.charAt(j) == current) 
		            {
		                count++;
		            }
		        }
			System.out.println(input.charAt(i)+":"+count);
		}
	}

public static void main(String[] args) {
	Q5 obj = new Q5();
	obj.display();

}
}

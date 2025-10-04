//
//5. Partition ArrayList  
//   - Question: Partition an ArrayList of 
//integers into even and odd numbers.
//   - Input: [1, 2, 3, 4, 5]
//   - Output: Even: [2, 4], Odd: [1, 3, 5]
package collection_IMP;

import java.util.ArrayList;
import java.util.Arrays;

public class Q5 {
public static void main(String[] args) {
	ArrayList<Integer> li =new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
	
	ArrayList<Integer> even =new ArrayList<Integer>();
	ArrayList<Integer> odd =new ArrayList<Integer>();
	
	for(int n : li )
	{
		if(n%2==0)
		{
			even.add(n);
		}
		else
		{
			odd.add(n);
		}
	}
	
	System.out.println("Even number is : "+even);
	System.out.println("Odd no is : "+odd);
}
}

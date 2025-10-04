// Print All Prime Numbers from an ArrayList
//   - Task: Given an ArrayList<Integer>, write 
//   a program to print all prime numbers.
//   java
//   ArrayList<Integer> list = new ArrayList<>
// (Arrays.asList(10, 11, 12, 13, 14, 15));
 package Array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class Prime_No {
	static void prime(ArrayList<Integer> A)
	{
		for(int i=0; i<A.size(); i++)
		{
			int Num=A.get(i);
			int count=0;
			for(int j=1; j<=Num; j++)
			{
				if(Num% j==0)
				{
				count++;
				}
			}
			if(count ==2)
			{
				System.out.println(Num+" ");
			}
		}
	}
public static void main(String[] args) {
	 ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 11, 12,13,14, 15));
	 prime(list);
}
}

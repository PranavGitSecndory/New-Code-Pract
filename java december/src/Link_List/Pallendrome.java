//1. 
//LinkedList(Arrays.asList(121,111,132,34,54);
//
//Print all the palindrome elements from the linked list
package Link_List;


import java.util.Arrays;
import java.util.LinkedList;

public class Pallendrome {
	static void pallendrome(LinkedList<Integer> A)
	{
		System.out.println("pallandeome no in given array  : ");
		for(int i=0;i<A.size(); i++)
		{
			int num=A.get(i);
			int rev=0;
			for(int j=num; j>0; j=j/10)
			{
				int rem=j%10;
				rev = rev*10+rem;
			}
			if(rev== num)
			{
				System.out.println(rev+" ");
			}
		}
	}
public static void main(String[] args) {
	LinkedList<Integer> ob=new LinkedList<Integer>(Arrays.asList(121,11,30,444,567,609));
	pallendrome(ob);
	
}
}

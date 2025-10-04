//Wap to print all the palindrome elements from the ArrayList
//        ArrayList<Integer> list = new ArrayList(Arrays.asList
//        		(121,11,30,444,567,609));
package Array_list;

import java.util.ArrayList;
import java.util.Arrays;




public class Palllendrone {
	static void pallendrome(ArrayList<Integer> A)
	{
		for(int i=0;i<A.size(); i++)
		{
			int num=A.get(i);
			int rev=0;
			for(int j=num; j>0; j=j/10)
			{
				int D=j%10;
				rev = rev*10+D;
			}
			if(rev== num)
			{
				System.out.println(rev+" ");
			}
		}
	}
public static void main(String[] args) {
	ArrayList<Integer> ob=new ArrayList(Arrays.asList(121,11,30,444,567,609));
	pallendrome(ob);
	
}
}

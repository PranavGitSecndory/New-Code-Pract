package Array_return_method;
import java.util.Random;
import java.util.Arrays;
public class shuffle {
	public static void main(String args[])
	{
		shuffle ob= new shuffle();
		ob.suff();
		
	}
	void suff()
	{
		int a[]= {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(a));
		Random rd=new Random();
		int n=rd.nextInt(a.length);
		
		for(int i=0; i<a.length; i++)
		{
			int temp=a[i];
			a[i]=a[n];
			a[n]=temp;
		}
	
	System.out.println(Arrays.toString(a));
	}
}

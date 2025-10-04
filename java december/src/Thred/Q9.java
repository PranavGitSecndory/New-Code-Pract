package Thred;

import java.util.Arrays;

class Question9 extends Thread
{
	public void run()
	{
		int a[]= {3,1,1};
		int b[]= {6,5,4};
		Arrays.sort(a);
		Arrays.sort(b);
		int sum=0;
		for(int i=0; i<a.length; i++)
		{
			sum+=a[i]*b[b.length-i-1];
		}
		System.out.println("sum is = "+sum);
		
	}
}
public class Q9 {
public static void main(String[] args) {
	Question9 ob=new Question9();
	ob.start();
}
}

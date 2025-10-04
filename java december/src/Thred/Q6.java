//Q1.Given an array of N integers. Find the first 
//element that occurs at least K number of times.
 
//Example 1:
//Input :
//N = 7, K = 2
//A[] = {1, 7, 4, 3, 4, 8, 7}
//Output :
//7

package Thred;
class Question6 extends Thread
{
	public void run()
	{
		int a[]= {1,7,4,3,4,8,7};
		
		for(int i=0; i<a.length; i++)
		{
			int count=0;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]==a[j])
				{
				count++;
				}
			}
			if(count >0)
			{
				System.out.println("Array first elemnt is = "+a[i]);
				break;
			}
		}
	}
}
public class Q6 {
public static void main(String[] args) {
	Question6 ob=new Question6();
	ob.start();
}
}

//Q3.Given an array A of n positive numbers. The task is to
//find the first Equilibrium Point in an array. 
//Equilibrium Point in an array is a position such that the sum
//of elements before it is equal to the sum of elements after it.

//Note: Retun the index of Equilibrium point. (1-based index)

//Example 1:

//Input: 
//n = 5 
//A[] = {1,3,5,2,2} 
//Output: 3 
package Thred;
class Question8 extends Thread
{
	public void run()
	{
		int a[]= {1,3,5,2,2};
		System.out.println("Equilibrium point is = ");
	
		
		for(int i=0; i<a.length; i++)
		{
			int lsum=0;
			int rsum=0;
			for(int j=0; j<=i; j++)
			{
				lsum=lsum+a[j];
			}
			for(int j=i; j<a.length; j++)
			{
				rsum=rsum+a[j];
			}
			if(lsum ==rsum )
			{
				System.out.println((i+1)+" ");
				break;
			
			}
		}
	}
}
public class Q8 {
public static void main(String[] args) {
	Question8 ob=new Question8();
	ob.start();
}
}


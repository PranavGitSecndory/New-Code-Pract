//Q2.Given an array A of positive integers. Your task is to find 
//the leaders in the array. An element of array is leader if it
//is greater than or equal to all the elements to its right side.
//The rightmost element is always a leader. 
//
//Example 1:
//
//Input:
//n = 6
//A[] = {16,17,4,3,5,2}
//Output: 17 5 2
package Thred;
class Question7 extends Thread
{
	public void run()
	{
		int a[]= {16,17,4,3,5,2};
		System.out.println("output is");
		for(int i=0; i<a.length; i++)
		{
			int count=0;
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					count++;
				}
			}
			if(count == 0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}
public class Q7 {
public static void main(String[] args) {
	Question7 ob= new Question7();
	ob.start();
}
}

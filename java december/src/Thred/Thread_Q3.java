//3. Create a thread using the Thread class to rotate a square 
//matrix 90 degrees clockwise 
package Thred;

import java.util.Arrays;

class Clockwise extends Thread
{
	private int a[][];
	public Clockwise(int a[][])
	{
		this.a=a;
	}
	public void roteat()
	{
		int n=a.length;
		int rotet[][]=new int [n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0; j<n;j++)
			{
				rotet[j][n-1-i]=a[i][j];
			}
		}
		System.out.println("after the 90- degree rotet matrix");
		for(int i=0; i<n; i++)
		{
			System.out.println(Arrays.toString(rotet[i]));
		}
	}
	public void run()
	{
		roteat();
	}
}
public class Thread_Q3 {
public static void main(String[] args) {
	int a[][]= {{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	Clockwise ob=new Clockwise(a);
	ob.start();
}
}

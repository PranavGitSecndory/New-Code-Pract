//3.Rotate it 90 Degree and store it in another
//matrix and then print it
package Thred;

import java.util.Scanner;

class Question3 extends Thread
{
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row size of matrix");
		int row =sc.nextInt();
		System.out.println("enter the col size of matrix");
		int col =sc.nextInt();
		System.out.println("Enter the elemnt of matrix");
		int a[][]=new int[row][col];
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("given matrix is");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		int b[][]=new int[row][col];
		for(int i=0; i<row; i++)
		{
			int x=0;
			for(int j=col-1; j>=0; j--)
			{
				b[i][x++]=a[j][i];
			}
			
		}
		
		System.out.println("after rottet the 90 degree matrix");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(b[i][j]+"");
			}
			System.out.println();
		}	
	}
}
public class Q3 {
public static void main(String[] args) {
	Question3 ob=new Question3();
	ob.start();
}
}

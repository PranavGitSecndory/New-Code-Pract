package Thred;

import java.util.Scanner;

class Question5 extends Thread
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
			
			for(int j=col-1; j>=0; j--)
			{
				b[2-i][j]=a[j][i];
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

public class Q5 {
public static void main(String[] args) {
	Question5 ob=new Question5();
	ob.start();
}
}

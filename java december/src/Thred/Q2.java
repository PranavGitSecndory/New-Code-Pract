//Wap to take a matrix from user and then perform following :
//1. Print it by using predefine method
package Thred;

import java.util.Arrays;
import java.util.Scanner;

class Question2 extends Thread
{
	public void run()
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter matrix row");
	int row=sc.nextInt();
	System.out.println("enter matrix coloume");
	int col=sc.nextInt();
	System.out.println("Enter the element in matrix");
	int a[][]=new int[row][col];
	
	
	for(int i=0; i<row; i++)
	{
		for(int j=0; j<col; j++)
		{
		a[i][j]=sc.nextInt();
		}
	}
	
	System.out.println("Array is a = ");
	System.out.println(Arrays.deepToString(a));
	}
}



public class Q2 {
public static void main(String[] args) {
	Question2 ob=new Question2();
	ob.start();
}
}


// wap to take a matrix from user and then perform following :
//2.Print it without using predefine method

package Thred;
import java.util.Scanner;
class Question1 extends Thread
{
	public void run()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter matrix row");
		int row=sc.nextInt();
		System.out.println("enter matrix coloume");
		int col=sc.nextInt();
		System.out.println("Enter the matrix");
		int a[][]=new int[row][col];
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
			a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array is a = ");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(a[i][j]+"");
			}
			System.out.println();
		}
	}
}
public class Q1 {
public static void main(String[] args) {
	Question1 ob=new Question1();
	ob.start();
}
}

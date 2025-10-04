//Write a program to find the second largest number in an array.
package Test_15;

public class Q3 {
	void secondlarge(int a[])
	{
		int max=0;
		int smax=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
			}
			else if (a[i] > smax && a[i] != max) 
			{
                smax = a[i];
			}
		}
		System.out.println("second max number is = "+smax);
	}
public static void main(String[] args) {
	int a[]= {3,5,7,2,8};
	Q3 ob=new Q3();
	ob.secondlarge(a);
	
}
}

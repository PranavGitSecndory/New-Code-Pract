
//Write a Java method that takes two arrays and returns the common elements.
package Test_15;

public class Q4 {
	void common(int a[],int b[])
	{
		System.out.println("Commone element in array are = ");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
					break;
				}
			}
		}
	}
public static void main(String[] args) {
	Q4 ob=new Q4();
	int a[]= {1,2,3,5,7};
	int b[]= {1,2,3,8,9};
	ob.common(a,b);
}
}

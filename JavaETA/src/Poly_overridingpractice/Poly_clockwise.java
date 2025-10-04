package Poly_overridingpractice;
class clockwise
{
	void print()
	{
		System.out.println("array with clock wire after rotation by 3");
		int a[]= {1,2,3,4,5};
		int k=3;
		for(int j=0;j<k;j++)
		{
			int temp=a[a.length-1];
			for(int i=a.length-1;i>0;i--)
			{
				a[i]=a[i-1];
			}
			a[0]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();
		
	}
	}
	

class anticlockwise extends clockwise
{
	void print()
	{
		System.out.println("array with anticlock wise after rotation by 4");
		int a[]= {1,2,3,4,5};
		int k=4;
		
		for(int j=1;j<=k;j++)
		{
			int temp=a[0];
			for(int i=0;i<a.length-1;i++)
			{
				a[i]=a[i+1];
			}
			a[a.length-1]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}
}

public class Poly_clockwise 
{
	public static void main(String[] args) 
	{
		clockwise ob=new clockwise();
		ob.print();
		
		clockwise ob1=new anticlockwise();
		ob1.print();
	}

}



package Poly_overridingpractice;

	class min
	{
		void print()
		{
			int a[]= {2,5,3,7,9,8,7};
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]>a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			for(int i=0;i<a.length;i++)
			{
				if(i==0)
				System.out.print("Min is :"+a[i]);
			}
			System.out.println();
		}
	}

	class secmin
	{
		void print()
		{
			int a[]= {2,5,3,7,9,8,7};
			for(int i=0;i<a.length;i++)
			{
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]>a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			for(int i=0;i<a.length;i++)
			{
				if(i==1)
				System.out.print("Second Min is :"+a[i]);
			}
			System.out.println();
		}
	}
	public class poly_ovreriding_maxsecodmax {

	
		public static void main(String[] args) 
		{
			min ob=new min();
			ob.print();
			
			secmin ob1=new secmin();
			ob1.print();
		}
	}


package interface_pkg;
	interface parent
	{
		void asort();
		void dsort();
	}
	class sort 
	{
		public void asort()
		{
			int a[]= {2,1,4,3,5};
			System.out.println("assinding sort arrayv is");
			for(int i=0; i<a.length;i++)
			{
				for(int j=i+1; j<a.length; j++)
				{
					if(a[i]>a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
				System.out.println(a[i]);
			}
		}
		public void dsort()
			{
				int a[]= {2,1,4,3,5};
				System.out.println("dessinding sort arrayv is");
				for(int i=0; i<a.length;i++)
				{
					for(int j=i+1; j<a.length; j++)
					{
						if(a[i]<a[j])
						{
							int temp=a[i];
							a[i]=a[j];
							a[j]=temp;
						}
					}
					System.out.println(a[i]);
				}
		}
	}
	

public class sorting_interface 
{
	public static void main(String args[])
	{
		sort ob=new sort();
		ob.asort();
		ob.dsort();
		
	}

}

package methods;

public class reverse {
	public static void main(String []args)
	{
		reverse ob=new reverse();
		ob.rev_array();
	}
	void rev_array()
	{
		int a[]= {1,2,3,4,5,6};
		System.out.println("array is reverse");
		
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}

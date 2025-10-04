package No_retrn_with_para;

public class Array_print {
	public static void main(String []args)
	{
		Array_print ob=new Array_print();
		int b[]= {1,2,3,4,5};
		ob.printarray(b);
		
		
	}
	void printarray(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}

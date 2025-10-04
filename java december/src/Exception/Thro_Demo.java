package Exception;

public class Thro_Demo {
public static void main(String[] args){
	int a[]=null;
	if(a==null)
		{
		throw new NullPointerException("it is grester then array length");
		}
	System.out.println(a[10]);
	
	
//	int a[]= {1,2,3};
//	if(a.length<=0)
//	{
//		throw new IndexOutOfBoundsException("it is grester then array length");
//	}
//	System.out.println(a[10]);
	
	
//	int n=24;
//	if(n>20)
//	{
//		throw new ArithmeticException("value is grater then 20");
//	}
//	System.out.println(n);
}
}

package Array;

public class Swap {
  public void replace(int a[])
  {
	  for(int i=0; i<a.length; i++)
	  {
		  if(a[i]==0)
		  {
			  a[i]=1;
		  }
	  }
  }
  public void  printArray(int []a)
  {
	  for(int i=0; i<a.length; i++)
	  {
		  System.out.println(a[i]);
	  }
	 System.out.println(); 
  }
  
  public static  void main(String args[])
  {
	  int a[]= {24,34,545,2,0,3,0,4,0,3};
	  
	  Swap ob=new Swap();
	  ob.printArray(a);
	  ob.replace(a);
	  System.out.println("Replace all 0 with 1");
	  ob.printArray(a);
	  
  }
}

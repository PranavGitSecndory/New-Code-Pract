//2.Given an array arr of size n and an integer X. 
//Find if there's a triplet in the array which sums up to the 
//given integer X.
package Thread_with_Exeption;
class Triplet
{
private int a[];
private int x;

public Triplet(int a[], int x)
{
	this.a=a;
	this.x=x;
}
public void findTriplet()
{
	
	for(int i =0;i<a.length-2; i++)
	{
		for(int j =i+1; j<a.length-1; j++)
		{
			for(int k =j+1;k<a.length; k++)
			{
				if(a[i]+a[j]+a[k] ==x)
				{
					System.out.println("triplet is a = ("+a[i]+","+a[j]+","+a[k]+")");
					
				}
			}
		}
	}
}
}

class Thread2 extends Thread
{
	private Triplet ob;
	
	public Thread2(Triplet ob)
	{
		this.ob=ob;
	}
		public void run()
		{
			ob.findTriplet();
		}
}
public class Q2 {
public static void main(String[] args) {
	int a[]= {2,4,5,6,8,9};
	int x=13;
	
	Triplet ob =new Triplet(a,x);
	Thread2 ob1 = new Thread2(ob);
	ob1.start();
}

}

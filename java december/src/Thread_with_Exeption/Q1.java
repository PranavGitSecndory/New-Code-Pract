//1.Given an array, rotate the array by one position 
//in clock-wise direction.
//Input:
//N = 5
//A[] = {1, 2, 3, 4, 5}
package Thread_with_Exeption;
class clock_wise extends Thread
{
	static void rotation()
	{
		int  a[]= {1,2,3,4,5};
		try {
            int l = a[a.length - 1];
            for (int i = a.length - 1; i > 0; i--) 
            {
                a[i] = a[i - 1];
            }
            a[0] = l
            		;
            
            System.out.print("Rotated Array: ");
            for (int num : a)
            {
                System.out.print(num + " ");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }	
	}
	public void run()
	{
		rotation();
	}
}
public class Q1 {
	
public static void main(String[] args) {
	clock_wise ob=new clock_wise();
	ob.start();
}
}

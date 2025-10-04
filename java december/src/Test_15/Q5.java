//Write a program to rotate an array by k steps to the right.
package Test_15;

public class Q5 {
	void rotateRight(int a[],int k)
	{
		 int n = a.length;
	        int[] result = new int[n];
	        k = k % n;

	        for (int i = 0; i < k; i++) {
	            result[i] = a[n - k + i];
	        }

	        for (int i = k; i < n; i++) {
	            result[i] = a[i - k];
	        }

	        System.out.println("Array after rotating right by " + k + " steps:");
	        for (int val : result) {
	            System.out.print(val + " ");
	        }
	}
public static void main(String[] args) {
	Q5 ob=new Q5();
	 int[] a = {1, 2, 3, 4, 5};
     int k = 2; 
     ob.rotateRight(a, k);
	
}
}

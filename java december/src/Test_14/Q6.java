//
//6.Merge two sorted arrays without using extra space.
//Use the swap + sort technique.
package Test_14;

import java.util.Arrays;

public class Q6 {
	static void merge(int a[],int b[])
	{
		int k=a.length;
		int m=b.length;
		
		int i = k - 1; 
        int j = 0;     

        while (i >= 0 && j < m) 
        {
            if (a[i] > b[j]) 
            {
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
            }
            i--;
            j++;
        }

       
        Arrays.sort(a);
        Arrays.sort(b);
	
	}
	public static void main(String[] args) {
		int a[]= {1,5,6,9};
		int b[]= {2,3,8,13};
		merge(a, b);

        System.out.println("Merged arrays:");
        System.out.println("arr1: " + Arrays.toString(a));
        System.out.println("arr2: " + Arrays.toString(b));

	}
}

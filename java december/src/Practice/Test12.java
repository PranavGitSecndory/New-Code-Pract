package Practice;

import java.util.Arrays;

import methods.Sort_array;

public class Test12 {
	static void mergearry(int a[],int b[])
	{
		Arrays.sort(a);
		Arrays.sort(b);
		
		int k=a.length; int m=b.length;
		int d[]=new int[k+m];
	    int l = 0, j = 0;
		
		 for (int i = 0; i< d.length; i++) 
		 {
	            if (l < k && (j >= m || a[l] < b[j]))
	            {
	                d[i] = a[l++];
	            } 
	            else
	            {
	            	d[i] = b[j++];
	            }
	        }
	        System.out.println("Merged array: " + Arrays.toString(d));
		}
	public static void main(String[] args)
	{
		int a[]= {3,4,5,1};
		int b[]= {4,6,8,7};
		mergearry(a,b);	
	}
}

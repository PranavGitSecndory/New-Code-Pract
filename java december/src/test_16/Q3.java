//6. Write a function that returns the maximum product of
//any two integers in an array.  
package test_16;

public class Q3
{
	  static int findMaxProduct(int[] arr)
	  {
	        int maxProduct = Integer.MIN_VALUE; 
	   
	        for (int i = 0; i < arr.length; i++) 
	        {
	            for (int j = i + 1; j < arr.length; j++) 
	            {
	                int product = arr[i] * arr[j]; 
	                if (product > maxProduct) 
	                {
	                    maxProduct = product; 
	                }
	            }
	        }

	        return maxProduct;
	    }
	  public static void main(String[] args)
	  {
		  int[] arr = {-10, -3, 5, 6, -2};
	        int result = findMaxProduct(arr);
	        System.out.println("Maximum product is: " + result);
	}
}

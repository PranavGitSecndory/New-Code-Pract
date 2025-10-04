//10. Write a recursive Java function to perform a binary 
//search on a sorted array.
package Recursition;

public class Q10 {
	 public static int binarySearch(int[] arr, int l, int r, int key) {
	        if (l > r)
	        {
	            return -1; 
	        }

	        int mid = (l + r) / 2;

	        if (arr[mid] == key)
	        {
	            return mid; 
	        } else if (key < arr[mid])
	        {
	            return binarySearch(arr, l, mid - 1, key); 
	        } else 
	        {
	            return binarySearch(arr, mid + 1, r, key); 
	        }
	    }

	    public static void main(String[] args)
	    {
	        int[] arr = {1, 3, 5, 7, 9, 11};
	        int key = 7;

	        int index = binarySearch(arr, 0, arr.length - 1, key);

	        if (index != -1)
	        {
	            System.out.println("Element found at index: " + index);
	        } else {
	            System.out.println("Element not found");
	        }
	    }
}

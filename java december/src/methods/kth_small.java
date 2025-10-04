package methods;
import java.util.Arrays;
public class kth_small {

	 public static void kthSmallest(int[] arr, int k) {
	        Arrays.sort(arr); // Sort the array
	        System.out.println( "Kth smallest element is: " +arr[k - 1]); // Return the Kth smallest element
	    }

	    public static void main(String[] args) {
	        int[] arr = {7, 10, 4, 3, 20, 15};
	        int k = 3;
	        kthSmallest(arr, k);
	    }
	
}

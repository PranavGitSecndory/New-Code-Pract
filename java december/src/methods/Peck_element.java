package methods;

public class Peck_element {
	  public static void findPeak(int[] arr, int n) {
	        for (int i = 0; i < n; i++) 
	        {
	            if ((i == 0 || arr[i] >= arr[i - 1]) && (i == n - 1 || arr[i] >= arr[i + 1]))
	            {
	                System.out.println("Peak Element: " +arr[i]);
	            }
	        }
	        
	    }

	    public static void main(String[] args) {
	        int[] arr = {5, 10, 20, 15};
	        int n = arr.length;
	        findPeak(arr, n);
	       
	    }
}

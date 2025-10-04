package Array;
public class Missing_number {
	
	    public static void main(String[] args)
	    {
	        int[] a = {1, 2, 4, 5, 3, 7, 8, 9}; 
	        
	        int n = a.length + 1; 

	        int totalSum = (n * (n + 1)) / 2; 

	        int aSum = 0; 
	        for (int i = 0; i < a.length; i++) 
	        {
	            aSum += a[i]; 
	        }

	        int misno = totalSum - aSum; 
	        System.out.println("Missing number is: " + misno);
	    }
	}







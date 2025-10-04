//2Find the maximum element in an array without using loops (use recursion).
package Test_14;

public class Q2 {
	static int findMax(int[] arr, int index) {
      
        if (index == arr.length - 1) {
            return arr[index];
        }

       
        int maxRest = findMax(arr, index + 1);

      
        if (arr[index] > maxRest) {
            return arr[index];
        } 
        else {
            return maxRest;
        }
	}
public static void main(String[] args) {
	   int[] numbers = {5, 8, 3, 10, 2};

      
       int max = findMax(numbers, 0);

       System.out.println("Maximum number is: " + max);
}
}

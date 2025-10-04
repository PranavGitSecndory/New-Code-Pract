package Array_return_method;
import java.util.Arrays;
public class Even_number {

	int[] inputArray(int arr[])
	{
		 int count =0;
		 for (int  i=0;i<arr.length;i++)
		 {
			 if (arr[i]%2 == 0)
			 {
				count++;	
			 } 
		 }
		 
		 int arr1[] = new int[count];
		 
		 int x = 0;
		 for (int  i=0;i<arr.length;i++)
		 {
			 if (arr[i]%2 == 0)
			 {
				 arr1[x++]= arr[i];	
			 }
		 }
		 return arr1;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,45,6,7,8,9,5,4,2};
		Even_number obj = new Even_number();
		
		int arr1[] = obj.inputArray(arr);
		
		System.out.println("Array even number is :"+Arrays.toString(arr1));
		
	}


}


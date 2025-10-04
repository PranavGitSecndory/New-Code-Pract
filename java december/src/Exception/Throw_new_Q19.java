//19. Implement a method that throws ArrayIndexOutOfBoundsException
//if an invalid index is accessed.  
package Exception;

public class Throw_new_Q19 {
	static void print() 
	{
		int arr[]= {1,3,4};
		int index =6;
        if (index < 0 || index >= arr.length) 
        {
            throw new ArrayIndexOutOfBoundsException("Invalid index: " + index);
        }
        System.out.println("Element at index " + index + ": " + arr[index]);
    }

public static void main(String[] args) {
	print();
}
}

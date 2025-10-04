package Practice;
import java.util.Arrays;
public class Sort_alternative_array {
	
	
public static void main(String[] args) {
	int a[]= {5,6,4,7,9,8,10,3,1,2};
	Arrays.sort(a);
	
	int l=a.length-1;
	int s=0;
	System.out.println("Soreted array is = ");

	
	for (int i = 0; i < a.length; i++) {
       
            System.out.print(a[l--] + " ");
        } 
            System.out.print(a[s++] + " "); 
        }
       


}


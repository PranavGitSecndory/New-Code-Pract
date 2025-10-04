//10. print the following pattern.
//
//
//     A1A
//    B2*2B
//   C3***3C
//  D4*****4D
// E5*******5E

package test_17;

public class Q2 {
public static void main(String[] args) {
	int n=5;
	for (int i = 0; i < n; i++) {
      
        for (int j = 0; j < n - i - 1; j++)
        {
            System.out.print(" ");
        }
        
     
        System.out.print((char)('A' + i));
        
       
        System.out.print(i + 1);
        
     
        for (int j = 0; j < 2 * i - 1; j++) {
            System.out.print("*");
        }
        
     
        if (i > 0) {
            System.out.print(i + 1);
        }
        
       
        if (i > 0) {
            System.out.print((char)('A' + i));
        }
        
     
        System.out.println();
    }

}
}

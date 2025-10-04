//7. Create a ProductNotFoundException for an e-commerce 
//application if the product ID is invalid.  
package Custom_Exeption;
import java.util.Scanner;
class ProductNotFound extends Exception
{
	ProductNotFound(String s)
	{
		super(s);
	}
}
public class Q7 {
	static void product(String id) throws ProductNotFound
	{
		if(id.isEmpty())
		{
			throw new ProductNotFound("Product id is invalid");
		}
		else
		{
			System.out.println("product is available");
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the product id");
	String id=sc.nextLine();
	try {
		product(id);
	} catch (Exception e) {
	System.out.println(e);
	}
}
}

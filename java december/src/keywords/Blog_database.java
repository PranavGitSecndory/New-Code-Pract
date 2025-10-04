/*
10. Create a class DatabaseConnection with a static block 
that prints "Database Connected" only once when the class is 
loaded. Create multiple objects and observe the output.
*/
package keywords;

public class Blog_database {
	
	Blog_database()
	{
		System.out.println("constructor");
	}
	{
		System.out.println("instance blog");
	}
	static 
	{
		System.out.println("databasce connect");
		Blog_database ob=new Blog_database();
	}
	
	public static void main(String[] args) {
		
		System.out.println("main metod");
		
	}
}

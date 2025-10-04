package Static;

public class static_variable {

	
   static int count ;

   static_variable ()
   {
	count++;
	System.out.println(count);
	}
	public static void main(String[] args) {
		static_variable ob=new static_variable();
		static_variable ob1=new static_variable();
		static_variable ob2=new static_variable();
		static_variable ob3=new static_variable();

	}
	

}

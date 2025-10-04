package String;

	class parent{
		void show(String s)
		{
			System.out.println("parent = "+s);
		}
	}
	class child extends parent
	{
		void show(String s)
		{
			System.out.println("child = "+s);
		}
	}
	
	public class Question10 {
		static void display( String m)
		{
			System.out.println("messange "+m);
		}
		static void display(String m,int a)
		{
			System.out.println("messange "+m);
		}
		
	public static void main(String[] args) {
		display("hello");
		display("nick",10);
		
		parent ob=new parent();
		ob.show("override example");
	}

}

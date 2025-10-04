package Static;

public class Second_code {
	
	
		int id;
		String name;
		static String cname="niska";
		
		Second_code(int id,String name)
		{
			this.id=id;
			this.name=name;
		}
		
		void print()
		{
			System.out.println(id+" "+name+" "+cname);
		}
		
		public static void main(String[] args) 
		{
			Second_code ob1=new Second_code (1,"Abc");
			ob1.print();
			Second_code ob2=new Second_code (2,"Bca");
			ob2.print();
			Second_code ob3=new Second_code (3,"abb");
			ob3.print();
		}

}

package constuctor;

public class Person {
	public static void main(String[] args) {
		Person ob=new Person();
		Person ob1=new Person("nick", 24);
	}
		public  Person()
		{
			System.out.println("default constructor");
		}
		public Person(String s, int a)
		{
			System.out.println("perarmeterize constroctor");
			System.out.println("name of person = "+s);
			System.out.println("age of person = "+a);
		}
	

}

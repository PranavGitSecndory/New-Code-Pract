package keywords;
class counter
{
	static int count=0;
	public counter()
	{
		count++;
	}
	void displaycount()
	{
		System.out.println("number of object is = "+count);
	}
}
public class static_incri_count {
public static void main(String[] args) {
	counter ob=new counter();
	counter ob1=new counter();
	counter ob2=new counter();
	counter ob3=new counter();
	ob3.displaycount();
}
}

package lamda;
interface Demo
{
	public void show();
}
public class Lamda_demo {
public static void main(String[] args) {
	Demo ob= ()->
	{
		System.out.println("This is my first lambda expression !!! ");
	};
	ob.show();
}
}

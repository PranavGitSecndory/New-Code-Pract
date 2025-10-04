package Practice;



class nikhil
{
	
public void sound() {

  System.out.println("Meow");
  }

}
class xyz extends nikhil
{
	
public void sound() {

  System.out.println("sssssssss");
  }

}
public class OverideClasss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nikhil n=new xyz();
		n.sound();

	}

}

package practice_pranav;

class CarDetails{
	
	String Brand;
	String Model;
	int Price;
	CarDetails(String Brand , String Model ,int Price)
	{
		this.Brand = Brand;
		this.Model=Model;
		this.Price=Price;
	}
	public void Car_Details()
	{
		System.out.println("Brand = "+Brand+" \nModel = "+Model+" \nPrice = "+Price);
	}
	
	
}
public class Car {	
public static void main(String args[])
{
 	CarDetails ob=new CarDetails( "Bmw" , "m4", 30);
 	//CarDetails ob1=new CarDetails( "Bmw" , "m4", 20);
//	ob.brand="BMW";
//	ob.Model="M4";
//	ob.Price=4000000;
//	ob.Car_Details();
	
	CarDetails ob1=new CarDetails("honda","City",20);	
//	ob1.brand="honda";
//	ob1.Model="city";
//	ob1.Price=2000000;
	ob1.Car_Details();
	ob.Car_Details();

	
	
}
}





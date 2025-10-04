
//1. Write a Java program to create a class Car 
//with attributes brand and price. Use encapsulation to set and get values.  
package Practice;
class Car {
	
	  private String brand;
	    private int price;
	    
	Car(String brand, int price)
	{
		this.brand=brand;
		this.price= price;	
	}
	 String getbrand()
	{
		return brand;
	}
	int getprice()
	{
		return price;
	}
}
public class Q1 {
public static void main(String[] args) {
	Car c = new Car("Toyota", 435335);

	System.out.println("The brand of the car is = " + c.getbrand());
    System.out.println("The price of the car is = " + c.getprice());
}}


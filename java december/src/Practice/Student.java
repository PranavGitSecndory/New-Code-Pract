package Practice;

public class Student {
	String name;
	double price;
	int quantity;
	Student(String name,double price, int quantity)
	{
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	double getTotelCost()
	{
		return price*quantity;
	}
	void display()
	{
		System.out.println(name+" - price="+price + " Quantity="+quantity +" total_cost = "+getTotelCost());
	}
	
	public static void main(String[] args) {
		
		 Student p1 = new Student("Laptop", 750.50, 2);
	       Student p2 = new Student("Phone", 500.00, 3);
	        
	        p1.display();
	        p2.display();
	}
}

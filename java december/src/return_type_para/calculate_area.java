package return_type_para;

public class calculate_area {
	public static void main(String args[])
	{
		calculate_area ob=new calculate_area();
		
		int a=ob.rectangle(10,20);
		System.out.println("area of rectangle = "+a);
		
		double b=ob.triangle(10,20);
		System.out.println("area of tringle = "+b);
		
		float c=ob.square(10);
		System.out.println("Area of square = "+c);
		
	}
	int rectangle(int a,int b)
	{
		return a*b;
	}
	
	double triangle(int a , int b)
	{
		return (a*b)/2;
	}
	
	float square(int a)
	{
		return a*a;
	}
}


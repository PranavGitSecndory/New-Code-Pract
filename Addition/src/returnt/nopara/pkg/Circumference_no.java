package returnt.nopara.pkg;
import java.util.Scanner;
public class Circumference_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 Circumference_no ob=new Circumference_no();
		 System.out.println("enter the area of circle");
		 int n=sc.nextInt();
		 double k=ob.curc(n);
		 System.out.println("area of circle is="+k);

	}
	public double curc(int n)
	{
		double pi=3.14;
		double area=pi*(n*n);
		return area;
	}

}

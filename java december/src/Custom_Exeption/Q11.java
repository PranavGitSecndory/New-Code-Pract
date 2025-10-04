//11. Create a TemperatureOutOfRangeException and
//throw it if the temperature exceeds 50°C or drops below -10°C.  
package Custom_Exeption;
import java.util.Scanner;
class TemperatureOutOfRange extends Exception
{
	TemperatureOutOfRange(String s)
	{
		super(s);
	}
}
public class Q11 {
	static void temprature(int temp) throws TemperatureOutOfRange
	{
		if(temp >50 || temp <-10)
		{
			throw new TemperatureOutOfRange("Temprature is at out of range");
		}
		else
		{
			System.out.println("valid temprature !");
		}
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the temprature");
	int temp=sc.nextInt();
	try {
		temprature(temp);
	} catch (Exception e) {
	System.out.println(e);
	}
}
}

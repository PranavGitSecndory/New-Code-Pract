package return_type_para;

public class simple_intrest {
	public static void main(String args[])
	{
		simple_intrest ob=new simple_intrest();
		double p=1000;
		double r=5;
		double t=2;
		
		double i=ob.check(p,r,t);
		System.out.println("simple intrest is = "+i);
	}
	double check(double p,double r, double t)
	{
		return (p*r*t)/100;
	}
}

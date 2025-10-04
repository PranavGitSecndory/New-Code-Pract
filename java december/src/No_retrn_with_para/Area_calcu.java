package No_retrn_with_para;

public class Area_calcu {
	public static void main(String[]arg)
	{
		Area_calcu ob=new Area_calcu();
		
		ob.areaoftriangle(20,30);
		ob.areaofrectangle(20,30);
		ob.arearofcircle(20);
		ob.area0fsquare(20);
	}
	
	void areaoftriangle(int h,int b)
	{
		
		double AT=(0.5)*b*h;
		System.out.println("area of trangle ="+AT);
	}
	void areaofrectangle(int a,int b)
	{
		int AR=a*b;
		System.out.println("area of rectangle is ="+AR);
	}
	void arearofcircle(double r)
	{
		double p=3.14;
		double AC=p*r*r;
		System.out.println("area of circle=" +AC);
	}
	void area0fsquare(int a)
	{
		int AS=a*a;
		System.out.println("arear of square is= "+AS);
	}
	
}

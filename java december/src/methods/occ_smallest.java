package methods;
import java.util.Scanner;
public class occ_smallest {
	public static void main(String []args)
	{
		occ_smallest ob=new occ_smallest();
		ob.smallocc();
	}
	void smallocc()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Element");
			int []a=new int[7];
			for(int i=0;i<a.length;i++)
			{
			a[i]=sc.nextInt();
			}	
		
			System.out.println("First repeated element is");
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(a[i]);
				break;
			}
		}

	}

}

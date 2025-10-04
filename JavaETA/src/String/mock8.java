	package String;
	import java.util.Scanner;
	
	public class mock8 {
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("entr the number");
			int n=sc.nextInt();
			int sum=0,sum2=0,oddCount=0,evenCount=0;
			System.out.println("Even Number Are");
			while(n!=0)
			{
				int rev=n%10;
				
				 if(rev%2!=0)
				 {
					 //System.out.println(rev);
					 sum=sum+rev;
					 oddCount++;
				 }
				 if(rev%2==0)
				 {
					 //System.out.println(rev);
					 sum2=sum2+rev;
					 evenCount++;
				 }
				n=n/10;
			
			}
					
			System.out.println("Sum of Even number and count "+sum2+"&"+evenCount);
			System.out.println("Sum of Odd number and count "+sum+"&"+oddCount);
				
			
		}
		
		
	
	}
		
	
	

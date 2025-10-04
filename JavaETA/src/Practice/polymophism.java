package Practice;

public class polymophism {
	
		void print()
		{
			for(int i=1; i<=100; i++)
			{
				System.out.print(i);
			}
		}
		void print(int start)
		{
			for(int i=start; i<=200; i++)
			{
				System.out.println(i);
			}
		}
		void print(int start , int end)
		{
			for(int i=start; i<=end; i++)
			{
				System.out.println(i);
			}
		}
		public static void main(String args[])
		{
			polymophism ob=new polymophism();
			ob.print(201,300);
		}
	}



	
	
	



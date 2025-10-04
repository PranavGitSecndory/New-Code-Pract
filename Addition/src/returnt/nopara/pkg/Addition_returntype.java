package returnt.nopara.pkg;

public class Addition_returntype {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Addition_returntype ob=new Addition_returntype();
			int m=20;
			int k=ob.addition(m);
			System.out.println(k);
		}
		public int addition(int m)
		{
			int a=10,b=20;
			int total=a+b+m;
			return total;
			
		}

	}



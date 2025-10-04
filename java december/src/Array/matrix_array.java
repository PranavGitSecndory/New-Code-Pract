package Array;

public class matrix_array {
	
	public static void main(String []args) {	
	int a[][]= {
			{1,2,3},
			{4,5,6},
			{7,8,9},
	};
	for(int i=a.length-1; i>=0; i--)
	{
		for(int j=a.length-1; j>=0; j--)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println();
	}
		
//	int a[][]= {
//			{11,22,33},
//			{44,55,66},
//			{77,88,99},
//	};
//	for (int i=a.length-1; i>=0; i--)
//	{ 
//		for(int j=0; j<a.length; j++)
//		{
//			System.out.print(a[j][i]+" ");
//		}
//		System.out.println();
//	}
}
}

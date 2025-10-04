//
//Q3. Extract the integers (Zoho)

//Input:
//s = "1: Prakhar Agrawal, 2: Manish Kumar Rai,
//3: Rishabh Gupta56"
//Output: 1 2 3 56
//Explanation:
//1, 2, 3, 56 are the integers present in s.
package Top_String_Interview;

public class Q3 {
public static void main(String[] args) {
	String s = "1: Prakhar Agrawal, 2: Manish Kumar Rai,3: Rishabh Gupta56";
	String num="";
	for(int i=0; i<s.length(); i++)
	{
		char ch =s.charAt(i);
		
		if(ch >='0' &&  ch<='9')
		{
			num= num+ch;
		}
		else
		{
			if (!num.equals(""))
			{
                System.out.print(num + " ");  
                num = "";
			}
		}
	}
	if(!num.equals(""))
	{
		System.out.println(num);
	}
	
}
}

package Practice;
class vovel extends Thread
{
	public synchronized void run()
	{
        String s = "flipkart";
        String v = ""; 

      
        for(int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);
            if ("aeiouAEIOU".indexOf(ch)!=-1)
            {
                v += ch;
            }
        }
        String result = "";
        int j = v.length() - 1;

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if("aeiouAEIOU".indexOf(ch) != -1)
            {
                result += v.charAt(j);
                j--;
            }
            else
            {
                result += ch;
            }
        }        
        System.out.println("Output: " + result);
    }
	
	}

public class ReverseVowelsSimple {
	public static void main(String[] args) {
		vovel ob=new vovel();
		ob.start();
	
	}}

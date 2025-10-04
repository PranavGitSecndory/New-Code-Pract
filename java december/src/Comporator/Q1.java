//2. Custom Comparator:
//Create a custom Comparator to sort a list of Strings
//based on their lengths in ascending order.
package Comporator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class List1 implements Comparator<List1>
{
	private String S;
	public List1 (String s) {
		this.S=s;
	}
	public String getS() {
		return S;
	}
	public void setS(String s) {
		S = s;
	}
	@Override
	public int compare(List1 o1, List1 o2) {
		if(o1.getS().length() == o2.getS().length())
		{
		return 0;
		}
		else if(o1.getS().length() < o2.getS().length())
		{
			return 1;
		}
		else
		{
			return -1;
		}
			
	}
}
public class Q1 {
public static void main(String[] args) {
	ArrayList<String> ob=new ArrayList();
	ob.add("pine apple");
	ob.add("apple");
	ob.add("chiku");
	ob.add("banana");
	
	System.out.println("before sort :"+ob);
	Collections.sort(ob);
	System.out.println("After sort :"+ob);
}
}

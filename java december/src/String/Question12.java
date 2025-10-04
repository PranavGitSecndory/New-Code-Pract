//12.Wap to show 1-1 example of these string methods:
package String;

public class Question12 {
	static void Q12()
	{
		String s="nikhil";
		String s1=" patil";
		String s2="      Nikhil";
		
		System.out.println(s.charAt(3));
		System.out.println(s.compareTo("Nikhil"));
		System.out.println(s.compareToIgnoreCase(s2));
		System.out.println(s.concat(s1));
		System.out.println(s2.trim());
	}
public static void main(String[] args) {
	Q12();
}
}

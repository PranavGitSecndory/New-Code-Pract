package String;

public class String_buffer {
	
	StringBuffer sb=new StringBuffer("=dj nick ");
	void length1()
	{
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.insert(0, false));
		System.out.println(sb.append("only"));
	}
	
	public static void main(String[] args) {
		String_buffer ob=new String_buffer();
		ob.length1();
	}
}

package hash;

import java.util.HashSet;

public class Hashcode_demo {
public static void main(String[] args) {
	HashSet<String > ob =new HashSet<String>();
	
	String s="Java";
	System.out.println(s + " = "+s.hashCode()%16); //index
	ob.add("java");
	
	s="python";
	System.out.println(s + " = "+s.hashCode()%16);
	ob.add("python");
	
	s="c";
	System.out.println(s + " = "+s.hashCode()%16);
	ob.add("c");
	
	 s="html";
	System.out.println(s + " = "+s.hashCode()%16);
	ob.add("html");
	
	System.out.println(ob);
}
}

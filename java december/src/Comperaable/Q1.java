//Sort an array of strings using Comparable.
//Create a class MyString that implements 
//Comparable<MyString>. Override compareTo() to sort strings
//in alphabetical order.
package Comperaable;

import java.util.ArrayList;
import java.util.Collections;

class MyString implements Comparable<MyString>
{
	private String S;

	public MyString (String s) {
	this.S=s;
	}

	public String getStr() {
        return S;
    }
	
	 public String toString() {
	        return S;
	    }
	public void setS(String s) {
		this.S = s;
	}
	@Override
	public int compareTo(MyString o) {
		// TODO Auto-generated method stub
		 return this.S.compareTo(o.getStr());
	}
	
	
}
public class Q1 {
public static void main(String[] args) {
	MyString ob=new MyString("mango");
	MyString ob1=new MyString("banana");
	MyString ob2=new MyString("Apple");
	MyString ob3=new MyString("chiku");
	
	ArrayList<MyString> obb= new ArrayList();
	
	obb.add(ob);
	obb.add(ob1);
	obb.add(ob2);
	obb.add(ob3);
	System.out.println("Before sort :\n"+obb);
	System.out.println("------------------------------");
	Collections.sort(obb);
	System.out.println("After Sort :\n"+obb);
}
}

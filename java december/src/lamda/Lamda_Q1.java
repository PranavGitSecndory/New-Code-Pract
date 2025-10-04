//1. Basic Lambda Syntax: Write a lambda expression
//to print "Hello, World!" and execute it.

//2. Sum of Two Numbers: Create a lambda expression that takes two 
//integers and returns their sum.
//
//3. String Length: Write a lambda expression that 
//takes a string and returns its length.
//
//4. Filter Even Numbers: Given a list of integers, 
//use a lambda expression to filter only even numbers.
package lamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface Print
{
	 public String print(String s);
}
interface Print2
{
	 public int print(int a, int b);
}
interface Print3
{
	 public int print(String s);
}
interface Print4
{
	void printEvens(List<Integer> nums);
}
public class Lamda_Q1 {
public static void main(String[] args) {
	Print ob = (s)->
	{
		return s;
	};
	  String s = "Hello, World!";
      String result = ob.print(s);  
      System.out.println(result);
      
    Print2 ob1 =(a,b)->
      {
    	 int sum=a+b;
    	  return sum;
      };
      int a = 20;
      int b = 30;
      int add = ob1.print(a, b);  
      System.out.println("Adition is : "+add);
	
      
      Print3 ob2 =(k)->
      {
    	  return k.length();
      };
      String k="nikhil";
     int length =ob2.print(k);
      System.out.println("Length of String is : "+length);
      
      
      List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
      Print4 f1 = (list)->
      {
    	  for(int num : list)
    	  {
    		  if(num %2==0)
    		  {
    			  System.out.print(" "+num);
    		  }
    	  }
      };
      System.out.println("even number is : ");
      f1.printEvens(nums);
   

}
}

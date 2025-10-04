//3. Multiple Sorting Criteria:
//Define a class representing a Book with attributes
//like title, author, and publication year. 
//Implement both Comparable and a custom Comparator 
//to sort a list of Books first by author and then by
//publication year.
package Comporator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Book implements Comparable<Book>
{
	private String title;
	private String author;
	private int year;
	
	public Book(String title, String author, int year)
	{
		this.title=title;
		this.author=author;
		this.year=year;
	}

	public String getTitle()
	{
		return title;
	}

	public String getAuthor()
	{
		return author;
	}

	public int getYear()
	{
		return year;
	}
	@Override
	public int compareTo(Book o) {
		return this.title.compareTo(o.title);
	}
	public String toString()
	{
		return "\nTitle: " + title + ", Author: " + author + ", Year: " + year;

	}
}
class AuthorYearComparator implements Comparator<Book>
{
	 public int compare(Book b1, Book b2)
	    {
	        if (b1.getYear() == b2.getYear()) 
	        {
	            return 0;
	        }
	        else if(b1.getYear() > b2.getYear())
	        {
	        	return 1;
	        }
	        else
	        {
	        	return -1;
	        }
	    }

}
public class Q2 {
public static void main(String[] args) {
	ArrayList<Book> books =new ArrayList();
	books.add(new Book("Java Programming", "John Doe", 2015));
    books.add(new Book("Advanced Java", "Jane Smith", 2018));
    books.add(new Book("Java Basics", "John Doe", 2012));
    books.add(new Book("Data Structures", "Alice Brown", 2010));
    
    System.out.println("Before Sorting:");
    System.out.println(books);

    System.out.println("\nSorting by Title (natural order):");
    Collections.sort(books); 
    System.out.println(books);

    System.out.println("\nSorting by Author, then Year:");
    Collections.sort(books, new AuthorYearComparator()); 
    System.out.println(books);

}
}

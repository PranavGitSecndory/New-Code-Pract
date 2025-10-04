package collection;
public class Emp implements Comparable <Emp>
 {
	private int id;
	private String name;
	private int salary;
	
	public int getId()
	{
		return id;
	}
	public void setId()
	{
		this.id=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName()
	{
		this.name=name;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setSalary()
	{
		this.salary=salary;
	}
	
	Emp(int id, String name, int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int compareTo(Emp ob)
	{
		return this.getName().compareTo(name);
	}
	


}

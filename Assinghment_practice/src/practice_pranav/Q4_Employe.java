//Q4: Create an Employee class with private fields (id, name, salary). Use getters/setters.
//Encapsulation
package practice_pranav;
class Employee
{
	private int  id;
	private String name;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int Id) {
		id = Id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary!");
        }
	}
}



public class Q4_Employe {
	public static void main(String args[]) {

	Employee data=new Employee();
	
	data.setId(1);
	data.setName("Nikhil");
	data.setSalary(1000.111111);
	
	System.out.println(data.getId());
	System.out.println(data.getName());
	System.out.println(data.getSalary());
	}
}

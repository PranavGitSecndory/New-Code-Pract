package Practice;

public class Employe {
	String name;
	int id;
	double salary;
	
	Employe(String name, int id, double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
void display()
{
	System.out.println(name+" - id = "+id+" Salary="+salary);
}
public static void main(String[] args) {
	 Employe[] employees = {
	            new Employe("nick", 101, 50000),
	            new Employe("pranav", 102, 75000),
	            new Employe("sagar", 103, 60000),
	            new Employe("mayur", 104, 90000) 
	        };
	    Employe highestPaid = employees[0];
	    for (Employe e : employees) {
            if (e.salary > highestPaid.salary) {
                highestPaid = e;
            }
        }
	    System.out.println("Employee with the highest salary:");
        highestPaid.display();
}
}

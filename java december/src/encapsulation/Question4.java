package encapsulation;

public class Question4 {

	    private int id;
	    private double salary;

	    public void setId(int id) {
	        this.id = id;
	    }

	    public void setSalary(double salary) {
	        if (salary > 0) {
	            this.salary = salary;
	        } else {
	            System.out.println("Salary must be positive.");
	        }
	    }

	    public int getId() {
	        return id;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public static void main(String[] args) {
	    	Question4 emp = new Question4();
	        emp.setId(101);
	        emp.setSalary(50000);

	        System.out.println("Employee ID: " + emp.getId());
	        System.out.println("Salary: " + emp.getSalary());
	    }
	}



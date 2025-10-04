package encapsulation;

public class Question5 {
	
	    private String name;
	    private int rollNumber;

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setRollNumber(int rollNumber) {
	        this.rollNumber = rollNumber;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getRollNumber() {
	        return rollNumber;
	    }

	    public static void main(String[] args) {
	    	Question5 student = new Question5();
	        student.setName("nikhil");
	        student.setRollNumber(101);

	        System.out.println("Student Name: " + student.getName());
	        System.out.println("Roll Number: " + student.getRollNumber());
	    }
	}



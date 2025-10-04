package encapsulation;

public class Question1 {
	    private String name;
	    private int age;
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public int getAge() {
	        return age;
	    }


	    public void setAge(int age) {
	        if (age > 0) {
	            this.age = age;
	        } else {
	            System.out.println("Age must be positive.");
	        }
	    }

	    public static void main(String[] args) {
	    	Question1 p = new Question1();
	        p.setName("John");
	        p.setAge(25);

	        System.out.println("Name: " + p.getName());
	        System.out.println("Age: " + p.getAge());
	    }
	}



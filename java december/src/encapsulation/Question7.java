package encapsulation;

public class Question7 {
	 
	    private int age;

	    public void setAge(int age) {
	        if (age > 0) {
	            this.age = age;
	        } else {
	            System.out.println("Age cannot be negative or zero.");
	        }
	    }

	    public int getAge() {
	        return age;
	    }

	    public static void main(String[] args) {
	    	Question7 person = new Question7();
	        person.setAge(25);
	        System.out.println("Age: " + person.getAge());

	        person.setAge(-5);
	        System.out.println("Age: " + person.getAge());
	    }
	

}

package Practice;
	class Parent {
	    void show() {
	        System.out.println("This is the Parent class");
	    }
	}

	class Child extends Parent {
	    @Override
	    void show() 
	    {  // Overriding the method
	    	
	        System.out.println("This is the Child class");

	    }
	
	}
	 
	   
		 public class Test6 
		 { 
			 public static void main(String[] args) {
		 
			    Parent obj = new Child(); // Runtime polymorphism
				 
			    obj.show(); // Calls Child's overridden method
		 }
		 }
	
		 


